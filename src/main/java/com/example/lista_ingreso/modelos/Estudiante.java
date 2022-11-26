package com.example.lista_ingreso.modelos;

import javafx.beans.property.SimpleStringProperty;

public class Estudiante {
    SimpleStringProperty id;
    SimpleStringProperty nombre;
    SimpleStringProperty edad;

    public Estudiante (){
        this.id = new SimpleStringProperty();
        this.nombre = new SimpleStringProperty();
        this.edad = new SimpleStringProperty();
    }

    public String getId() {
        return id.get();
    }

    public SimpleStringProperty idProperty() {
        return id;
    }

    public void setId(String id) {
        this.id.set(id);
    }

    public String getNombre() {
        return nombre.get();
    }

    public SimpleStringProperty nombreProperty() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public String getEdad() {
        return edad.get();
    }

    public SimpleStringProperty edadProperty() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad.set(edad);
    }
}
