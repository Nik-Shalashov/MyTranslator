package ru.android.mytranslator.model.datasource

import ru.android.mytranslator.Contract
import ru.android.mytranslator.model.data.DataModel

class RoomDataBaseImplementation : Contract.DataSource<List<DataModel>> {

    override suspend fun getData(word: String): List<DataModel> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}