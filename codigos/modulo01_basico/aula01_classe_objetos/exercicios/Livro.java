package  codigos.modulo01_basico.aula01_classe_objetos.exercicios;

public class Livro {
    String titulo;
    String autor;
    Double preco;
    int estoque;

    public Livro (String titulo, String autor, Double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.estoque = 0;
    }

    void adicionarEstoque(int qnt){
        this.estoque += qnt;
        System.out.println("Estoque atualizado para " +this.estoque);
    }

    void vender(int qnt){
        if (estoque >= qnt){
            this.estoque -= qnt;
            System.out.println(qnt + " Unidades de " + titulo + " Foram vendidas");
        }
        else{
            System.out.println("Estoque insuficente para a venda de "+titulo);
        }
    }

    void exibirDetalhes(){
        System.out.println();
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: " +autor);
        System.out.println("Preco: R$" +preco);
        System.out.println("Quantidade: " +estoque);
    }
}
