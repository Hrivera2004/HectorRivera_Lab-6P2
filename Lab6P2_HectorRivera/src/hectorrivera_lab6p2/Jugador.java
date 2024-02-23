/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hectorrivera_lab6p2;

/**
 *
 * @author hriverav
 */
public class Jugador {
    private String name, posicion;
    private int edad;

    public Jugador(String name, String posicion, int edad) {
        this.name = name;
        this.posicion = posicion;
        this.edad = edad;
    }

    public Jugador() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
