package exercicios;

public class ArCondicionado {
    private String modelo;
    private int temperatura;

    public ArCondicionado(String modelo, int novaTemperatura){
        this.modelo = modelo;

        // Aparentemente, a ordem da criação de métodos não influencia na leitura, ele consegue ler todo o arquivo antes da execução. Interessante
        this.setTemperatura(novaTemperatura);
    }

    
    public String getModelo(){
        return this.modelo;
    }
    
    public int getTemperatura(){
        return this.temperatura;
    }
    
    public void setModelo(String novoModelo){
        this.modelo = novoModelo;
    }

    public void setTemperatura(int novaTemperatura){
        if (novaTemperatura <= 30 && novaTemperatura >= 15){
            System.out.println("Atualiza temperatura, está entre 15 a 30graus");
            this.temperatura = novaTemperatura;
        }
        else{
            System.out.println("Não atualiza temperatura, está fora do permitido (15 a 30graus)");
        }
    }

    public void exibirDetalhes(){
        System.out.println("Modelo -> "+getModelo());
        System.out.println("Temperatura -> "+getTemperatura());

    }
}
