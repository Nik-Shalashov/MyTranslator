package ru.android.mytranslator.model.repository

import ru.android.mytranslator.Contract
import ru.android.mytranslator.model.data.AppState

interface RepositoryLocal<T> : Contract.Repository<T> {

    suspend fun saveToDB(appState: AppState)
}