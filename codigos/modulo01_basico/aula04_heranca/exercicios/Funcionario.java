package exercicios;

public class Funcionario{
    protected String nome;
    protected String cpf;
    protected double salario;
    
    public Funcionario(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome(){
        return this.nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public double getSalario() {
        return salario;
    }

    public void exibirDadosFuncionario(){
        System.out.println("Nome -> "+getNome());
        System.out.println("CPF -> "+getCpf());
        System.out.println("Salario -> "+getSalario());
    }
}
