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
        allperfil.add(p1);
        llenarListas(p1);
        Perfil p2 = generarPerfil();
        allperfil.add(p2);
        llenarListas(p2);
        //Perfil p3 = generarPerfil();
        //allperfil.add(p3);
        //llenarListas(p3);
        
        for(int i=0; i<allperfil.size(); i++){
            Perfil pr1 = allperfil.get(i);
            for(int j=i+1; j<allperfil.size(); j++){
                Perfil pr2 = allperfil.get(j);
                pr1.buscarPareja(pr2);  
            }
        }
        System.out.println(" ");
        System.out.println("... Perfiles con los que hizo match ...");
        for(Perfil p :p1.getPerfiles()){
            System.out.println(p.getUser().toString());
        }
        
    }

    /*Este método generarPerfil me permitira producir un perfil, inmediatamente 
    se haya creado un usuario*/
    
    public static Perfil generarPerfil(){
        Usuario user = new Usuario();
        user.crearUsuario();
        Perfil p = new Perfil(user);
        return p;
    }
    
    /*Este método me llenará las listas interesesUser y respuestasUser con la 
    informacion escogida por el usuario, para de acuerdo a esto usarlas para
    hacer la comparacion en la realizacion del match*/
    
    public static void llenarListas(Perfil p){
        Scanner respuesta = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("----- Intereses disponibles -----");
        for(String str: interes){
               System.out.println(str);
           }
           System.out.println("Elija sus intereses: ");
           for(int i=0; i<3; i++){
               String interes = respuesta.nextLine().toLowerCase();
               p.getInteresesUser().add(interes);
           }

        System.out.println(" ");
        System.out.println("----- Cuestionario de preguntas -----");
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
