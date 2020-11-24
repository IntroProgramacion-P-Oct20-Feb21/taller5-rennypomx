/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HOLA
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String descripcion;
        int cantidad;
        double precioUnitario;
        double total;
        double descuento;
        double descuentoNulo = 0.00;
        double descuentoTotal;
        
        System.out.println("Ingresar descripción del artículo");
        descripcion = entrada.nextLine();
        System.out.println("Ingresar cantidad de unidades requeridas "
                + "del artículo");
        cantidad = entrada.nextInt();
        System.out.println("Ingresar el precio unitario del artículo");
        precioUnitario = entrada.nextDouble();
        
        total = cantidad * precioUnitario;
        descuento = total * 0.15;  //15%
        descuentoTotal = total - descuento;
        
        if (cantidad > 50) {
            System.out.printf("Decripción: %s\nNúmero de unidades requeridas: "
                    + "%d\nSubtotal: $%.2f\nDescuento 15%%: $%.2f\n"
                    + "Total a pagar: $%.2f\n",
                    descripcion,
                    cantidad,
                    total,
                    descuento,
                    descuentoTotal);
        } else {
            System.out.printf("Decripción: %s\nNúmero de unidades requeridas: "
                    + "%d\nSubtotal: $%.2f\nDescuento 0%%: $%.2f\n"
                    + "Total a pagar: $%.2f\n",
                    descripcion,
                    cantidad,
                    total,
                    descuentoNulo,
                    total);
        } 
    } 
}
