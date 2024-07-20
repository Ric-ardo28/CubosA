package javabasico.exercicios;

import java.util.Scanner;

public class ContaSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       int op = 0;

        while (op != 9) {
            System.out.println("Digite a operação desejada : ");

            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Sacar dinheiro");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("9 - Sair ");
            op = scan.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Seu saldo é de $1.000");
                    break;
                case 2:
                    System.out.println("Saque realizado com sucesso");
                    break;
                case 3:
                    System.out.println("Deposito realizado com sucesso");
                    break;
                default:
                    System.out.println("Sair ....... ");

            }
        }


    }
}
