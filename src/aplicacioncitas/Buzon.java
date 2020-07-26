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
