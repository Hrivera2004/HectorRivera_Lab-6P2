/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hectorrivera_lab6p2;

import java.util.ArrayList;

/**
 *
 * @author hriverav
 */
public class Equipo {
    private String pais, nombre, estadio,cuidad;
    private ArrayList<Jugador> Jugadores = new ArrayList<>();

    public Equipo() {
    }

    public Equipo(String pais, String nombre, String estadio, String cuidad) {
        if (pais.contains("real")||pais.contains("Real")) {
            if (pais.contains("madrid")||pais.contains("Madrid")) {
                this.pais = "real vardrid";
            }else{
                this.pais = pais;
            }
        }else{
            this.pais = pais;
        }
        
        
        this.nombre = nombre;
        this.estadio = estadio;
        this.cuidad = cuidad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        if (pais.contains("real")||pais.contains("Real")) {
            if (pais.contains("madrid")||pais.contains("Madrid")) {
                this.pais = "real vardrid";
            }else{
                this.pais = pais;
            }
        }else{
            this.pais = pais;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(ArrayList<Jugador> Jugadores) {
        this.Jugadores = Jugadores;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
    
}
