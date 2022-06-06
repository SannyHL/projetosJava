package Boot.dio.java.arrays;

public class OrdemInversa {
    public static void main(String[] args) {

        int [] vetor = {3, 6, 9, 8, 4, 2};

        System.out.print("Vetor: ");
        int i = 0;
        while (i < vetor.length) {
            System.out.print(vetor[i] + " ");
            i++;
        }

        System.out.print("\nVetor inverso: ");
        for(int b = (vetor.length - 1); b >= 0; b--) {
            System.out.print(vetor[b] + " ");
        }
    }
}
