package com.example.primerparcial.Models;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String nombre;
    private String contraseña;
    private String tipoUsuario;

    public Usuario() {
    }

    public Usuario(String nombre, String contraseña, String tipoUsuario) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", tipoUsuario='" + tipoUsuario + '\'' +
                '}';
    }
}
