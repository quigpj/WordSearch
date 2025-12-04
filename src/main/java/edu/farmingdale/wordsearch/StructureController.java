package edu.farmingdale.wordsearch;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


/**
 * FXML Controller class
 *
 * @author quigpj
 */
public class StructureController {
    @FXML
    private TextField inputBodyField;
    @FXML
    private TextField wordField;
    @FXML
    private TextField wordCountField;
    private String input;

    public void uplink() {
        input = inputBodyField.getText();
    }

    public void catchWord() {
        String searchKey = wordField.getText();
        int count = 0;

        Pattern pattern = Pattern.compile("\\b" + searchKey + "\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("");
        
        try {
            matcher = pattern.matcher(input);
        } catch (NullPointerException nullPointerException) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.show();
        }
        
        while (matcher.find())
            count++;

        wordCountField.setText(Integer.toString(count));
    }
}
