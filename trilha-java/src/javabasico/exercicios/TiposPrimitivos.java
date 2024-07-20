package javabasico.exercicios;

public class TiposPrimitivos {
    public static void main(String[] args) {
       /* Declare variáveis de cada tipo de dado primitivo em Java e atribua valores a elas.
        byte
        short
        int
        long
        float
        double
        boolean
        char*/
        byte variavel1 = 1;
        short variavel2 = 22266;
        int variavel3 = 2590;
        long variavel4 = 4294967295L;
        float variavel5 = 3.14f;
        double variavel6 = 3.14;
        boolean variavel7 = true;
        char variavel8 = 'A';
        //Realize operações matemáticas básicas com as variáveis, como soma, subtração, multiplicação e divisão.
        byte resultado = 4-3;
        short resultado2 = 85+7874;
        int resultado3 = 235*456;
        long resultado4 = 456789L*994840l;
        float resultado5 = 3.14f+3.19f;
        double resultado6 = 3.14d /3;
        boolean resultado7 = true;
        char resultado8 = 'A' + 'B';

        //conversão Explicita
        int resultado9 = (int) resultado5;
        float resultado10 = (float) resultado6;

        String numero = "154.67";
        double numeroDouble = Double.parseDouble(numero);
        System.out.println(numeroDouble);

        String numero0 = "974";
        int numero2 = Integer.parseInt(numero0);
        System.out.println(numero2);

        double numero3 = 199.44;
        String texto = Double.toString(numero3);
        System.out.println(texto);


    }
}
