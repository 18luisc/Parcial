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
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        GestionDePacientes gestionDePacientes = new GestionDePacientes();
        gestionDePacientes.setVisible(true);
      /*  try {
            GestionDePacientesController gestionDePacientesController = new GestionDePacientesController(gestionDePacientes);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }
}
