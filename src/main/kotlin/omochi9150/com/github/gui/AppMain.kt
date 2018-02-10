package omochi9150.com.github.gui

import javafx.application.Application
import javafx.stage.Stage

class AppMain:Application(){

    override fun start(primaryStage: Stage) {
        primaryStage.title = "時間割"
        primaryStage.width = 800.0
        primaryStage.height = 600.0
        primaryStage.show()
    }
}