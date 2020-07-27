

package aplicacioncitas;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class Mensaje {
    
    protected String mensaje;
    
    protected Perfil emisor;
    
    

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    
    
    public void enviarmensaje( Perfil emisor){
        //determino el tamano de la lista de personal interesadas en el
      int tamanoList= emisor.getPerfiles().size();
      Scanner teclado= new Scanner (System.in);
      int indicev ;
      //imprimo todos los perfiles de las personas interesadas 
    for(int i=0;i<=tamanoList;i++){
        //muestros los nombre de los usuarios interesados
        System.out.println((i+1)+" "+emisor.getPerfiles().get(i));
    }
    //determino el indice de la persona de interes
      indicev= teclado.nextInt()-1;
      Perfil receptor=emisor.getPerfiles().get(indicev);
      //el mensaje lo ingresamos directamente a la lista mensajes en usuario
      mensaje=JOptionPane.showInputDialog("Ingrese mensaje:"); 
      //aqui se ingrresa el mensaje a una lista deonde se guardan los mensajes
      receptor.getUser().mensajes.add(indicev, mensaje);
                 
    
    }

    
  
    
    
 
}



