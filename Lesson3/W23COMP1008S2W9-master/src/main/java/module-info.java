module com.example.w23comp1008s2w9 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.w23comp1008s2w9 to javafx.fxml;
    exports com.example.w23comp1008s2w9;
}