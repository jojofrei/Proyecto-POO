
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
      receptor.mensajes.set(indicev, mensaje);
      
    
    }
  
    
    
    
}
