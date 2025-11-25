package exercicios;
//import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        // Gostaria que você me ensinasse a usar essa clase Scanner ler = new Scanner(null);

        Funcionario estagiario = new Funcionario("luan", "440.131;252-26", 1000);
        Gerente gerente = new Gerente("Dilson", "992.142.554-74", 10000, "Secretária Publica", 0510);

        estagiario.exibirDadosFuncionario();
        System.out.println();
        System.out.println();

        gerente.autenticar(0510);
        gerente.exibirDadosGerente();
    }
}
