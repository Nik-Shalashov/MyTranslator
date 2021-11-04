package ru.android.mytranslator.model.datasource

import io.reactivex.Observable
import ru.android.mytranslator.Contract
import ru.android.mytranslator.model.data.DataModel

class DataSourceLocal(private val remoteProvider: RoomDataBaseImplementation = RoomDataBaseImplementation()) :
    Contract.DataSource<List<DataModel>> {

    override fun getData(word: String): Observable<List<DataModel>> = remoteProvider.getData(word)
}