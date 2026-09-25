public abstract class Inimigo extends Criatura{

    private int ataque;
    private Defesa defesa = new Esquiva(50);

    public Inimigo(String nome, int vida, int ataque) {
        super(nome, vida);
        this.ataque = ataque;
    }

    @Override
    public void fazAtaque(Criatura criatura) {
        criatura.tomaDano(this.ataque);
    }

    @Override
    public void tomaDano(int dano){
        int danoReduzido = this.defesa.danoReduzido(dano);
        super.tomaDano(danoReduzido);
    }

}
