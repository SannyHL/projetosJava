package bootdio.exercicios.java.loop;

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int i = 0;
        int maior = 0;
        double media;
        double soma= 0;
        do {
            System.out.println("Insira um número: ");
            numero =  scan.nextInt();

            soma = soma + numero;
            media = soma / 5;
            if (numero > maior) maior = numero;
            ++i;
        } while (i < 5);

        System.out.println("O maior número informado foi: " + maior);
        System.out.println(" A média dos números é: " + media);
    }
}
