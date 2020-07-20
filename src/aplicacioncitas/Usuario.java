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
    
    public boolean iniciarSesion(){
        return true;
    }
    public boolean validarCorreo(String email){
        boolean validacion=true;
        String emailPattern = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@" +
        "[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$";
        Pattern pattern = Pattern.compile(emailPattern);
        while(validacion!=false){
        if (email != null) {
          Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
  
               for(String str : informacion){
                   if(str.equals(email.toString())){
                        validacion=true;
                   }
                   else {
                       System.out.println("Email no valido");
                       System.out.println("Ingrese otra vez");
                       validacion=false;
                   }
                }
            }
         }
         else {
            System.out.println("NO Válido");
            System.out.println("ingrese otra vez");
            validacion=false;
           
            } 
        }
        return validacion;
        }
    
        
    
    
    public boolean validarUsuario(){
        return true;
    }
    
    Scanner S=new Scanner(System.in);
    public void crearUsuario(){
        System.out.println("Ingrese Email:");
        email=S.nextLine();
        validarCorreo(email);
        informacion.add(email);
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
       

