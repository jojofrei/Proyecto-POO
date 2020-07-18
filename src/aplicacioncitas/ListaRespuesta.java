/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncitas;

import java.util.ArrayList;

/**
 *
 * @author jojofrei
 */
public class ListaRespuesta extends ArrayList {
    private int bloque = 1;
    private ArrayList<String> respuesta = new ArrayList();
    
    public ListaRespuesta(int bloque){
        super(5);
	this.bloque = bloque;
	generaLista();
    }
    
    public ListaRespuesta(){
        super(5);
	generaLista();
    }
    
   
    
    public void generaLista() {
        
        switch(bloque) {
	// Aqui van las respuestas
        case 0:
	this.respuesta.add("1.Salir a comer");
	this.respuesta.add("2.Ver peliculas");
        this.respuesta.add("3.Hacer ejercicios");
	break;
				
	case 1:
	this.respuesta.add("1.Politica");
	this.respuesta.add("2.Educación");
	this.respuesta.add("3.Pasatiempos");
	break;
				
	case 2:
        this.respuesta.add("1.Si");
	this.respuesta.add("2.No");
        break;
				
	case 3:
	this.respuesta.add("1.Si");
	this.respuesta.add("2.No");
	break;
				
	case 4:
        this.respuesta.add("1.Confianza");
	this.respuesta.add("2.Honestidad");
	this.respuesta.add("3.Respeto");
        this.respuesta.add("3.Todas las anteriores");
	break;
				
	case 5:
        this.respuesta.add("1.En español");
	this.respuesta.add("2.En inglés");
	this.respuesta.add("3.Ambas");
	break;
	}
    }
    
    public ArrayList<String> getRespuestas(){
        return this.respuesta;
    }
  
}
