package ru.android.mytranslator.view.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.android.mytranslator.Contract
import ru.android.mytranslator.model.data.AppState

abstract class BaseActivity<T : AppState> : AppCompatActivity(), Contract.View {

    protected lateinit var presenter: Contract.Presenter<T, Contract.View>

    protected abstract fun createPresenter(): Contract.Presenter<T, Contract.View>

    abstract override fun renderData(appState: AppState)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = createPresenter()
    }

    override fun onStart() {
        super.onStart()
        presenter.attachView(this)
    }

    override fun onStop() {
        super.onStop()
        presenter.detachView(this)
    }
}