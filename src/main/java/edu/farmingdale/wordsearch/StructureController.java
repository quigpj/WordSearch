package edu.farmingdale.wordsearch;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

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
    @FXML
    private TextField outputBodyField;
    @FXML
    private Button bodyButton;
    @FXML
    private Button wordButton;
    String input;
    String searchKey;
    ArrayList<String> inputX = new ArrayList<>();

    public void uplink(ActionEvent actionEvent) {
        input = inputBodyField.getText();
        splice(input);
    }

    public void catchWord(ActionEvent actionEvent) {
        searchKey = wordField.getText();

    }

    public void splice(String input) {
        String[] interim = input.split(" ");
    }
}
