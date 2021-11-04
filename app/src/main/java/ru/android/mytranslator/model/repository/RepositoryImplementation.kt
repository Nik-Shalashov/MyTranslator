package ru.android.mytranslator.model.repository

import io.reactivex.Observable
import ru.android.mytranslator.Contract
import ru.android.mytranslator.model.data.DataModel

class RepositoryImplementation(private val dataSource: Contract.DataSource<List<DataModel>>) :
    Contract.Repository<List<DataModel>> {

    override fun getData(word: String): Observable<List<DataModel>> {
        return dataSource.getData(word)
    }
}