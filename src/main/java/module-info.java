module ni.edu.uni.programacion2.conversionfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens ni.edu.uni.programacion2.conversionfx to javafx.fxml;
    exports ni.edu.uni.programacion2.conversionfx;
}
