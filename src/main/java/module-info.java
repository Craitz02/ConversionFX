module ni.edu.uni.programacion2.conversionfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens ni.edu.uni.programacion2.conversionfx to javafx.fxml;
    exports ni.edu.uni.programacion2.conversionfx;
    exports ni.edu.uni.programacion2.conversionfx.controllers;
}
