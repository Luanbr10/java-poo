public class Main {
    public static void main(String args[]){
        Produto novoProduto = new Produto("leite", 10);
        
        System.out.println(novoProduto.getNome());
        System.out.println(novoProduto.getPreco());


        System.out.println();

        novoProduto.setNome("arroz");
        novoProduto.setPreco(0);
        novoProduto.setPreco(7);

        System.out.println();

        System.out.println(novoProduto.getNome());
        System.out.println(novoProduto.getPreco());


    }
}
