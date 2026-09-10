/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1vo;

/**
 *
 * @author estuam
 */
public class Banco {
    public static void main(String[] args) {
       
CuentaBancaria c1 = new CuentaBancaria();
c1.titular = "iron man";
c1.saldo = (int) 40;
    
System.out.println( "Titular: " + c1.titular + " y saldo: " + c1.saldo);
    
c1.Consignar(10);
c1.Retirar(30);
c1.Retirar(70);
    


CuentaBancaria c2 = new CuentaBancaria();
c2.titular = "capi";
c2.saldo = (int) 70;

System.out.println( "Titular: " + c2.titular + " y saldo: " + c2.saldo);

c2.Consignar(100);
c2.Retirar(50);
c2.Retirar(30);
    }   
 


}