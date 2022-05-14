package com.mycompany.billetes;

/**
 *
 * @author AlanB
 */
public class Valores {
    
    public void Cambiador(int monto){
        int cienPesos = 0, cincuentaPesos = 0, veintePesos = 0, diezPesos = 0, cincoPesos = 0, unPeso = 0;
        
        // Ej: Monto = 186
        // Almaceno en "cienPesos" la cantidad de billetes de $100 que se van a utilizar
        cienPesos = monto/100; // Ej: cienPesos = 1
        // Obtengo el  resto de la resta, en caso de que haya resto
        monto = monto - (cienPesos * 100); // Ej: monto = 86
        
        cincuentaPesos = monto/50; // Ej: cincuentaPesos = 1
        monto = monto - (cincuentaPesos * 50); // Ej: monto = 36
        
        veintePesos = monto/20; // Ej: veintePesos = 1
        monto = monto - (veintePesos * 20); // Ej: monto = 16
        
        diezPesos = monto/10; // Ej: diezPesos = 1
        monto = monto - (diezPesos * 10); // Ej: monto = 6
        
        cincoPesos = monto/5; // Ej: cincoPesos = 1
        monto = monto - (cincoPesos * 5); // Ej: monto = 1
        
        unPeso = monto/1; // Ej: unPeso = 1
        monto = monto - (unPeso * 1); // Ej: monto = 0
        
        // Imprime la cantidad de billetes que se utilizaron de cada valor, siempre que se haya utilizado al menos uno
        if (cienPesos > 0){
            System.out.println("Billetes de $100: " + cienPesos);
        }
        if (cincuentaPesos > 0){
            System.out.println("Billetes de $50: " + cincuentaPesos);
        }
        if (veintePesos > 0){
            System.out.println("Billetes de $20: " + veintePesos);
        }
        if (diezPesos > 0){
            System.out.println("Billetes de $10: " + diezPesos);
        }
        if (cincoPesos > 0){
            System.out.println("Billetes de $5: " + cincoPesos);
        }
        if (unPeso > 0){
            System.out.println("Billetes de $1: " + unPeso);
        }
        
    }
    
}
