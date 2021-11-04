package ru.android.mytranslator.di

import dagger.Module
import dagger.Provides
import ru.android.mytranslator.Contract
import ru.android.mytranslator.model.data.DataModel
import ru.android.mytranslator.model.datasource.RetrofitImplementation
import ru.android.mytranslator.model.datasource.RoomDataBaseImplementation
import ru.android.mytranslator.model.repository.RepositoryImplementation
import javax.inject.Named
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    @Named(NAME_REMOTE)
    internal fun provideRepositoryRemote(@Named(NAME_REMOTE) dataSourceRemote: Contract.DataSource<List<DataModel>>):
            Contract.Repository<List<DataModel>> = RepositoryImplementation(dataSourceRemote)

    @Provides
    @Singleton
    @Named(NAME_LOCAL)
    internal fun provideRepositoryLocal(@Named(NAME_LOCAL) dataSourceLocal: Contract.DataSource<List<DataModel>>):
            Contract.Repository<List<DataModel>> = RepositoryImplementation(dataSourceLocal)

    @Provides
    @Singleton
    @Named(NAME_REMOTE)
    internal fun provideDataSourceRemote(): Contract.DataSource<List<DataModel>> =
        RetrofitImplementation()

    @Provides
    @Singleton
    @Named(NAME_LOCAL)
    internal fun provideDataSourceLocal(): Contract.DataSource<List<DataModel>> =
        RoomDataBaseImplementation()
}