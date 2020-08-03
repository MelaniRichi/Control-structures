package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Realice el diagrama de flujo y el pseudocódigo que muestren el algoritmo para
//        determinar el costo y el descuento que tendrá un artículo. Considere que si su precio es
//        mayor o igual a $200 se le aplica un descuento de 15%, y si su precio es mayor a $100
//        pero menor a $200, el descuento es de 12%, y si es menor a $100, sólo 10%.

        //Se definen las variables
        double productPrice, discount, finalPrice;

        //Habilitar el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Solicitar datos al usuario
        System.out.print("ïngrese el precio del producto: ");
        productPrice = keyboard.nextDouble();

        //Se determinna el precio final del producto
        if (productPrice >= 200) {
            discount = productPrice * 0.15;
        } else if (productPrice >= 100) {
            discount = productPrice * 0.12;
        } else {
            discount = productPrice * 0.10;

        }
        //Se le resta el descuento al precio del producto
        finalPrice = productPrice - discount;

        //Se muestra el resultado
        System.out.println("El precio final del producto es de: " +finalPrice + " con un descuento de : "+discount );

    }
}
