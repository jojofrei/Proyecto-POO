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
public class Pregunta {
    private ArrayList<String> preguntas = new ArrayList();
    

    public Pregunta() {
        preguntas.add("1.¿Qué te gusta hacer en tu tiempo libre?:");
        preguntas.add("2.¿Cuáles son tus temas de interés en una conversación?:");
        preguntas.add("3.¿Eres amante de la literatura o de las peliculas?");
        preguntas.add("4.¿Eres amantes de los animales?");
        preguntas.add("5.¿Qué es lo mas importante para ti en una relación?");
        preguntas.add("6.¿Qué tipo de música prefieres?:");
        this.preguntas = preguntas;
    }

    public ArrayList<String> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(String pregunta) {
        preguntas.add(pregunta);
    }
    
    public int getIndice(String pregunta){
        return preguntas.indexOf(pregunta);
    }
 
   
}
