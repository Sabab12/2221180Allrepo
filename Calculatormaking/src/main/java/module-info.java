module com.bgmea.calculatormaking {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.bgmea.calculatormaking to javafx.fxml;
    exports com.bgmea.calculatormaking;
}