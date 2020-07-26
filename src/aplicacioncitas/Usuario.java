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
    public boolean validarCorreo(String email){
        if(informacion.contains((email))){
            String mensaje =("El correo ya existe");
            return true;
        }
        else{
            String mensaje =("El correo no existe");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Usuario{" + "email=" + email + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    public boolean validarUsuario(){
        return true;
    }
    ArrayList informacion = new ArrayList<> ();
    Scanner S=new Scanner(System.in);
    public void crearUsuario(){
        System.out.println("Ingrese Email:");
        email=S.nextLine();
        informacion.add(email);
        validarCorreo(email);
        System.out.println("Ingrese nombre:");
        nombre= S.nextLine();
        informacion.add(nombre);
        System.out.println("Ingrese Fecha de nacimiento:");
        fechaNacimiento = S.nextLine();
        informacion.add(fechaNacimiento);
        System.out.println("Ingrese contrasena:");
        contrasena= S.nextLine();
        informacion.add(contrasena);
    }
   
}

