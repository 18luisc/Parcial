/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.univalle.parcial.repository;

import co.edu.univalle.parcial.model.Paciente;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author User
 */
public class PacienteDAO implements PacienteDAOInterface{
   
    private Map<String,Paciente> mapaPacientes= new HashMap<>();

    @Override
    public Map<String, Paciente> getPacientes() {
        return mapaPacientes;
    }

    @Override
    public Paciente getPaciente(String id) {
        return mapaPacientes.get(id);
    }

    @Override
    public boolean addPaciente(Paciente paciente) {
        mapaPacientes.put(paciente.getId(), paciente);
        return true;
    }

    @Override
    public boolean updatePaciente(String id, Paciente paciente) {
        mapaPacientes.put(id, paciente);
        return true;
    }

    @Override
    public boolean deletePaciente(String id) {
        mapaPacientes.remove(id);
        return true;
    }
}
