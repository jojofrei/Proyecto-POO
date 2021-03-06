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
public class UsuarioPremium extends Usuario {
    private String tarjetaCredito;
    private Date fechaCaducidad; 

    public UsuarioPremium(String tarjetaCredito, Date fechaCaducidad, String email, String nombre, String genero, String tarjeta, String fechCaducidad, String tipoUsuario, int fechaNacimiento, String contrasena) {
        super(email, nombre, genero, tarjeta, fechCaducidad, tipoUsuario, fechaNacimiento, contrasena);
        this.tarjetaCredito = tarjetaCredito;
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}
