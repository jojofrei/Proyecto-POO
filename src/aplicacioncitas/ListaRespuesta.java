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
    
    public ListaRespuesta(int bloque){
        super(5);
	this.bloque = bloque;
	generaLista();
    }

    /*Como el nombre lo indica el metodo generaLista va a genera una lista con 
    las opciones que tiene para responder por cada pregunta*/
    
    public void generaLista() {
        
        switch(bloque) {
	// Aqui van las opciones de respuestas
        case 0:
	this.add("1.Salir a comer");
	this.add("2.Ver peliculas");
        this.add("3.Hacer ejercicios");
	break;
				
	case 1:
	this.add("1.Politica");
	this.add("2.Educación");
	this.add("3.Pasatiempos");
	break;
				
	case 2:
        this.add("1.Si");
	this.add("2.No");
        break;
				
	case 3:
	this.add("1.Si");
	this.add("2.No");
	break;
				
	case 4:
        this.add("1.Confianza");
	this.add("2.Honestidad");
	this.add("3.Respeto");
        this.add("4.Todas las anteriores");
	break;
				
	case 5:
        this.add("1.En español");
	this.add("2.En inglés");
	this.add("3.Ambas");
	break;
	}
    }
    
  
}
