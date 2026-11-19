/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author HP
 */
public class Coordenada {
    private int x;
    private int y;

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { 
        return x; 
    }
    public int getY() { 
        return y;
    }
    
    @Override
    public boolean equals(Object o) {
        Coordenada otra = (Coordenada) o;
        return x == otra.x && y == otra.y;
    }
    
    @Override
    //imprime las coordenadas
    public String toString() {
        return "(" + x + "," + y + ")";
    }

}
