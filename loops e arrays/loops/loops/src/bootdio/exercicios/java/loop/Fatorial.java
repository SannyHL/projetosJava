package bootdio.exercicios.java.loop;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();
        int multiplica = 1;

        System.out.print(fatorial + "! = ");
        for (int i = fatorial ; i >= 1 ; i--) {
            multiplica = multiplica * i;
        }

        System.out.println(multiplica);
    }
}
