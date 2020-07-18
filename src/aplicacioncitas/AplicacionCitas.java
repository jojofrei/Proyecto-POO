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
    static ArrayList<String> profesiones = readFromFile("/Users/jojofrei/NetBeansProjects/AplicacionCitas/src/archivostexto/profesiones.txt");
    static ArrayList<String> interes = readFromFile("/Users/jojofrei/NetBeansProjects/AplicacionCitas/src/archivostexto/intereses.txt");


    public static void main(String[] args) {

       
       boolean c=true;
        while (c){
           System.out.println("Elija su profesión: ");
           /*for(String str: profesiones){
               System.out.println(str);
           }*/
           Scanner respuesta = new Scanner(System.in);
           String profesion = respuesta.nextLine();
           if(profesiones.contains(profesion)){
               c=false;
               
           }
           else{
               System.out.println("Profesión no encontrada");
           }
           for(String str: interes){
               System.out.println(str);
           }
                    
           System.out.println("Elija sus intereses: ");
           for(int i=0; i<3; i++){
               String interes = respuesta.nextLine();
  
           }
       }
       
        Pregunta p1 = new Pregunta();
        System.out.println("Respuesta: ");
        for(String p:p1.getPreguntas()){
            System.out.println(p);
            int i=p1.getIndice(p);
            ListaRespuesta r1= new ListaRespuesta(i);
            
            
            for(String r :r1.getRespuestas()){
                System.out.println(r);    
            }  
            Scanner respuesta = new Scanner(System.in);
            String answer = respuesta.nextLine();
        }

      Usuario u = new Usuario();
      u.crearUsuario();
      
        System.out.println(u.informacion);
        
        
     

        
        //Perfil.respuestasuser.add();  //Agregar usuario

     
   
    }
    
}
