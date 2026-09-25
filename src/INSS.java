public class INSS extends Inimigo{
    public INSS() {
        super("INSS", 500, 200, new Escudo(10));
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("EU ROUBO DOS VELHOS");
    }

    @Override
    public void fraseMorte() {
        System.out.println("O lula me roubou...");
    }
}
