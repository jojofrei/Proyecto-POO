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
public class Respuesta {
    private String respuesta;
      
    public String getRespuesta(){
	return respuesta;
    }
    
    public void setRespuesta(String respuesta){
	this.respuesta = respuesta;
    }
    
    public Respuesta(String respuesta){
        setRespuesta(respuesta);
    }
    
}
