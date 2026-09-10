/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1vo;

/**
 *
 * @author estuam
 */
public class CuentaBancaria {
    public String titular;
    public double saldo;
    public int numeroTransacciones = 0;
    
    public void Consignar(double monto){
        saldo += monto;
        System.out.println( "Nuevo saldo: " + saldo);}
        
    
    public void Retirar (double monto){
        if (monto <= saldo){
            saldo -= monto;
            numeroTransacciones++;
        System.out.println("retiro realizado. nuevo saldo: " + saldo);
        
        }
        else{ 
            System.out.println("fondos insuficientes");
        
        }
    }
    
    public double consultarSaldo() {
        return saldo;
        
    }
    
    public void trasferir(CuentaBancaria destino, double monto){
        if (monto <= 0){
            System.out.println("Error: El monto debe ser mayor a cero.");
        }
        else if (monto <= saldo){
            this.saldo -= monto;
            destino.saldo  += monto;
            this.numeroTransacciones++;
            destino.numeroTransacciones++;
            System.out.println("Transferencia exitosa: " + destino.titular);
            
        }
        else{
            System.out.println("Error. fondos insuficientes para trasferir. ");
        
        }
    }   
    public void retirar(double monto){
        if (monto <= 0){
        saldo += monto;
        numeroTransacciones++;
            System.out.println("Nuevo saldo: " + saldo);
        }
        else{
        System.out.println("Error: el monto a retirar debe ser mayor a cero. ");
    }
    
    
}

} 
            

