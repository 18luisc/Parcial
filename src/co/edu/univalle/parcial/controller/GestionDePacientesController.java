/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.univalle.parcial.controller;

import co.edu.univalle.parcial.model.Paciente;
import co.edu.univalle.parcial.model.Alergia;
import co.edu.univalle.parcial.repository.AlergiaDAO;
import co.edu.univalle.parcial.repository.PacienteDAO;
import co.edu.univalle.parcial.vista.GestionDePacientes;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author User
 */
public class GestionDePacientesController {
    
    private GestionDePacientes gestionDePacientes;
    //private PacienteDAO pacienteDAO;
    //private AlergiaDAO alergiaDAO;

    public GestionDePacientesController(GestionDePacientes gestionDePacientes) {
        this.gestionDePacientes = gestionDePacientes;
    }

    
    
    
   /* public void init() {
        GestionDePacientes gestionDePacientes = new GestionDePacientes();
        cargarAlergias(gestionDePacientes);
    }

    
    public void cargarAlergias(GestionDePacientes gestionDePacientes) {
    File archivo = new File("alergias.txt");
    try {
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);

        String linea;
        while ((linea = br.readLine()) != null) {
            gestionDePacientes.jComboAlergias.addItem(linea);
        }

        br.close();
        fr.close();
    } catch (FileNotFoundException e) {
        System.out.println("El archivo especificado no existe.");
    } catch (IOException e) {
        System.out.println("Ocurrió un error al leer el archivo.");
    }
  }*/
    
}

