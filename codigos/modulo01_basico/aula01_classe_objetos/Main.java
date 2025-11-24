package codigos.modulo01_basico.aula01_classe_objetos;

public class Main {
    public static void main(String args[]){
        Carro meuCarro = new Carro("Fusca", "Azul", 1997, false);


        // Chamando os comportamentos que o meu objeto pode exercer, chamar a partir do 'nome_objeto.comportamento()'
        meuCarro.acelerar();
        meuCarro.ligar();
        meuCarro.acelerar();
        meuCarro.ligar();
    }
}