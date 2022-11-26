module com.example.lista_ingreso {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lista_ingreso to javafx.fxml;
    exports com.example.lista_ingreso;
    exports com.example.lista_ingreso.controladores;
    opens com.example.lista_ingreso.controladores to javafx.fxml;
    opens com.example.lista_ingreso.modelos;
}