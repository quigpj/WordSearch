package edu.farmingdale.wordsearch;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.regex.*;

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
    String input;
    String searchKey;

    public void uplink() {
        input = inputBodyField.getText();
    }
    
    public void catchWord() {
        searchKey = wordField.getText();

        int count = 0;

        Pattern pattern = Pattern.compile("\\b" + searchKey + "\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            count++;

        }

        wordCountField.setText(Integer.toString(count));
    }
}
