package ru.android.mytranslator.view_model

import androidx.lifecycle.LiveData
import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableObserver
import ru.android.mytranslator.model.data.AppState
import ru.android.mytranslator.model.datasource.DataSourceLocal
import ru.android.mytranslator.model.datasource.DataSourceRemote
import ru.android.mytranslator.model.repository.RepositoryImplementation
import ru.android.mytranslator.presenter.MainInteractor
import ru.android.mytranslator.utils.parseSearchResults
import javax.inject.Inject

class MainViewModel @Inject constructor(private val interactor: MainInteractor) :
    BaseViewModel<AppState>() {

    private var appState: AppState? = null

    fun subscribe(): LiveData<AppState> {
        return liveDataForViewToObserve
    }

    override fun getData(word: String, isOnline: Boolean) {
        compositeDisposable.add(
            interactor.getData(word, isOnline)
                .subscribeOn(schedulerProvider.io())
                .observeOn(schedulerProvider.ui())
                .doOnSubscribe(doOnSubscribe())
                .subscribeWith(getObserver())
        )
    }

    private fun doOnSubscribe(): (Disposable) -> Unit =
        { liveDataForViewToObserve.value = AppState.Loading(null) }

    private fun getObserver(): DisposableObserver<AppState> {
        return object : DisposableObserver<AppState>() {

            override fun onNext(state: AppState) {
                appState = parseSearchResults(state)
                liveDataForViewToObserve.value = appState
            }

            override fun onError(e: Throwable) {
                liveDataForViewToObserve.value = AppState.Error(e)
            }

            override fun onComplete() {
            }
        }
    }
}