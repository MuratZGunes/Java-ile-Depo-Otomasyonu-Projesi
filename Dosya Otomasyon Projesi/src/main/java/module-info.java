module com.mycompany.sonproje3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.sonproje3 to javafx.fxml;
    exports com.mycompany.sonproje3;
}
