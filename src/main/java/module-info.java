module com.mycompany.jfx1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.jfx1 to javafx.fxml;
    exports com.mycompany.jfx1;
}
