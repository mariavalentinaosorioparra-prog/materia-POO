/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte2vo;

/**
 *
 * @author estuam
 */
public class Productos {
public String nombre;
public double precio;
public int stock;

public void registrarVenta(int cantidad){
     if (cantidad <= stock){
            stock -= cantidad;
        System.out.println("Stock actualizado. nuevo Stock: " + stock);}
        else{ 
            System.out.println("no hay unidades");
}
}

public void reponer(int cantidad){
     if (cantidad >= stock){
            stock += cantidad;
        System.out.println("Stock actualizado. nuevo Stock: " + stock);}
}

public void mostrarInformacion(){
    System.out.println("nombre: " + nombre);
    System.out.println("precio: " + precio);
    System.out.println("stock: " + stock);

}
}

