package modulo01_fundamentos.aula01_classes_objetos;

public class Carro {

    // Defindo os atributos do meu 'Carro'
    String modelo;
    String cor;
    int ano;
    boolean ligado;
    
    // Classe construtora, uma forma mais simples de organizar os atributos da minhas instância.
    public Carro(String modelo, String cor, int ano, boolean ligado){
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.ligado = ligado;
    }

    // Definindo comportamentos dos meus objetos.
    void ligar(){
        if (!ligado){
            ligado = true;
            System.out.println("O " + modelo + " está ligado agora!");
        }
        else{
            System.out.println("O " + modelo + " Já estava ligado");
        }
    }

    void acelerar(){
        if (ligado){
            System.out.println("O " +modelo+ " está acelerando. VRUM!!!");
        }

        else{
            System.out.println("O " +modelo+ " não pode acelerar, está desligado");
        }
    }
}
