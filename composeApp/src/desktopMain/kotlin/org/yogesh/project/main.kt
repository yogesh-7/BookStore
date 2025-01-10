package org.yogesh.project

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.yogesh.project.app.App
import org.yogesh.project.di.initKoin


fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "BookStore",
        ) {
            App()
        }
    }
}