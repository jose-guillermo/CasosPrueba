/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.casosprueba;

/**
 *
 * @author joseg
 */
public class CasosPrueba {

    public static void main(String[] args) {
         CCuenta miCuenta;
        double saldoActual;

        miCuenta = new CCuenta("Marta Ruiz", "1000-2365-85-123456789", 4000);
        try {
            miCuenta.retirar(3600);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }

        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(995);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es" + saldoActual);
    }
}
