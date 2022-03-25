package ca.pragmaticcoding.widgetsfx;

import javafx.beans.value.ObservableStringValue;
import javafx.scene.control.Label;

public class TextWidgets {

    public static Label StyledLabel(String textValue, String styleClass) {
        Label results = new Label(textValue);
        results.getStyleClass().add(styleClass);
        return results;
    }

    public static Label StyledLabel(ObservableStringValue textValue, String styleClass) {
        Label results = StyledLabel("", "label-h1");
        results.textProperty().bind(textValue);
        return results;
    }

    public static Label h1Label(ObservableStringValue textValue) {
        return StyledLabel(textValue, "label-h1");
    }

    public static Label h1Label(String textValue) {
        return StyledLabel(textValue, "label-h1");
    }

    public static Label h2Label(String textValue) {
        return StyledLabel(textValue, "label-h2");
    }

    public static Label h2Label(ObservableStringValue textValue) {
        return StyledLabel(textValue, "label-h2");
    }

    public static Label h3Label(String textValue) {
        return StyledLabel(textValue, "label-h3");
    }

    public static Label h3Label(ObservableStringValue textValue) {
        return StyledLabel(textValue, "label-h3");
    }

    public static Label h4Label(String textValue) {
        return StyledLabel(textValue, "label-h4");
    }

    public static Label h4Label(ObservableStringValue textValue) {
        return StyledLabel(textValue, "label-h4");
    }

    public static Label promptLabel(String textValue) {
        return StyledLabel(textValue, "label-prompt");
    }

    public static Label promptLabel(ObservableStringValue textValue) {
        return StyledLabel(textValue, "label-prompt");
    }

    public static Label dataLabel(String textValue) {
        return StyledLabel(textValue, "label-data");
    }

    public static Label dataLabel(ObservableStringValue textValue) {
        return StyledLabel(textValue, "label-data");
    }


}
