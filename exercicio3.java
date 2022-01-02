public class exercicio3 {

    public static void main(String[] args) {
        int matrizA[][] = new int [3][2];
        int matrizB[][] = new int [3][2];
        int matrizC[][] = new int [3][2];

        for (  int i =0; i < 3; i++) {
            for (int j =0; j < 2; j++) {

                matrizA[i][j]= i + j;
                matrizB[i][j]= i + j;

                matrizC[i][j] = matrizA[i][j] +  matrizB[i][j];
            }
        }

        System.out.println("Matriz A");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizA[i][j] + " " );
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz B");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizB[i][j] + " " );
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz C");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizC[i][j] + " " );
            }
            System.out.println("");
        }


        }
    }