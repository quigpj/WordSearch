package edu.farmingdale.wordsearch;

import java.awt.*;
import java.util.ArrayList;

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
    ArrayList<String> strList = new ArrayList<>();

    public void uplink(ActionEvent actionEvent) {
        input = inputBodyField.getText();
        System.out.println("success!");
    }

    public void catchWord(ActionEvent actionEvent) {
    }
}
