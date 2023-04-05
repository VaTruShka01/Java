module com.example.w22comp1011gcw11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.w22comp1011gcw11 to javafx.fxml;
    exports com.example.w22comp1011gcw11;
}