/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.univalle.parcial.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Paciente {
    private String id;
    private String apellido;
    private String nombre;
    private String telefono;
    private String direccion;
    private List<Alergia> alergias;

    public Paciente(String id, String apellido, String nombre, String telefono, String direccion) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.alergias = new ArrayList();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Alergia> getAlergias() {
        return alergias;
    }

    public void setAlergias(List<Alergia> alergias) {
        this.alergias = alergias;
    }
    
   /* @Override
    public String toString() {
        return id + ", " + apellido +", "+ nombre + ", " + telefono + ", " + direccion;
    }*/
}
