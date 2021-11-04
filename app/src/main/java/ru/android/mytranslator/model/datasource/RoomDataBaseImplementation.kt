package ru.android.mytranslator.model.datasource

import io.reactivex.Observable
import ru.android.mytranslator.Contract
import ru.android.mytranslator.model.data.DataModel

class RoomDataBaseImplementation : Contract.DataSource<List<DataModel>> {

    override fun getData(word: String): Observable<List<DataModel>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}