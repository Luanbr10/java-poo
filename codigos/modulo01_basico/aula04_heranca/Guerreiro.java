public class Guerreiro extends Personagem{
    private int resistenciaEscudo;

    public Guerreiro(String nome, int nivel, int forca, int resistenciaEscudo){

        // super, chama o construtor da SUPERCLASSE (Personagem)
        super(nome, nivel, forca);
        this.resistenciaEscudo = resistenciaEscudo;
    }

    public void usarEscudo(){
        System.out.println(this.nome + " Usou o escuto com resistência de -> " + this.resistenciaEscudo);
    }
}
