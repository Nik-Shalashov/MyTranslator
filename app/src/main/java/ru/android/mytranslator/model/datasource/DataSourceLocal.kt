package ru.android.mytranslator.model.datasource

import ru.android.mytranslator.Contract
import ru.android.mytranslator.model.data.AppState

interface DataSourceLocal<T> : Contract.DataSource<T> {

    suspend fun saveToDB(appState: AppState)
}