/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncitas;
import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jojofrei
 */
public class Usuario {
    private String email;
    private String nombre;
    private String fechaNacimiento;
    private String contrasena;
    ArrayList<String> informacion = new ArrayList<>();
    
    
    
    public Usuario(String email, String nombre, String fechaNacimiento, String contrasena) {
        this.email = email;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.contrasena = contrasena;
    }
    
    public Usuario(){
        
    }
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
    
    public boolean validarUsuario(){
        boolean validacion=true;
        Scanner S=new Scanner(System.in);
        while(validacion==true){
            System.out.println("Ingrese nombre:");
            nombre= S.nextLine();
            if(informacion.contains(nombre.toString())){
                System.out.println("Nombre no valido");
                System.out.println("Ingrese otra vez");
                validacion=true;
            }
            else {
                informacion.add(nombre);
                validacion=false;
                break;
            }
        }
        return validacion;
    }
    
    Scanner S=new Scanner(System.in);
    public void crearUsuario(){
        Scanner S=new Scanner(System.in);
        ValidarMail();
        validarUsuario();
        System.out.println("Ingrese Fecha de nacimiento:");
        fechaNacimiento = S.nextLine();
        informacion.add(fechaNacimiento);
        System.out.println("Ingrese contrasena:");
        contrasena= S.nextLine();
        informacion.add(contrasena);
    }
    
    public void iniciarSesion(){
        System.out.println("Bienvenidos al programa de citas");
        boolean salir=false;
        int opcion;
        while(!salir){
            System.out.println("1.Crear usuario:");
            System.out.println("2.Iniciar sesion:");
            System.out.println("3.Salir");
            
            System.out.println("Escriba una opcion");
            opcion=S.nextInt();
            
            switch(opcion){
                case 1:
                    crearUsuario();
                    break;
                case 2:
                    break;
                case 3:
                    salir=true;
                    break;
                default:
                    System.out.println("solo numero entre 1 y 3 ");
                    
            }
        }
           
        
    }
  public boolean ValidarMail() {
    // Patron para validar el email
   boolean validacion=true;
   Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
   while (validacion == true){
        Scanner S=new Scanner(System.in);
        System.out.println("Ingrese Email:");
        email=S.nextLine();
        Matcher mather = pattern.matcher(email);
        if(mather.find()){
            if(informacion.contains(email.toString())){
               System.out.println("Email no valido");
               System.out.println("Ingrese otra vez");
               validacion=true;
            }
            else {
                informacion.add(email);
                validacion=false;
                break;
            }
        }else{
            System.out.println("Ingrese Email de nuevo");
        }
    }
    return validacion;
    }
 
    
    
}

       

