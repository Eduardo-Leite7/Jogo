public abstract class Arma {

    private String nome;
    private int ataque;
    private int chance;

    public Arma(String nome, int ataque, int chance) {
        this.nome = nome;
        this.ataque = ataque;
        this.chance = chance;
    }

    public void mensagem(){
        System.out.println();
    }

    public void fazAtaque(Criatura criatura){

    }
}
