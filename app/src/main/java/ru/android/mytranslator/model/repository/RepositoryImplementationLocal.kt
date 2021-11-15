package ru.android.mytranslator.model.repository

import ru.android.mytranslator.model.data.AppState
import ru.android.mytranslator.model.data.DataModel
import ru.android.mytranslator.model.datasource.DataSourceLocal

class RepositoryImplementationLocal(private val dataSource: DataSourceLocal<List<DataModel>>) :
    RepositoryLocal<List<DataModel>> {

    override suspend fun getData(word: String): List<DataModel> {
        return dataSource.getData(word)
    }

    override suspend fun saveToDB(appState: AppState) {
        dataSource.saveToDB(appState)
    }
}