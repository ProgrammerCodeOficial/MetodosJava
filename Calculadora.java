/*
 * Classe de exemplo para o exercício da Aula 1 de Métodos da DIO
 */

public class Calculadora {

    // Visibilidade - Modificador - Retorno nao tem retorno pq eh void - Nome do
    // Metódo - Parametros
    public static void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.println(" O soma de " + numero1 + " + " + numero2 + " = " + resultado);
    }

    public static void subratacao(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        System.out.println(" A subratação de " + numero1 + " - " + numero2 + " = " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        System.out.println(" A multiplicação de " + numero1 + " x " + numero2 + " = " + resultado);
    }

    public static void divisao(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        System.out.println(" A divisão de " + numero1 + " / " + numero2 + " = " + resultado);
    }
}
