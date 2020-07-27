<<<<<<< HEAD
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
    
    
    
    public void vermensajes(Usuario usuario, Usuario interes){
      //determino el tamano de la lista de personas interesadas en este usuario
      int tamanoList= usuario.usuariosI.size();
      Scanner teclado= new Scanner (System.in);
      
      int opcion;
      //muestro a las personas interesadas junto con su lugar en la lista
      for(int i=0;i<=tamanoList;i++){
        System.out.println((i+1)+" "+usuario.usuariosI.get(i));
      }
     
      for(int i=0;i<1;i++){
        opcion = teclado.nextInt();
        //el usuario que es de interes
        interes= usuario.usuariosI.get(opcion-1);
        System.out.println("De:"+ interes.getNombre());
        
        System.out.println(usuario.mensajes.get(opcion-1));
        System.out.println("Mensaje del sistema:");
        
        System.out.println("contacta con "+ interes.getNombre() +"al correo"+interes.getEmail());
        Scanner salida=new Scanner(System.in);
        String valor=salida.nextLine();
        if(valor!=null){
            i++;
        }
      }
    }
    
}
=======
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
   
     Usuario uemizor ;
    ArrayList<Usuario> usuarios;
    
    
    public void vermensajes(){
      //determino el tamano de la lista de personas interesadas en este usuario
      int tamanoList= usuarios.size();
      Scanner teclado= new Scanner (System.in);
      
      int opcion;
      //muestro a las personas interesadas junto con su lugar en la lista
      for(int i=0;i<=tamanoList;i++){
        System.out.println((i+1)+" "+usuarios.get(i));
      }
     
      for(int i=0;i<1;i++){
        opcion = teclado.nextInt();
        System.out.println("De:"+usuarios.get(opcion-1));
        //System.out.println(usuarios.get(opcion-1).mensajes.get(opcion-1));
        System.out.println("Mensaje del sistema:");
        //System.out.println("contacta con "+usuarios.get(opcion-1)+" al correo: "+usuarios.get(opcion-1).email);
        Scanner salida=new Scanner(System.in);
        String valor=salida.nextLine();
        if(valor!=null){
            i++;
        }
      }
    }
    
}
>>>>>>> 80ae9b728ce9b35b72b366f837e566263964677d
