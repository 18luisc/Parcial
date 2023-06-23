/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.univalle.parcial;

/**
 *
 * @author User
 */
import co.edu.univalle.parcial.controller.GestionDePacientesController;
import co.edu.univalle.parcial.vista.GestionDePacientes;


public class Main {
    public static void main(String[] args) {
        GestionDePacientes gestionDePacientes = new GestionDePacientes();
        gestionDePacientes.setVisible(true);
        //GestionDePacientesController gestionDePacientes = new GestionDePacientesController(gestionDePacientes);
    }
}
