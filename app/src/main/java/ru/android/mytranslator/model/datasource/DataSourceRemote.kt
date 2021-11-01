package ru.android.mytranslator.model.datasource

import io.reactivex.Observable
import ru.android.mytranslator.Contract
import ru.android.mytranslator.model.data.DataModel

class DataSourceRemote(private val remoteProvider: RetrofitImplementation = RetrofitImplementation()) :
    Contract.DataSource<List<DataModel>> {

    override fun getData(word: String): Observable<List<DataModel>> = remoteProvider.getData(word)
}