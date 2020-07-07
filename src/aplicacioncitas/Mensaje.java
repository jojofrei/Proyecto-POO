/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncitas;

/**
 *
 * @author jojofrei
 */
public class Mensaje {
    private String mensaje;
    private Usuario emisor;
    private Usuario receptor;

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
    
    
    
    
}
