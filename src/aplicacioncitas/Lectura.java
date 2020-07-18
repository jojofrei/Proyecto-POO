/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncitas;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jojofrei
 */
public class Lectura {
    static ArrayList<String> readFromFile(String ruta){
        ArrayList<String> lista = new ArrayList<>();
        File fichero = new File(ruta);
        Scanner sc = null;
        try{
            sc = new Scanner(fichero);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                lista.add(line);
            }
        }
        catch(IOException ex){
            System.out.println("Archivo no encontrado");
            
        }
        return lista;
    
    }


}
