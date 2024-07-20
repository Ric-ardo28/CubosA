package javabasico.exercicios;

import java.util.Scanner;

public class VariaveisConstantes {
    public static void main(String[] args) {
    /*Crie um programa que declare e inicialize variáveis para armazenar os seguintes dados:
    Nome completo
    Idade
    Altura
    Salário
    É casado? (true ou false)*/
        //variaveis
        System.out.println("Variaveis");

        String nome = "Ricardo Rodrigues Santana";
        int idade = 37;
        System.out.println();
        double altura = 1.75;
        double salario = 3000.00;
        boolean casado = true;
        /*Crie constantes para representar:
        A taxa de Imposto de Renda (porcentagem)
        O valor da passagem de ônibus
        O ano atual*/
        //constantes
        final double taxaImposto = 7.5;
        final double valorPassagem = 5.00;
        final int ano = 2024;
        //Exiba na tela os valores das variáveis e constantes.
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Salario: " + salario);
        System.out.println("Casado: " + casado);
        System.out.println("--------------------------------");
        System.out.println("Taxa imposto de renda : " + taxaImposto);
        System.out.println("Valor da passagem: " + valorPassagem);
        System.out.println("Ano: " + ano);

    }
}
