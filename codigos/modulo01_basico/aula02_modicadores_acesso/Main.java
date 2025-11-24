package codigos.modulo01_basico.aula02_modicadores_acesso;

public class Main {
    public static void main(String args[]){

        ContaBancaria minhaconta = new ContaBancaria("Luan Borges");

        // conta.saldo = 1000; ERRO de compilição, o atributo saldo é private, apenas a sua propria classe (ContaBancaria) pode manipular ele, ou um método publico que a classe criar.
        // POr isso que foi feito abaixo esta manipulação
        
        minhaconta.sacar(100);
        minhaconta.depositar(1000);
        minhaconta.sacar(300);
        minhaconta.exibirDetalhes();
    }
}
