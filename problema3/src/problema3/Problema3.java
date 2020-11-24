/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HOLA
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        entrada.useLocale( Locale.US);
        
        String marca;
        String origen;
        double costo;
        double impuestoAlemania;
        double impuestoJapon;
        double impuestoItalia;
        double impuestoUsa;
        double totalAlemania;
        double totalJapon;
        double totalItalia;
        double totalUsa;
                
        System.out.println("Ingresar la marca del automóvil");
        marca = entrada.nextLine();
        System.out.println("Ingresar país de origen del automóvil:"
                + "\n-Alemania\t-Japon\n-Italia\t\t-USA");
        origen = entrada.nextLine();
        System.out.println("Ingresar costo del automóvil");
        costo = entrada.nextDouble();
        
        impuestoAlemania = costo *0.2;  //20%
        impuestoJapon = costo *0.3;  //30%
        impuestoItalia = costo *0.15;  //15%
        impuestoUsa = costo *0.08;  //8%
        totalAlemania = costo + impuestoAlemania;
        totalJapon = costo + impuestoJapon;
        totalItalia = costo + impuestoItalia;
        totalUsa = costo + impuestoUsa;
        
        if (origen.equals("Alemania")) {
            System.out.printf("Marca de automovil: %s\nPaís de origen: %s\n"
                + "Costo inicial $%.2f\nImpuesto por pagar 20%%: $%.2f\n"
                + "Precio de venta: $%.2f\n",
                marca,
                origen,
                costo,
                impuestoAlemania,
                totalAlemania);
        }
        if (origen.equals("Japon")) {
            System.out.printf("Marca de automovil: %s\nPaís de origen: %s\n"
                + "Costo inicial $%.2f\nImpuesto por pagar 30%%: $%.2f\n"
                + "Precio de venta: $%.2f\n",
                marca,
                origen,
                costo,
                impuestoJapon,
                totalJapon);
        }
        if (origen.equals("Italia")) {
            System.out.printf("Marca de automovil: %s\nPaís de origen: %s\n"
                + "Costo inicial $%.2f\nImpuesto por pagar 15%%: $%.2f\n"
                + "Precio de venta: $%.2f\n",
                marca,
                origen,
                costo,
                impuestoItalia,
                totalItalia);
        }
        if (origen.equals("USA")) {
            System.out.printf("Marca de automovil: %s\nPaís de origen: %s\n"
                + "Costo inicial $%.2f\nImpuesto por pagar 8%%: $%.2f\n"
                + "Precio de venta: $%.2f\n",
                marca,
                origen,
                costo,
                impuestoUsa,
                totalUsa);
        } 
    }
}
