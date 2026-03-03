module com.example.demos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demos to javafx.fxml;
    exports com.example.demos;
}