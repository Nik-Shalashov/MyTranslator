package ru.android.mytranslator.presenter

import io.reactivex.Observable
import ru.android.mytranslator.Contract
import ru.android.mytranslator.model.data.AppState
import ru.android.mytranslator.model.data.DataModel

class MainInteractor(
    private val remoteRepository: Contract.Repository<List<DataModel>>,
    private val localRepository: Contract.Repository<List<DataModel>>
) : Contract.Interactor<AppState> {

    override fun getData(word: String, fromRemoteSource: Boolean): Observable<AppState> {
        return if (fromRemoteSource) {
            remoteRepository.getData(word).map { AppState.Success(it) }
        } else {
            localRepository.getData(word).map { AppState.Success(it) }
        }
    }
}