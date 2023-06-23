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
import java.io.FileReader;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author User
 */
public class GestionDePacientesController {
    
    private GestionDePacientes gestionDePacientes;
    private PacienteDAO pacienteDAO;
    private AlergiaDAO alergiaDAO;
    
    public GestionDePacientesController(GestionDePacientes vista, PacienteDAO pacienteDao, AlergiaDAO alergiaDao) {
        this.gestionDePacientes = vista;
        this.pacienteDAO = pacienteDao;
        this.alergiaDAO = alergiaDao;
        
        HandlerActions listener = new HandlerActions();
        
        //gestionDePacientes.addjComboAlergias(listener);
       
        
    }
    
       

    private static class HandlerActions {

        public HandlerActions() {
        }
    }
}

