<<<<<<< HEAD

package aplicacioncitas;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class Mensaje {
    
    protected String mensaje;
    protected Usuario emisor;
    protected Usuario receptor;
    //private Usuario receptor;
    

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Usuario getEmisor() {
        return emisor;
    }

    public void setEmisor(Usuario emisor) {
        this.emisor = emisor;
    }

    public Usuario getReceptor() {
        return receptor;
    }

    public void setReceptor(Usuario receptor) {
        this.receptor = receptor;
    }
    
    

    
    public void enviarmensaje( Usuario emizor ){
      int tamanoList= emizor.usuariosI.size();
      Scanner teclado= new Scanner (System.in);
      int indicev ;
    for(int i=0;i<=tamanoList;i++){
        //muestros los nombre de los usuarios interesados
        System.out.println((i+1)+" "+emizor.usuariosI.get(i));
    }
      indicev= teclado.nextInt()-1;
      receptor=emizor.usuariosI.get(indicev);
      //el mensaje lo ingresamos directamente a la lista mensajes en usuario
      mensaje=JOptionPane.showInputDialog("Ingrese mensaje:"); 
      //aqui se ingrresa el mensaje a una lista deonde se guardan los mensajes
      receptor.mensajes.add(indicev, mensaje);
      
    
    }
  
    
    
    
}
=======

package aplicacioncitas;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class Mensaje {
    ArrayList<Usuario> usuarios;
    private String mensaje;
    private Usuario emisor;
    //private Usuario receptor;
    

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Usuario getEmisor() {
        return emisor;
    }

    public void setEmisor(Usuario emisor) {
        this.emisor = emisor;
    }

    
    public void enviarmensaje(Usuario receptor ){
      int tamanoList= usuarios.size();
      Scanner teclado= new Scanner (System.in);
      int indicev ;
    for(int i=0;i<=tamanoList;i++){
        System.out.println((i+1)+" "+usuarios.get(i));
    }
      indicev= teclado.nextInt()-1;
      mensaje=JOptionPane.showInputDialog("Ingrese mensaje:");
      //el mensaje lo ingresamos directamente a la lista mensajes en usuario
      //receptor.mensajes.set(indicev, mensaje);
      
    
    }
  
    
    
    
}
>>>>>>> 80ae9b728ce9b35b72b366f837e566263964677d
