package javabasico.exercicios;

import java.util.Scanner;

public class Condicaoswitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op =0;
        while (op != 9) {
        System.out.println("Digite uma opção do Menu :");
        op = scan.nextInt();
        System.out.println("1 - Salada");
        System.out.println("2 - Frango");
        System.out.println("3 - Carne");
        System.out.println("4 - Sobremesa");
        System.out.println("9 - Sair");


            switch (op) {
                case 1:
                    System.out.println("Salada de alface e tomate ");
                    break;
                case 2:
                    System.out.println("File de frango ");
                    break;
                case 3:
                    System.out.println("File de carne ");
                    break;
                case 4:
                    System.out.println("Brigadeiro de sobremesa ");
                    break;
                case 9:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Entrada invalida ");
                    break;
            }
        }

    }
}
