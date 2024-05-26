package com.bgmea.calculatormaking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CalculatorMakingFirstTimeController
{
    @javafx.fxml.FXML
    private TextField inputNumberOne;
    @javafx.fxml.FXML
    private TextField inputNumberTwo;
    @javafx.fxml.FXML
    private TextArea showoutputHere;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    public void oneClickToadd(ActionEvent actionEvent) {
        int num1,num2,total;
        num1=Integer.parseInt(inputNumberOne.getText());
        num2=Integer.parseInt(inputNumberTwo.getText());
        total=num1+num2;
        String s = String.valueOf(total);
        showoutputHere.setText((String.valueOf(total)));





    }

    @FXML
    public void coneClickDiv(ActionEvent actionEvent) {
        int num1,num2,total;
        num1=Integer.parseInt(inputNumberOne.getText());
        num2=Integer.parseInt(inputNumberTwo.getText());
        if(num2==0){
            showoutputHere.setText("This Input two cannot be Zero");}
        else {
            total = num1 / num2;
            String s= String.valueOf(total);
            showoutputHere.setText((String.valueOf(total)));
        }

    }

    @FXML
    public void ClickToMul(ActionEvent actionEvent) {
        int num1,num2,total;
        num1=Integer.parseInt(inputNumberOne.getText());
        num2=Integer.parseInt(inputNumberTwo.getText());
        total=num1*num2;
        String s = String.valueOf(total);
        showoutputHere.setText((String.valueOf(total)));
    }

    @FXML
    public void clickToSUB(ActionEvent actionEvent) {
        int num1,num2,total;
        num1=Integer.parseInt(inputNumberOne.getText());
        num2=Integer.parseInt(inputNumberTwo.getText());
        total=num1-num2;
        String s = String.valueOf(total);
        showoutputHere.setText((String.valueOf(total)));
    }

    @FXML
    public void oneClickClear(ActionEvent actionEvent) {
        inputNumberOne.clear();
        inputNumberTwo.clear();
        showoutputHere.setText("");

    }
}