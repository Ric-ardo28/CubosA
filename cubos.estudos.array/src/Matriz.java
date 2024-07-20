public class Matriz {
    public static void main(String[] args) {


        int matrizA[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = i + j;
            }

        }

        int matrizB[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[i][j] = i + j;
            }
        }

        System.out.println("Matriz A:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\nMatriz B:");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {

                System.out.print(matrizB[i][j] + " ");

            }
            System.out.println("");
        }


        System.out.println("\nMatriz C é a soma da Matriz A, com Matriz B:");
        int matrizC[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizC[i][j] = matrizA [i][j] + matrizB [i][j];
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println("");
        }


    }

}



