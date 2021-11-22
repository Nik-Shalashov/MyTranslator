package ru.android.mytranslator.view.main

import ru.android.mytranslator.Contract
import ru.android.mytranslator.model.data.AppState
import ru.android.mytranslator.model.data.DataModel
import ru.android.mytranslator.model.repository.RepositoryLocal

class MainInteractor(
    private val repositoryRemote: Contract.Repository<List<DataModel>>,
    private val repositoryLocal: RepositoryLocal<List<DataModel>>
) : Contract.Interactor<AppState> {

    override suspend fun getData(word: String, fromRemoteSource: Boolean): AppState {
        val appState: AppState
        if (fromRemoteSource) {
            appState = AppState.Success(repositoryRemote.getData(word))
            repositoryLocal.saveToDB(appState)
        } else {
            appState = AppState.Success(repositoryLocal.getData(word))
        }
        return appState
    }
}