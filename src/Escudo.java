public class Escudo extends Defesa{

    private int reducao;

    Escudo(int reducao){
        this.reducao = reducao;
    }

    @Override
    public int danoReduzido(int dano){
        return dano - this.reducao;
    }

}
