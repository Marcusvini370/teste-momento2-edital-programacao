import java.util.Arrays;
import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        int valores[] = new int[6];
        int j = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Por Favor digitar somente números inteiros!");
        for (int i = 0; i < valores.length ; i++) {
            System.out.print("Digite o " + (i + j) + "º Valor: ");
            valores[i] = input.nextInt();
        }
        input.close();

        int maiorValor = valores[0], maiorIndice = 0;
        int menorValor = valores[0], menorIndice = 0;
        for (int i = 0; i < valores.length; i++) {


            if (valores[i] > maiorValor) {
                maiorValor = valores[i];
                maiorIndice = i;
            }
            if (valores[i] < menorValor) {
                menorValor = valores[i];
                menorIndice = i;
            }
        }

        System.out.printf("O Maior valor do vetor é %d, encontrado na posição %d %n", maiorValor, maiorIndice);
        System.out.printf("O Menor valor do vetor é %d, encontrado na posição %d %n", menorValor, menorIndice);

        Arrays.sort(valores);
        System.out.println(Arrays.toString(valores));


    }

}
