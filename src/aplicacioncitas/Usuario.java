<<<<<<< HEAD
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
    private String genero;
    private String tipoUsuario;
    private String tarjeta;
    private String fechCaducidad;
    ArrayList<String> informacion = new ArrayList<>();
    ArrayList<Usuario> usuariosI = new ArrayList<>();
    ArrayList<String> mensajes = new ArrayList<>();
    
    
    
    public Usuario(String email, String nombre,String genero,String tarjeta,String fechCaducidad,String tipoUsuario, String fechaNacimiento, String contrasena) {
        this.email = email;
        this.nombre = nombre;
        this.genero=genero;
        this.fechaNacimiento = fechaNacimiento;
        this.contrasena = contrasena;
        this.tipoUsuario=tipoUsuario;
        this.tarjeta=tarjeta;
        this.fechCaducidad=fechCaducidad;
    
    }
    
    public Usuario(){
        
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
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

    @Override
    public String toString() {
        return "Usuario{" + "email=" + email + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + '}';
    }

    
    
    Scanner S=new Scanner(System.in);
    public void crearUsuario(){
        Scanner S=new Scanner(System.in);
        ValidarMail();
        validarUsuario();
        validarGenero();
        UsuarioPremium up=new UsuarioPremium();
        System.out.println("Ingrese tipo de usuario:");
        tipoUsuario=S.nextLine().toLowerCase();
        if(tipoUsuario=="standard".toLowerCase()){
            informacion.add(tipoUsuario);
            System.out.println("Ingrese tarjeta de credito");
            up.setTarjetaCredito(tipoUsuario);
            informacion.add(tipoUsuario);
            System.out.println("Ingrese fecha de caducidad:");
            System.out.println("Ingrese Fecha de nacimiento:");
            fechaNacimiento = S.nextLine();
            informacion.add(fechaNacimiento);
            System.out.println("Ingrese contrasena:");
            contrasena= S.nextLine();
            informacion.add(contrasena);
            }
        else{
            System.out.println("Ingrese tarjeta de credito");
            tarjeta=S.nextLine();
            informacion.add(tarjeta);
            System.out.println("Ingrese fecha de caducidad:");
            fechCaducidad=S.nextLine();
            informacion.add(fechCaducidad);
            System.out.println("Ingrese Fecha de nacimiento:");
            fechaNacimiento = S.nextLine();
            informacion.add(fechaNacimiento);
            System.out.println("Ingrese contrasena:");
            contrasena= S.nextLine();
            informacion.add(contrasena);
        }
        
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
                    System.out.println(informacion);
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
        }
        else{
            System.out.println("Ingrese Email de nuevo");
        }
   }
  
    Scanner S=new Scanner(System.in);
    
    return validacion;
    }

 public void validarGenero(){
    Scanner S=new Scanner(System.in);
    System.out.println("Que genero es:");
    genero=S.nextLine().toUpperCase();
    if(genero=="masculino".toUpperCase()){
        informacion.add(genero);
        
    }
    else{
        genero="femenino";
        informacion.add(genero);
    }   
 }

}
       

       

=======
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
    private String genero;
    private String tipoUsuario;
    private String tarjeta;
    private String fechCaducidad;
    ArrayList<String> informacion = new ArrayList<>();
    
    
    
    public Usuario(String email, String nombre,String genero,String tarjeta,String fechCaducidad,String tipoUsuario, String fechaNacimiento, String contrasena) {
        this.email = email;
        this.nombre = nombre;
        this.genero=genero;
        this.fechaNacimiento = fechaNacimiento;
        this.contrasena = contrasena;
        this.tipoUsuario=tipoUsuario;
        this.tarjeta=tarjeta;
        this.fechCaducidad=fechCaducidad;
    
    }
    
    public Usuario(){
        
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
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

    @Override
    public String toString() {
        return "Usuario{" + "email=" + email + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + '}';
    }

    
    
    Scanner S=new Scanner(System.in);
    public void crearUsuario(){
        Scanner S=new Scanner(System.in);
        ValidarMail();
        validarUsuario();
        validarGenero();
        UsuarioPremium up=new UsuarioPremium();
        System.out.println("Ingrese tipo de usuario:");
        tipoUsuario=S.nextLine().toLowerCase();
        if(tipoUsuario=="standard".toLowerCase()){
            informacion.add(tipoUsuario);
            System.out.println("Ingrese tarjeta de credito");
            up.setTarjetaCredito(tipoUsuario);
            informacion.add(tipoUsuario);
            System.out.println("Ingrese fecha de caducidad:");
            System.out.println("Ingrese Fecha de nacimiento:");
            fechaNacimiento = S.nextLine();
            informacion.add(fechaNacimiento);
            System.out.println("Ingrese contrasena:");
            contrasena= S.nextLine();
            informacion.add(contrasena);
            }
        else{
            System.out.println("Ingrese tarjeta de credito");
            tarjeta=S.nextLine();
            informacion.add(tarjeta);
            System.out.println("Ingrese fecha de caducidad:");
            fechCaducidad=S.nextLine();
            informacion.add(fechCaducidad);
            System.out.println("Ingrese Fecha de nacimiento:");
            fechaNacimiento = S.nextLine();
            informacion.add(fechaNacimiento);
            System.out.println("Ingrese contrasena:");
            contrasena= S.nextLine();
            informacion.add(contrasena);
        }
        
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
                    System.out.println(informacion);
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
        }
        else{
            System.out.println("Ingrese Email de nuevo");
        }
   }
  
    Scanner S=new Scanner(System.in);
    
    return validacion;
    }

 public void validarGenero(){
    Scanner S=new Scanner(System.in);
    System.out.println("Que genero es:");
    genero=S.nextLine().toUpperCase();
    if(genero=="masculino".toUpperCase()){
        informacion.add(genero);
        
    }
    else{
        genero="femenino";
        informacion.add(genero);
    }   
 }

}
       

       

>>>>>>> 80ae9b728ce9b35b72b366f837e566263964677d
