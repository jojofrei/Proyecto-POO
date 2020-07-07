/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncitas;

import java.util.Date;

/**
 *
 * @author jojofrei
 */
public class Usuario {
    private String email;
    private String nombre;
    private Date fechaNacimiento;
    private String contrasena;

    public Usuario(String email, String nombre, Date fechaNacimiento, String contrasena) {
        this.email = email;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.contrasena = contrasena;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
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
}
