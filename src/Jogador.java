import java.util.Random;
import java.util.Scanner;

public class Jogador extends Criatura {

    private int ataquePerto = 50;
    private int ataqueLonge = 200;
    private Scanner sc = new Scanner(System.in);

    public Jogador(String nome) {
        super(nome, 1000);
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("TOME MEU LEITE LEITOSO!");
    }

    @Override
    public void fraseMorte() {
        System.out.println("Me leitaram... isso foi hype...");
    }

    @Override
    public void fazAtaque(Criatura criatura) {
        System.out.println("Escolha sua arma: ");
        System.out.println("1) Faca - dano: " + this.ataquePerto);
        System.out.println(
                "2) Arco e Flecha  - dano: " + this.ataqueLonge + " - chance 50%");
        System.out.print("Sua escolha: ");

        int escolha = sc.nextInt();

        while (escolha < 1 || escolha > 2) {
            System.out.println("Número inválido. Digite novamente: ");
            escolha = sc.nextInt();
        }

        if (escolha == 1) {
            criatura.tomaDano(this.ataquePerto);
        } else {
            Random rd = new Random();
            int sorteio = rd.nextInt(100); // 0 a 99
            if (sorteio < 50) {
                criatura.tomaDano(this.ataqueLonge);
                System.out.println("Acertou o tiro de longe!");
            } else {
                System.out.println("Errou!!!!");
            }
        }
    }
}
