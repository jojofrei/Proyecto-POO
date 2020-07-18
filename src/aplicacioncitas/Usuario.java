/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncitas;
import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author jojofrei
 */
public class Usuario {
    private String email;
    private String nombre;
    private String fechaNacimiento;
    private String contrasena;

    /*public Usuario(String email, String nombre, String fechaNacimiento, String contrasena) {
        this.email = email;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.contrasena = contrasena;
    }*/

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public boolean iniciarSesion(){
        return true;
    }
    public boolean validarCorreo(){
        return true;
    }
    
    public boolean validarUsuario(){
        return true;
    }
    ArrayList informacion = new ArrayList<> ();
    Scanner S=new Scanner(System.in);
    public void crearUsuario(){
        System.out.println("Ingrese Email:");
        email=S.nextLine();
        System.out.println("Ingrese nombre:");
        nombre= S.nextLine();
        System.out.println("Ingrese Fecha de nacimiento:");
        fechaNacimiento = S.nextLine();
        System.out.println("Ingrese contrasena:");
        contrasena= S.nextLine();      
    }
    
    
}

