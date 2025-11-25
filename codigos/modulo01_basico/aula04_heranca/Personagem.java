
public class Personagem {
    // protectd, pois essa é a nossa superclasse, e as subclasses iram herdar atributos dela
    protected String nome;
    protected int nivel;
    protected int forca;

    public Personagem(String nome, int nivel, int forca){
        this.nome = nome;
        this.nivel = nivel;
        this.forca = forca;
    }

    public int getForca() {
        return forca;
    }
    
    public int getNivel() {
        return this.nivel;
    }

    public String getNome(){
        return this.nome;
    }

    public void exibirCaracteristicas(){
        System.out.println("Nome -> " + getNome());
        System.out.println("Nivel -> " + getNivel());
        System.out.println("Força -> " + getForca());
    }
    
    public void atacar(){
        System.out.println(this.nome + " Lançou um ataque");
    }
}
