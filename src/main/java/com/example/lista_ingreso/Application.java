package com.example.lista_ingreso;

import com.example.lista_ingreso.controladores.DatosController;
import com.example.lista_ingreso.controladores.NuevoIngresoController;
import com.example.lista_ingreso.modelos.Estudiante;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    Stage datosStage;
    DatosController dc;
    @Override
    public void start(Stage stage) throws IOException {
        this.datosStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("tablas-datos.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);

        dc = fxmlLoader.getController();
        dc.setMain(this);
        stage.show();
    }

    public void cargarNuevoIngreso() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("nuevo-ingreso.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage nuevoIngresoStage = new Stage();
        nuevoIngresoStage.setTitle("Hello!");
        nuevoIngresoStage.setScene(scene);
        nuevoIngresoStage.initOwner(datosStage);
        NuevoIngresoController nic = fxmlLoader.getController();
        nic.setMain(this);
        nuevoIngresoStage.show();

    }
    public void agregarEstudiante(Estudiante nuevoEstudiante){
        dc.agregarEstudiante(nuevoEstudiante);

    }

    public static void main(String[] args) {
        launch();
    }
}