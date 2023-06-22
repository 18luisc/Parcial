/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.univalle.parcial.repository;

/**
 *
 * @author User
 */
public class AlergiaDAO implements AlergiaDAOInterface {
    
    private Map<Integer, Alergia> mapaAlergias = new HashMap<>();    

    @Override
    public Map<Integer, Alergia> getAlergias() {
        return mapaAlergias;
    }

    @Override
    public Alergia getAlergia(String nombre) {
        return mapaAlergias.get(nombre);
    }

    @Override
    public boolean addAlergia(Alergia alergia) {
        mapaAlergias.put(alergia.getNombre(), alergia);
        return true;
    }
}