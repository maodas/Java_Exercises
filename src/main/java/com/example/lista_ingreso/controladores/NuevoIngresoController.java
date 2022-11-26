package com.example.lista_ingreso.controladores;

import com.example.lista_ingreso.Application;
import com.example.lista_ingreso.modelos.Estudiante;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class NuevoIngresoController {

    @FXML
    private Button botonAgregar;

    @FXML
    private TextField campoEdad;

    @FXML
    private TextField campoId;

    @FXML
    private TextField campoNombre;


    Application app;

    public void setMain(Application main){
        this.app = main;
    }

    @FXML
    void agregarEstudiante(ActionEvent event) {

        Estudiante nuevoEstudiante = new Estudiante();
        nuevoEstudiante.setId(campoId.getText());
        nuevoEstudiante.setNombre(campoNombre.getText());
        nuevoEstudiante.setEdad(campoEdad.getText());
        app.agregarEstudiante(nuevoEstudiante);
        //listaNuevosEstudiantes.add(nuevoEstudiante);
       // System.out.println(listaNuevosEstudiantes);

    }

}
