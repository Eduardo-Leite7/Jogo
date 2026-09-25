public class IMPOSTO extends Inimigo{
    public IMPOSTO() {
        super("IMPOSTO", 1000, 100);
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("Eu vou te roubar!!!!!!!!!!!! 13");
    }

    @Override
    public void fraseMorte() {
        System.out.println("Sonegaçãooooo nãoooooooooo!");
    }
}
