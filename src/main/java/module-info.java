module edu.farmingdale.wordsearch {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens edu.farmingdale.wordsearch to javafx.fxml;
    exports edu.farmingdale.wordsearch;
}
