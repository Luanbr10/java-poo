package exercicios;

public class Main {
    public static void main(String args[]){
        ArCondicionado novoArCondicionado = new ArCondicionado("LG Dual Inverter", 20);
        novoArCondicionado.setTemperatura(10);
        novoArCondicionado.setTemperatura(22);
        novoArCondicionado.setTemperatura(35);

        novoArCondicionado.exibirDetalhes();
    }
}
