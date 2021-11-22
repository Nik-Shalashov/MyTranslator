package ru.android.mytranslator.model.repository

import ru.android.mytranslator.Contract
import ru.android.mytranslator.model.data.DataModel

class RepositoryImplementation(private val dataSource: Contract.DataSource<List<DataModel>>) :
    Contract.Repository<List<DataModel>> {

    override suspend fun getData(word: String): List<DataModel> {
        return dataSource.getData(word)
    }
}