package com.example.lista_ingreso.controladores;

import com.example.lista_ingreso.Application;
import com.example.lista_ingreso.modelos.Estudiante;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class DatosController {

    @FXML
    private Button bottonAgregar;

    @FXML
    private TextField campoEdad;

    @FXML
    private TextField campoId;

    @FXML
    private TextField campoNombre;

    @FXML
    private TableColumn<?, ?> columnaEdad;

    @FXML
    private TableColumn<?, ?> columnaNombre;

    @FXML
    private TableColumn<?, ?> columnaid;

    @FXML
    private TableView<?> tablaEstudiantes;

    //ArrayList<Estudiante> listaNuevosEstudiantes = new ArrayList<>();
    ObservableList listaNuevosEstudiantes = FXCollections.observableArrayList();

    Application app;

    public void setMain(Application main){
        this.app = main;
    }

    public void agregarEstudiante(Estudiante nuevoEstudiante){
        listaNuevosEstudiantes.add(nuevoEstudiante);
    }
    @FXML
    public void abrirAgregar(ActionEvent actionEvent) throws IOException {
        app.cargarNuevoIngreso();

    }


    @FXML
    public void initialize(){
        columnaid.setCellValueFactory(new PropertyValueFactory<>("id"));
        columnaNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        columnaEdad.setCellValueFactory(new PropertyValueFactory<>("edad"));
        tablaEstudiantes.setItems(listaNuevosEstudiantes);

    }

}
