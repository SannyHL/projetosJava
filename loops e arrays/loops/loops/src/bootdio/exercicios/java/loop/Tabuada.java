package bootdio.exercicios.java.loop;

import java.util.Scanner;


public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual tabuada deseja ver? ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de: " + tabuada);

        for ( int i=1 ; i <= 10 ; i++ ) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i) );
        }
    }
}
