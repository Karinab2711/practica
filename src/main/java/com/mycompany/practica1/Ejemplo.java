
package com.mycompany.practica1;

import java.util.Scanner;

public class Ejemplo {

    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in); 
    int numero1, numero2, suma = 0,resta=0;
    String nombre;
    System.out.println("Ingrese un nombre");
    nombre=scanner.nextLine();
    System.out.println("Ingrese un numero entero");
    numero1 = scanner.nextInt();
    System.out.println("Ingrese un nombre");
    numero2=scanner.nextInt();
    suma=numero1+numero2;
    resta=numero1-numero2;
    System.out.println("El nombre es: "+ nombre);
    System.out.println("El primer número es: "+numero1);
    System.out.println("El segundo número es: "+numero2);
    System.out.println("El resultado de la suma: "+suma);
    System.out.println("El resultado de la resta es: "+resta);
    scanner.close(); 
    }
}
