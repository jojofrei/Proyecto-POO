/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncitas;
import java.util.Scanner;
//import java.util.Date;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author jojofrei
 */
public class Usuario {
    protected String email;
    protected String nombre;
    protected int fechaNacimiento;
    protected String contrasena;
    protected String genero;
    protected String tipoUsuario;
    protected String tarjeta;
    protected String fechCaducidad;
    protected ArrayList<String> informacion = new ArrayList<>();
    protected ArrayList<Usuario> usuariosI = new ArrayList<>();
    protected ArrayList<String> mensajes = new ArrayList<>();
    
    public Usuario(String email, String nombre,String genero,String tarjeta,String fechCaducidad,String tipoUsuario, int fechaNacimiento, String contrasena) {
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

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    // ESTE METODO NO VA A PERMITIR QUE NINGUN NOMBRE DE USUARIO SE REPITA 
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
    @Override
    public String toString() {
        return "Usuario{" + "email=" + email + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + '}';
    }
    
 
    Scanner S=new Scanner(System.in);
    
    //ESTE METODO SE VA A ENCARGAR DE CREAR EL USUARIO, QUE PUEDE SER PREMIUM Y STANDARD
    public void crearUsuario(){
        Scanner S=new Scanner(System.in);
        Edad();
        if(fechaNacimiento>=18){
            ValidarMail();
            validarUsuario();
            validarGenero();
            UsuarioPremium up=new UsuarioPremium();
            System.out.println("Ingrese tipo de usuario:");
            tipoUsuario=S.nextLine().toLowerCase();
        
            if(tipoUsuario.equals("premium")){
                informacion.add(tipoUsuario);
                System.out.println("Ingrese tarjeta de credito");
                tarjeta=S.nextLine();
                informacion.add(tarjeta);
                System.out.println("Ingrese fecha de caducidad:");
                fechCaducidad=S.nextLine();
                informacion.add(fechCaducidad);
            
                System.out.println("Ingrese contrasena:");
                contrasena= S.nextLine();
                informacion.add(contrasena);
                }
            else{
                informacion.add("Standard");
                System.out.println("Ingrese contrasena:");
                contrasena= S.nextLine();
                informacion.add(contrasena);
        }
    }
        else{
            System.out.println("Usuario no valido");
            System.out.println("Usuario menor de 18 anios");
        }
    }
    
    //ESTE METODO NO VA A PERMITIR QUE NINGUNA PERSONA MENOR A 18 ANIOS PUEDA CREARSE UNA CUENTA
    public void Edad(){
    System.out.println("Ingrese Fecha de nacimiento:");
            System.out.println("Ingrese anio:");
            int anio=S.nextInt();
            System.out.println("Ingrese mes:");
            int mes=S.nextInt();
            System.out.println("Ingrese dia:");
            int dia=S.nextInt();
            fechaNacimiento=calcular(new GregorianCalendar(anio,mes,dia));
            //System.out.println(fechaNacimiento);
    
    }
    
    // ESTE METODO ME VA A PERMITIR CORRER EL PROGRAMA CON SUS DIFERENTES METODOS 
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

    //ESTE METODO SE VA A ENCARGAR QUE CADA CORREO QUE SE INGRESE ESTE BIEN ESCRITO Y NO ESTE REPETIDO 
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
  
    //ESTE METODO ME VA A PERMITIR CLASIFICAR DE QUE GENERO ES CADA PERSONA
    public void validarGenero(){
    boolean val= true;
    Scanner S=new Scanner(System.in);
    while(val ==  true){
        System.out.println("Que genero es:");
        genero=S.nextLine().toUpperCase();

        if(genero.equals("MASCULINO")){
            informacion.add(genero);
            
            break;
        }
        if(genero.equals("FEMENINO")){
            informacion.add(genero);
            break;
        }  
        else{
            System.out.println("ERROR");
            System.out.println("Genero permitito (Masculino/Femenino)");
        }
    }
    
}
    // ESTE METODO ME VA A PERMITIR QUE SE CALCULE LA EDAD DE LAS PERSONAS
 
     public static int calcular(Calendar fechaNac) {

        Calendar fechaActual = Calendar.getInstance();

        // Cálculo de las diferencias.
        int years = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        int months = fechaActual.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);
        int days = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH);
        // Hay que comprobar si el día de su cumpleaños es posterior
        // a la fecha actual, para restar 1 a la diferencia de años,
        // pues aún no ha sido su cumpleaños.

        if(months < 0 // Aún no es el mes de su cumpleaños
           || (months==0 && days < 0)) { // o es el mes pero no ha llegado el día.
            years--;
        }
        return years;
    }
    
}