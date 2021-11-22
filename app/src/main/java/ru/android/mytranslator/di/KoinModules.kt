package ru.android.mytranslator.di

import androidx.room.Room
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import ru.android.mytranslator.Contract
import ru.android.mytranslator.model.datasource.RetrofitImplementation
import ru.android.mytranslator.model.datasource.RoomDataBaseImplementation
import ru.android.mytranslator.model.repository.RepositoryImplementation
import ru.android.mytranslator.model.repository.RepositoryImplementationLocal
import ru.android.mytranslator.model.repository.RepositoryLocal
import ru.android.mytranslator.room.HistoryDataBase
import ru.android.mytranslator.view.history.HistoryActivity
import ru.android.mytranslator.view.history.HistoryInteractor
import ru.android.mytranslator.view.history.HistoryViewModel
import ru.android.mytranslator.view.main.MainActivity
import ru.android.mytranslator.view.main.MainInteractor
import ru.android.mytranslator.view_model.MainViewModel

val application = module {
    single { Room.databaseBuilder(get(), HistoryDataBase::class.java, "HistoryDB").build() }
    single { get<HistoryDataBase>().historyDao() }
    single<Contract.Repository<List<SearchResultDto>>> { RepositoryImplementation(RetrofitImplementation()) }
    single<RepositoryLocal<List<SearchResultDto>>> {
        RepositoryImplementationLocal(RoomDataBaseImplementation(get()))
    }
}

val mainScreen = module {
    scope(named<MainActivity>()) {
        scoped { MainInteractor(get(), get()) }
        viewModel { MainViewModel(get()) }
    }
}

val historyScreen = module {
    scope(named<HistoryActivity>()) {
        scoped { HistoryInteractor(get(), get()) }
        viewModel { HistoryViewModel(get()) }
    }
}