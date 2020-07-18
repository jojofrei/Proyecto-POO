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
    private Usuario user;
    private String genero;
    private String profesion;
    private ArrayList<String> interesesuser;
    private ArrayList<String> perfiles;
    private ArrayList<Respuesta> respuestasuser;
    

    public Perfil(Usuario user, String genero, String profesion) {
        this.user=user;
        this.genero = genero;
        this.profesion = profesion;
        this.interesesuser=new ArrayList();
        this.perfiles=new ArrayList();
        this.respuestasuser=new ArrayList();
        
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
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

    public ArrayList<String> getInteresesUser() {
        return interesesuser;
    }

    public void setInteresesUser(ArrayList<String> intereses) {
        this.interesesuser = intereses;
    }

    public ArrayList<String> getPerfiles() {
        return perfiles;
    }

    public void setPerfiles(ArrayList<String> perfiles) {
        this.perfiles = perfiles;
    }

    public ArrayList<Respuesta> getRespuestasUser() {
        return respuestasuser;
    }

    public void setRespuestasUser(ArrayList<Respuesta> respuestasUser) {
        this.respuestasuser = respuestasuser;
    }
    
    public void buscarPareja(){
        
    }

    
    public String toString(){
        return null;
        
    }
}
