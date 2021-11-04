package ru.android.mytranslator.di

import dagger.Module
import dagger.Provides
import ru.android.mytranslator.Contract
import ru.android.mytranslator.model.data.DataModel
import ru.android.mytranslator.presenter.MainInteractor
import javax.inject.Named

@Module
class InteractorModule {

    @Provides
    internal fun provideInteractor(
        @Named(NAME_REMOTE) repositoryRemote: Contract.Repository<List<DataModel>>,
        @Named(NAME_LOCAL) repositoryLocal: Contract.Repository<List<DataModel>>
    ) = MainInteractor(repositoryRemote, repositoryLocal)
}