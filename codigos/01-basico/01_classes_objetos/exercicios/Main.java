package modulo01_fundamentos.aula01_classes_objetos.exercicios;

public class Main {
    public static void main(String args[]){
        Livro Livro1 = new Livro("Clean Code", "Robert.C Marin", 102.90);
        // Livro Livro2 = new Livro("Senhor dos Aneis", "J.R.R Tolkien", 149.99);

        Livro1.vender(5);
        Livro1.adicionarEstoque(10);
        Livro1.vender(3);
        Livro1.exibirDetalhes();
    }
}
