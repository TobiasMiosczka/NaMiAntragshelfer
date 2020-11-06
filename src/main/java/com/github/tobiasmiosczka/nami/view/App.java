package com.github.tobiasmiosczka.nami.view;

import com.github.tobiasmiosczka.nami.util.FileEncodingUtil;
import com.github.tobiasmiosczka.nami.util.VersionUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class App extends Application {

    private static final String TITLE = "NaMi-Antragshelfer " + VersionUtil.VERSION;
    private static final double MIN_WIDTH = 800D;
    private static final double MIN_HEIGHT = 500D;

    public static void main(String[] args) {
        try {
            FileEncodingUtil.setFileEncoding("UTF-8");
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
        App.launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle(TITLE);
        stage.setMinWidth(MIN_WIDTH);
        stage.setMinHeight(MIN_HEIGHT);
        stage.getIcons().add(new Image(Objects.requireNonNull(App.class.getClassLoader().getResourceAsStream("gui/icon.png"))));
        stage.setScene(new Scene(new FXMLLoader(App.class.getClassLoader().getResource("gui/primary.fxml")).load()));
        stage.show();
    }
}