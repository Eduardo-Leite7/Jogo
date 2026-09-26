public class Jogo {

    public static void main(String[] args) {

        Arma[] armas = {new Faca(), new ArcoFlecha(), new Porrete(), new Pistola()};

        Jogador jogador = new Jogador("Leitado jogos");
        Inimigo inimigo = new INSS();

        System.out.println("----- COMEÇA A BATALHA!!! -----");
        System.out.println("###############################");

        jogador.fraseApresentacao();
        inimigo.fraseApresentacao();

        while (true) {
            jogador.mostraVida();
            inimigo.mostraVida();

            jogador.fazAtaque(inimigo);
            if (inimigo.estaVivo()) {
                inimigo.fazAtaque(jogador);
            }


            if (!jogador.estaVivo()) {
                jogador.fraseMorte();
                System.out.println(inimigo.getNome() + " venceu");
                break;
            }

            if (!inimigo.estaVivo()) {
                inimigo.fraseMorte();
                System.out.println(jogador.getNome() + " venceu");
                break;
            }

        }
    }
}
