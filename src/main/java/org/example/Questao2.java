package org.example;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string:");
        String string = scanner.nextLine();

        int cont = 0;
        for (int i = 0; i < string.length(); i++) {
            char caracter = string.charAt(i);
            if(caracter == 'a' || caracter == 'A'){
                cont++;
            }

        }

        if (cont > 0){
            System.out.println("A letra 'a' aparece " + cont + " vezes.");
        }else {
            System.out.println("A letra 'a' não aparece.");
        }
    }
}
