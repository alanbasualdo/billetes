package com.mycompany.billetes;

import java.util.Scanner;

/**
 *
 * @author AlanB
 */
public class Billetes {

    public static void main(String[] args) {
        
        Scanner scc = new Scanner(System.in);
        
        // Instancio el objeto
        Valores money = new Valores();

        int monto = 1;

        // Cuando el usuario ingrese 0 o un número negativo se detiene el proceso
        while (monto > 0) {
            
            System.out.print("Ingresar monto, (0 para salir): ");
            monto = scc.nextInt();
            money.Cambiador(monto);
            System.out.println();
        }
        
        if (monto <= 0){
            System.out.println("Fin del programa!");
        }

    }

}
