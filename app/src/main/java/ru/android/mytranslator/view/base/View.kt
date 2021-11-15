package ru.android.mytranslator.view.base

import ru.android.mytranslator.model.data.AppState

interface View {

    fun renderData(appState: AppState)

}