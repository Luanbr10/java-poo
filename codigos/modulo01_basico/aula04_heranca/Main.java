public class Main{
    public static void main(String args[]){
        Guerreiro cavaleiro = new Guerreiro("cavaleiro", 8, 100, 80);

        cavaleiro.atacar();
        cavaleiro.usarEscudo();

        System.out.println("Características do GURREIRO");
        System.out.println();

        cavaleiro.exibirCaracteristicas();
    }
}