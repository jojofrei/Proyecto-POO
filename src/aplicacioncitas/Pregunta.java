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
    public static ArrayList<Pregunta> preguntas = new ArrayList();
    private String pregunta;
    private ArrayList<String> respuestas = new ArrayList();
    

    public Pregunta(String pregunta, ArrayList<String> respuestas) {
        this.pregunta=pregunta;
        this.respuestas=respuestas;
 
    }
    public Pregunta(String pregunta) {
        this.pregunta=pregunta;
    }
    
    /*Este metodo llenarDatos, me añadira a la lista preguntas las preguntas
    con sus respectivas opciones de respuesta, haciendo uso de los objeto Pregunta 
    y ListaRespuesta*/
    
    public static void llenarDatos(){
        preguntas.add(new Pregunta("1.¿Qué te gusta hacer en tu tiempo libre?:", new ListaRespuesta(0)));
        preguntas.add(new Pregunta("2.¿Cuáles son tus temas de interés en una conversación?:", new ListaRespuesta(1)));
        preguntas.add(new Pregunta("3.¿Eres amante de la literatura o de las peliculas?", new ListaRespuesta(2)));
        preguntas.add(new Pregunta("4.¿Eres amantes de los animales?", new ListaRespuesta(3)));
        preguntas.add(new Pregunta("5.¿Qué es lo mas importante para ti en una relación?", new ListaRespuesta(4)));
        preguntas.add(new Pregunta("6.¿Qué tipo de música prefieres?:", new ListaRespuesta(5)));
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public ArrayList<String> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(ArrayList<String> respuestas) {
        this.respuestas = respuestas;
    }
   
    
}
