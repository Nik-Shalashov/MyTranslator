package ru.android.mytranslator

import io.reactivex.Observable
import ru.android.mytranslator.model.data.AppState

class Contract {

    interface View {
        fun renderData(appState: AppState)
    }

    interface Presenter<T : AppState, V : View> {
        fun attachView(view: V)
        fun detachView(view: V)
        fun getData(word: String, isOnline: Boolean)
    }

    interface Interactor<T> {
        fun getData(word: String, fromRemoteSource: Boolean): Observable<T>
    }

    interface Repository<T> {
        fun getData(word: String): Observable<T>
    }

    interface DataSource<T> {
        fun getData(word: String): Observable<T>
    }
}