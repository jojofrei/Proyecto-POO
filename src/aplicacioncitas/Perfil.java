/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncitas;

import java.util.ArrayList;

/**
 *
 * @author jojofrei
 */
public class Perfil {
    private String genero;
    private String profesion;
    private ArrayList<String> profesiones;
    private ArrayList<String> intereses;
    private ArrayList<String> perfiles;

    public Perfil(String genero, String profesion) {
        this.genero = genero;
        this.profesion = profesion;
    }

    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public ArrayList<String> getProfesiones() {
        return profesiones;
    }

    public void setProfesiones(ArrayList<String> profesiones) {
        this.profesiones = profesiones;
    }

    public ArrayList<String> getIntereses() {
        return intereses;
    }

    public void setIntereses(ArrayList<String> intereses) {
        this.intereses = intereses;
    }

    public ArrayList<String> getPerfiles() {
        return perfiles;
    }

    public void setPerfiles(ArrayList<String> perfiles) {
        this.perfiles = perfiles;
    }
    
    public void buscarPareja(){
        
    }
    
    public boolean validarProfesion(){
        return true;
        
    }
    
    public boolean validarInteres(){
        return true;
    }
    
    public String toString(){
        return null;
        
    }
}
