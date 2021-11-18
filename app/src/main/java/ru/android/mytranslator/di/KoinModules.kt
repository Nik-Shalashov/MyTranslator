package ru.android.mytranslator.di

import androidx.room.Room
import org.koin.dsl.module
import ru.android.mytranslator.Contract
import ru.android.mytranslator.model.data.DataModel
import ru.android.mytranslator.model.datasource.RetrofitImplementation
import ru.android.mytranslator.model.datasource.RoomDataBaseImplementation
import ru.android.mytranslator.model.repository.RepositoryImplementation
import ru.android.mytranslator.model.repository.RepositoryImplementationLocal
import ru.android.mytranslator.model.repository.RepositoryLocal
import ru.android.mytranslator.room.HistoryDataBase
import ru.android.mytranslator.view.history.HistoryInteractor
import ru.android.mytranslator.view.history.HistoryViewModel
import ru.android.mytranslator.view.main.MainInteractor
import ru.android.mytranslator.view_model.MainViewModel

val application = module {
    single { Room.databaseBuilder(get(), HistoryDataBase::class.java, "HistoryDB").build() }
    single { get<HistoryDataBase>().historyDao() }
    single<Contract.Repository<List<DataModel>>> { RepositoryImplementation(RetrofitImplementation()) }
    single<RepositoryLocal<List<DataModel>>> { RepositoryImplementationLocal(RoomDataBaseImplementation(get()))
    }
}

val mainScreen = module {
    factory { MainViewModel(get()) }
    factory { MainInteractor(get(), get()) }
}

val historyScreen = module {
    factory { HistoryViewModel(get()) }
    factory { HistoryInteractor(get(), get()) }
}