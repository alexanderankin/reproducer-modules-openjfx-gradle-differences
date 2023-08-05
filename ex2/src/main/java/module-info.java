module com.example.ex.fx.example.module {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    // requires lombok;

    opens com.example.ex2.fx.example to javafx.fxml;
    exports com.example.ex2.fx.example;
}
