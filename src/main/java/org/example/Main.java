package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // entradas del problema
        Scanner leerDato = new Scanner(System.in);
        String nombreProducto;
        String nombreDistriibubidor;
        double costoLote;
        double costoVentaPublico;
        double totalCompra ;
        int catidadCompraProductos;


        //proceso

        System.out.println("**************");
        System.out.println("frugal S.A.S");
        System.out.println("***********");

        System.out.println("1, digita el producto que desea almacenar");
        nombreProducto=leerDato.nextLine();

        System.out.println("digite nombre de dsitribuidor");
        nombreDistriibubidor=leerDato.nextLine();

        System.out.println("cual es el costo del lote");
        costoLote=leerDato.nextDouble();

        System.out.println("cual es el costo al publico");
        costoVentaPublico=leerDato.nextDouble();

        System.out.println("ingrase la cantdad de productos");
        catidadCompraProductos=leerDato.nextInt();

        System.out.println("******************************");
        System.out.println("resumen del ingreso de la mercancia");
        System.out.println("lote que entra: " + nombreProducto);
        System.out.println("digite nombre del distribuidor:  " + nombreDistriibubidor);
        System.out.println("cual es el costo del lote:   " + costoLote);
        System.out.println("cuel es el costo al publico:   "+ costoVentaPublico);
        System.out.println("ingrese la cintidad del productos:   "+catidadCompraProductos);
        System.out.println("******************************");

        System.out.println("\n++++++venta al detal+++++++ \n");
        costoVentaPublico=5000;

        System.out.println("apreciado usuario el coto unitario de:  " + nombreProducto     +   "es de " + costoVentaPublico);
        System.out.println("digita la cantidad de" + nombreProducto + "que quiere llevar" );
        catidadCompraProductos=leerDato.nextInt();

        // calculado el valor del producto//
        totalCompra=costoVentaPublico * catidadCompraProductos;

        System.out.println( "el total de su compra es de : $" + totalCompra);



    }
}