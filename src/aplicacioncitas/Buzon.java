
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncitas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jojofrei
 */
public class Buzon {
   
     Usuario usuario ;
    
    
    
    public void vermensajes(Perfil usuario, Perfil interes){
      //determino el tamano de la lista de personas interesadas en este usuario
      int tamanoList= usuario.getPerfiles().size();
      Scanner teclado= new Scanner (System.in);
      
      int opcion;
      //muestro a las personas interesadas junto con su lugar en la lista
      for(int i=0;i<=tamanoList;i++){
        System.out.println((i+1)+" "+usuario.perfiles.get(i));
      }
     
      
        opcion = teclado.nextInt();
        //el usuario que es de interes
        interes= usuario.getPerfiles().get(opcion-1);
        System.out.println("De:"+ interes.user.nombre);
        
        System.out.println(interes.user.mensajes);
        System.out.println("Mensaje del sistema:");
        
        System.out.println("contacta con "+ interes.user.nombre+"al correo"+interes.user.email);
        
    
       
     
    }
    
}
