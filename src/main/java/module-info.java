module com.clase.dicegame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.clase.dicegame to javafx.fxml;
    exports com.clase.dicegame;
}