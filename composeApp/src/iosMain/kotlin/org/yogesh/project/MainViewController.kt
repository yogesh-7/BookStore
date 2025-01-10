package org.yogesh.project

import androidx.compose.ui.window.ComposeUIViewController
import org.yogesh.project.app.App
import org.yogesh.project.di.initKoin


fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) { App() }