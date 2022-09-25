/* 
 * A classe principal dos exercicios da Aula 1 de Métodos da DIO
 */

public class Main {
    public static void main(String[] args) {

        // Calculadora
        System.out.println(" ========== Exercicio Calculadora ==========");

        // Classe.metodo(parametros) Obs: O static possibilita chamar um metodo apartir
        // de uma classe
        Calculadora.soma(1.5, 4.5);
        Calculadora.subratacao(1.5, 4.5);
        Calculadora.multiplicacao(1.5, 4.5);
        Calculadora.divisao(1.5, 4.5);

        // Mensagem
        System.out.println(" ========== Exercicio Mensagem ==========");
        // classe.metodo(parametros)
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(2);

        // Emprestimo
        System.out.println(" ========== Exercicio Emprestimo ==========");

        // classe.metodo (parametro, metodo com parametro)
        Emprestimo.calcular(2000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(2000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(2000, 5);
    }

}
