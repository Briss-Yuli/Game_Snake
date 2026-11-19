/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package game_snake;
import estructuras.ListaEnlazada;
/**
 *
 * @author HP
 */
public class Game_Snake {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEnlazada<Integer> lista = new ListaEnlazada<>();
        System.out.println("el cuerpo de la serpiente esta vacia " + lista.estaVacia());

        lista.insertarInicio(10);
        lista.insertarInicio(20);
        lista.insertarFinal(5);

        lista.mostrar();
        System.out.println("El tamaño del cuerpo de la serpiente es: " + lista.getTamano());
    }
}





