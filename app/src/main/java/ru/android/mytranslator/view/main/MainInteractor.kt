package ru.android.mytranslator.view.main

import ru.android.mytranslator.Contract
import ru.android.mytranslator.model.data.AppState
import ru.android.mytranslator.model.data.DataModel

class MainInteractor(
    private val repositoryRemote: Contract.Repository<List<DataModel>>,
    private val repositoryLocal: Contract.Repository<List<DataModel>>
) : Contract.Interactor<AppState> {

    override suspend fun getData(word: String, fromRemoteSource: Boolean): AppState {
        return AppState.Success(
            if (fromRemoteSource) {
                repositoryRemote
            } else {
                repositoryLocal
            }.getData(word)
        )
    }
}