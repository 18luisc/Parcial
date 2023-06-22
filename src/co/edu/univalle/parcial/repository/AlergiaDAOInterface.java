/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.univalle.parcial.repository;

import co.edu.univalle.parcial.model.Alergia;
import java.util.Map;

/**
 *
 * @author User
 */
public class AlergiaDAOInterface {
    
    public Map<Integer, Alergia> getAlergias();
    
    public Alergia getAlergia(String nombre);
    
    public boolean addAlergia(Alergia alergia);
}
