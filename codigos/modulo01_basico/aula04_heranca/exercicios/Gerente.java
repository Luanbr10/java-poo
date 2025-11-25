package exercicios;

public class Gerente extends Funcionario{
    private String departamento;
    private int senha;

    public Gerente(String nome, String cpf, double salario, String departamento, int senha){
        super(nome, cpf, salario);

        this.departamento = departamento;
        this.senha = senha;
    }

    public void autenticar(int senhaTentativa){
        if (this.senha == senhaTentativa){
            System.out.println("Acesso Permitido ao sistema de Gerência");
        }
        else{
            System.out.println("Acesso Negado");
        }
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public int getSenha() {
        return this.senha;
    }

    public void exibirDadosGerente(){
        super.exibirDadosFuncionario();
        System.out.println("Departamento -> " + getDepartamento());
        System.out.println("Senha -> "+ getSenha());

    }
}