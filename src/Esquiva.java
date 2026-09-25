public class Esquiva extends Defesa{
    private int chance;

    Esquiva(int chance){
        this.chance = chance;
    }

    @Override
    public int danoReduzido(int dano){
        return dano;
    }
}
