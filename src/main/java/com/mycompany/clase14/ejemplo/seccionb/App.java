/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clase14.ejemplo.seccionb;

import java.util.Scanner;

/**
 *
 * @author miguelcatalan
 */
public class App {

    public static void main(String[] args) {
        float num1= 0.0f, num2 = 0.0f;
        int operacion;
        String respuesta;
        
        respuesta = "s";

        while (respuesta.toLowerCase().equals("s")) {

            operacion = 0;

            Scanner scan = new Scanner(System.in);

            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicación");
            System.out.println("4.- División");
            System.out.print("Ingrese la operación que desea realizar: ");

            operacion = scan.nextInt();

            switch (operacion) {
                case 1:
                    System.out.println("La suma es :" +suma(num1, num2));
                        break;
                case 2: 
                    System.out.println("La Resta es :" + resta(num1, num2));
                        break;
                case 3: //resultado = operandoUno * operandoDos;
                    System.out.println("La Multiplicación es :" + multi(num1, num2));
                        break;
                case 4: //resultado = operandoUno / operandoDos;
                    System.out.println("La División es :" + division(num1, num2));
                        break;
                default:System.out.println("Opción ingresada no es válida."); 
                        break;
            }
            
            System.out.print("Desea realizar otra operacion? (s/n) ");
            respuesta = scan.next();
        }
    }
    
    // Agregar nuevos métodos aquí
    public static float suma(float operandoUno, float operandoDos ) {
        float resultado;
     
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese primer operando: ");
        operandoUno = scan.nextFloat();
        
        System.out.print("Ingrese segundo operando: ");
        operandoDos = scan.nextFloat();
        
        resultado = operandoUno + operandoDos;
       
        return  resultado;
        
        
        
    }
    //--------------------Resta-----------------------------
    public static float resta(float operandoUno, float operandoDos ) {
        float resultado;
     
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese primer operando: ");
        operandoUno = scan.nextFloat();
        
        System.out.print("Ingrese segundo operando: ");
        operandoDos = scan.nextFloat();
        
        resultado = operandoUno - operandoDos;
       
        return  resultado; 
    }
    
    
    //-------------------Multiplicación------------------------------
    public static float multi(float operandoUno, float operandoDos ) {
        float resultado;
     
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese primer operando: ");
        operandoUno = scan.nextFloat();
        
        System.out.print("Ingrese segundo operando: ");
        operandoDos = scan.nextFloat();
        
        resultado = operandoUno * operandoDos;
       
        return  resultado; 
    }
    
    //-------------------division----------------------------
    public static float division(float operandoUno, float operandoDos ) {
        float resultado;
     
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese primer operando: ");
        operandoUno = scan.nextFloat();
        
        System.out.print("Ingrese segundo operando: ");
        operandoDos = scan.nextFloat();
        
        resultado = operandoUno / operandoDos;
       
        return  resultado; 
    }
}
