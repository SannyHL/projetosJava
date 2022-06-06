package primeiraaula.java.bootdio;

public class Calculadora {

    public static void soma(int num1, int num2) {
        int resultado = num1 + num2;
        System.out.println("O resultado da soma de " + num1 + " e " + num2 + " é " + resultado);
    }
    public static void subtracao(int num1, int num2) {
        int resultado = num1 - num2;
        System.out.println("O resultado da subtração de " + num1 + " e " + num2 + " é " + resultado);
    }
    public static void divisao(double num1, double num2) {
        double resultado = num1 / num2;
        System.out.println("O resultado da divisão de " + num1 + " e " + num2 + " é " + resultado);
    }
    public static void multiplicacao(int num1, int num2) {
        int resultado = num1 * num2;
        System.out.println("O resultado da multiplicação de " + num1 + " e " + num2 + " é " + resultado);
    }
}
