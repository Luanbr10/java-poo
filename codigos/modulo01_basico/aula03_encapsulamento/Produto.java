public class Produto{
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    // Para os metodos Get e Set
    
    // GET, devemos informar o seu tipo, já que ele irá retornar para nós este valor.
    public String getNome(){
        return this.nome;
    }

    // SET, não iremos retornar nada, então deve ser do tipo void, iremos manipular o atributo.
    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double novoPreco){
        if (novoPreco <= 0){
            System.out.println("ERRO, preco não pode ser negativo");
        }
        else{
            this.preco = novoPreco;
            System.out.println("Preco alterado com sucesso");
        }
    }
}
