/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.univalle.parcial.repository;

import co.edu.univalle.parcial.model.Paciente;
import java.util.Map;
/**
 *
 * @author User
 */
public interface PacienteDAOInterface {
    
    public Map<String, Paciente> getPacientes();
    
    public Paciente getPaciente(String id);
    
    public boolean addPaciente(Paciente paciente);
    
    public boolean updatePaciente(String id, Paciente paciente);
    
    public boolean deletePaciente(String id);
    
}