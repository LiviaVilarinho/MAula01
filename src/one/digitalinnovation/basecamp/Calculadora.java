package one.digitalinnovation.basecamp;

public class Calculadora {

    //metodo publico e estatico. Void significado que ele não terá retorno.
    //soma é o nome do método e dentro de () estão os parâmetros.
    public static void soma (double num1, double num2) {

        double resultado = num1 + num2;

        System.out.println("O resultado da Soma é: " + resultado);
    }

    public static void subtracao (double num1, double num2) {

        double resultado = num1 - num2;

        System.out.println("O resultado da Subtração é: " + resultado);
    }

    public static void multiplicacao (double num1, double num2) {

        double resultado = num1 * num2;

        System.out.println("O resultado da Multiplicação é: " + resultado);
    }

    public static void divisao (double num1, double num2) {

        double resultado = num1 / num2;

        System.out.println("O resultado da Divisão é: " + resultado);
    }
}
