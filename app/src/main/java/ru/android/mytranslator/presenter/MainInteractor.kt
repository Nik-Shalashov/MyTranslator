package ru.android.mytranslator.presenter

import io.reactivex.Observable
import ru.android.mytranslator.Contract
import ru.android.mytranslator.di.NAME_LOCAL
import ru.android.mytranslator.di.NAME_REMOTE
import ru.android.mytranslator.model.data.AppState
import ru.android.mytranslator.model.data.DataModel
import javax.inject.Inject
import javax.inject.Named

class MainInteractor @Inject constructor(
    @Named(NAME_REMOTE) val repositoryRemote: Contract.Repository<List<DataModel>>,
    @Named(NAME_LOCAL) val repositoryLocal: Contract.Repository<List<DataModel>>
) : Contract.Interactor<AppState> {

    override fun getData(word: String, fromRemoteSource: Boolean): Observable<AppState> {
        return if (fromRemoteSource) {
            repositoryRemote
        } else {
            repositoryLocal
        }.getData(word).map { AppState.Success(it) }
    }
}