package ca.pragmaticcoding.starterfx;

import ca.pragmaticcoding.widgetsfx.text.Labels;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Objects;

public class StarterApplication extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Starter Application");
        stage.setScene(new Scene(createContent()));
        stage.show();
    }

    private Region createContent() {
        Label label = Labels.h1("Starter Application");
        label.getStyleClass().add("red-box-label");
        Button button = new Button("Hello World!");
        button.setDefaultButton(true);
        VBox vBox = new VBox(label,
                Labels.h2("Hello World!"),
                Labels.h3("Hello World!"),
                Labels.h4("Hello World!"),
                new HBox(5, Labels.prompt("Hello: "), Labels.data("World!")),
                button,
                new TextField("Hello World"));
        vBox.setPadding(new Insets(40));
        vBox.getStyleClass().add("standard-border");
        VBox outerVBox = new VBox(vBox);
        outerVBox.getStylesheets().add(Objects.requireNonNull(Main.class.getResource("/css/starter.css")).toString());
        outerVBox.getStylesheets().add(Objects.requireNonNull(Main.class.getResource("/css/widgetsfx.css")).toString());
        outerVBox.setPadding(new Insets(20));
        return outerVBox;
    }
}