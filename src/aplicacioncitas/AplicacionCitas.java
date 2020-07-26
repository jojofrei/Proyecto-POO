/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncitas;

import static aplicacioncitas.Lectura.readFromFile;
import java.util.ArrayList;
import java.util.Scanner;
 
/**
 *
 * @author jojofrei
 */
public class AplicacionCitas {
    //static ArrayList<String> profesiones = readFromFile("/Users/jojofrei/NetBeansProjects/AplicacionCitas/src/archivostexto/profesiones.txt");
    static ArrayList<String> interes = readFromFile("/Users/jojofrei/NetBeansProjects/AplicacionCitas/src/archivostexto/intereses.txt");
    static ArrayList<Perfil> allperfil = new ArrayList<>();
    
    public static void main(String[] args) {
        Pregunta.llenarDatos();
        Perfil p1 = generarPerfil();
        Perfil p2 = generarPerfil();
        allperfil.add(p1);
        allperfil.add(p2);
        llenarListas(p1);
        llenarListas(p2);
        for(int i=0; i<allperfil.size(); i++){
            Perfil pr1 = allperfil.get(i);
            for(int j=i+1; j<allperfil.size(); j++){
                Perfil pr2 = allperfil.get(j);
                pr1.buscarPareja(pr2);  
            }
        }
        for(Perfil p :p1.getPerfiles()){
            System.out.println(p.getUser().toString());
        }
    }

    public static Perfil generarPerfil(){
        Usuario user = new Usuario();
        user.crearUsuario();
        Perfil p = new Perfil(user);
        return p;
    }
    
    public static void llenarListas(Perfil p){
        Scanner respuesta = new Scanner(System.in);
        for(String str: interes){
               System.out.println(str);
           }
           System.out.println("Elija sus intereses: ");
           for(int i=0; i<3; i++){
               String interes = respuesta.nextLine();
               p.getInteresesUser().add(interes);
           }

        for(Pregunta preg:Pregunta.preguntas){
            System.out.println(preg.getPregunta());

            for(String r :preg.getRespuestas()){
                System.out.println(r);    
            }  
            System.out.println("Respuesta: ");
            String answer = respuesta.nextLine();
            p.getRespuestasUser().add(answer);
        }
    }
}
