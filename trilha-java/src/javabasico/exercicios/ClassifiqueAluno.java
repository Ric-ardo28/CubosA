package javabasico.exercicios;

import java.util.Scanner;

public class ClassifiqueAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma faixa etaria infatil, juvenil, aduto, idoso: ");
         String faixaEtaria = scan.next();

        switch (faixaEtaria){
            case "infantil":
                System.out.println("0 a 7 anos");
                break;
            case "juvenil":
                System.out.println("8 a 17 anos");
                break;
            case "adulto":
                System.out.println("18 a 64 anos");
                break;
            case "idoso":
                System.out.println("acima de 65 anos");
                break;
            default:
                System.out.println("Faixa etaria invalida ");
        }
    }
}
