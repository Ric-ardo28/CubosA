package javabasico.exercicios;

import java.util.Scanner;

public class CondicaoIf {
    public static void main(String[] args) {
        /*Crie um programa que solicite ao usuário a digitação de uma nota e determine se ele foi
        aprovado ou reprovado na disciplina,considerando a nota mínima de aprovação como 7.0. */
        Scanner scan = new Scanner(System.in);
        /*System.out.println("Digite um nota : ");
        double nota = scan.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }*/

        /*System.out.println("Digite o tipo de veiculo Carro, Moto, Caminhão :");
        String veiculo = scan.next();

        if (veiculo.equals("carro")) {
            System.out.println("Tarifa de carro $ 5.00");
        } else if (veiculo.equals("moto")) {
            System.out.println("Tarifa de moto $ 2.50");
        } else if (veiculo.equals("caminhao")) {
            System.out.println("Tarifa de caminhão $ 10.00");
        }else {
            System.out.println("veiculo invalido ");
        }*/

        int a = 1754;
        int b = 10;
        int c = 3;

        if(a > b && a > c){
            System.out.println(" A é maior ");
        } else if (b > a && b > c) {
            System.out.println(" B é maior ");
            }else{
            System.out.println("C é maior");
        }
        System.out.println("a = " + a + " b = " + b + " c = " + c );

    }
}
