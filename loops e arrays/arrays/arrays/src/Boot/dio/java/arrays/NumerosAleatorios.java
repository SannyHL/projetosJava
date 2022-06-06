package Boot.dio.java.arrays;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random randow = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++){
            int numero = randow.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.print("Números aletórios: ");
        for ( int numero : numerosAleatorios ) {
            System.out.print(numero + " ");
        }
        System.out.print("\nNúmeros sucessores: ");
        for ( int numero : numerosAleatorios ) {
                    System.out.print((numero+1) + " ");

        }
    }
}
