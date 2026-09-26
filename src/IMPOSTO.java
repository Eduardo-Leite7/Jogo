public class IMPOSTO extends Inimigo{
    public IMPOSTO() {
        super("IMPOSTO", 800, 60);
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("Eu vou te roubar!!!!!!!!!!!! 13");
    }

    @Override
    public void fraseMorte() {
        System.out.println("Sonegaçãooooo nãoooooooooo!");
    }

    //---> SISTEMA UPGRADE
    private boolean upgraded = false;
    private int vidaCritica = 200;

    @Override
    public void upgrade(){
        if(!upgraded){
            if(vidaCritica(vidaCritica)){
                System.out.println(getNome() + " está tunado!");
                upgraded = true;
                setDefesa(new Escudo(40));
                setAtaque(200);
            }
        }

    }
}
