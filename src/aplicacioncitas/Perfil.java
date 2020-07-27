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
    protected Usuario user;
    protected ArrayList<String> interesesuser;
    protected ArrayList<Perfil> perfiles;
    protected ArrayList<String> respuestasuser;
    protected ArrayList<Perfil> perfileslike;
    

    public Perfil(Usuario user) {
        this.user=user;
        this.interesesuser=new ArrayList();
        this.respuestasuser=new ArrayList(); 
        this.perfiles = new ArrayList();
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public ArrayList<String> getInteresesUser() {
        return interesesuser;
    }

    public void setInteresesUser(ArrayList<String> intereses) {
        this.interesesuser = intereses;
    }

    public ArrayList<Perfil> getPerfiles() {
        return perfiles;
    }

    public void setPerfiles(ArrayList<Perfil> perfiles) {
        this.perfiles = perfiles;
    }

    public ArrayList<String> getRespuestasUser() {
        return respuestasuser;
    }

    public void setRespuestasUser(ArrayList<String> respuestasUser) {
        this.respuestasuser = respuestasuser;
    }

    public ArrayList<Perfil> getPerfileslike() {
        return perfileslike;
    }

    public void setPerfileslike(ArrayList<Perfil> perfileslike) {
        this.perfileslike = perfileslike;
    }
    
    /*El metodo buscarPareja se encarga de hacer los matchs respectivos, 
    en el caso de tener 2 o mas interes en común y 4 o mas respuestas iguales, 
    almacenandolos en la lista perfiles, que es donde estaran todos los perfiles
    que han hecho match */
    
    public void buscarPareja(Perfil p){
        int i = 0;
        int c = 0;
        for(String interes: p.getInteresesUser()){
            if(interesesuser.contains(interes)){
                i++;
            }
        }
        for(int j=0; j<p.getRespuestasUser().size(); j++){
            String r1 = p.getRespuestasUser().get(j);
            String r2 = this.getRespuestasUser().get(j);
            if(r1.equals(r2)){
                c++;
            }
        }
        if(i>=2 && c>=4){
            p.getPerfiles().add(this);
            this.perfiles.add(p);
        }
    }

    public String toString(){
        return null;
        
    }
    public void superLike(Perfil p){
        int i = 0;
        int c = 0;
        for(String interes: p.getInteresesUser()){
            if(interesesuser.contains(interes)){
                i++;
            }
        }
        for(int j=0; j<p.getRespuestasUser().size(); j++){
            String r1 = p.getRespuestasUser().get(j);
            String r2 = this.getRespuestasUser().get(j);
            if(r1.equals(r2)){
                c++;
            }
        }
        if(i>=1 && c>=2){
            p.getPerfiles().add(this);
            this.perfileslike.add(p);
        }
    }

}
