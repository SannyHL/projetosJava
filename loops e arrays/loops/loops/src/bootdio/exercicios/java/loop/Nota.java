package bootdio.exercicios.java.loop;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int nota;

        System.out.println("Informe a nota: ");
        nota = scan.nextInt();

        while (nota < 0| nota > 10) {
            System.out.println("Valor inválido! Digite novamente: ");
            nota = scan.nextInt();
        }

    }
}
