package one.digitalinnovation.basecamp;

public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício calculadora");
        //Calculadora é o nome da classe, depois colocamos o . para chamarmos o método somar,
        // criado na classe Calculadora
        Calculadora.soma(5, 9);
        Calculadora.subtracao(9, 6);
        Calculadora.multiplicacao(2, 4);
        Calculadora.divisao(10, 5);

        //Mensagem
        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem(12);
        Mensagem.obterMensagem(17);
        Mensagem.obterMensagem(05);
        Mensagem.obterMensagem(24);


        //Emprestimo
        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1500, Emprestimo.getTresParcelas());
        Emprestimo.calcular(2500, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(6000, 6);
    }
}
