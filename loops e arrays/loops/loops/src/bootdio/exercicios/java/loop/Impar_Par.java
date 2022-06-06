package bootdio.exercicios.java.loop;


import java.util.Scanner;

public class Impar_Par {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int i = 0;
        int numero;
        int quantpar = 0, quantimpar = 0;

        System.out.println("Quantos números deseja digitar? ");
        quantNumeros =  scan.nextInt();
             do {
                 System.out.println("Número: ");
                 numero = scan.nextInt();

                 if (numero % 2 == 0) quantpar ++;
                 else quantimpar++;
                 ++i;
           }while (i < quantNumeros);

        System.out.println("Quantidade de números pares: " + quantpar);
        System.out.println("Quantidade de números ímpares: " + quantimpar);
    }
}
