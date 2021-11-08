package ru.android.mytranslator.di

import org.koin.core.qualifier.named
import org.koin.dsl.module
import ru.android.mytranslator.Contract
import ru.android.mytranslator.model.data.DataModel
import ru.android.mytranslator.model.datasource.RetrofitImplementation
import ru.android.mytranslator.model.datasource.RoomDataBaseImplementation
import ru.android.mytranslator.model.repository.RepositoryImplementation
import ru.android.mytranslator.view.main.MainInteractor
import ru.android.mytranslator.view_model.MainViewModel

val application = module {
    single<Contract.Repository<List<DataModel>>>(named(NAME_REMOTE)) { RepositoryImplementation(
        RetrofitImplementation()
    ) }
    single<Contract.Repository<List<DataModel>>>(named(NAME_LOCAL)) { RepositoryImplementation(
        RoomDataBaseImplementation()
    ) }
}

val mainScreen = module {
    factory { MainInteractor(get(named(NAME_REMOTE)), get(named(NAME_LOCAL))) }
    factory { MainViewModel(get()) }
}