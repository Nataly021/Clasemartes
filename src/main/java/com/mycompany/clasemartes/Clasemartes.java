package com.mycompany.clasemartes;

import java.util.Scanner;

public class Clasemartes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese la nota del estudiante: ");
        String entrada = teclado.nextLine(); // Leemos como texto
        
        try {
            // Intentamos convertir el texto a decimal
            double nota = Double.parseDouble(entrada);
            
            // Validamos que esté en el rango permitido
            if (nota < 0 || nota > 100) {
                System.out.println("Error: La nota debe estar entre 0 y 100.");
            } else {
                System.out.println("Nota registrada con exito: " + nota);
            }
            
        } catch (NumberFormatException e) {
            // Se ejecuta si el usuario escribe letras en lugar de números
            System.out.println("Error: Entrada no valida. Por favor, ingrese solo numeros.");
        }
        
        teclado.close();
    }
}