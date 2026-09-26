import java.util.Random;
import java.util.Scanner;

public class Jogador extends Criatura {

    private Scanner sc = new Scanner(System.in);

    private Arma[] armas;

    public Jogador(String nome) {
        super(nome, 1000);
        this.armas = armas;
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
        System.out.println("Escolha sua arma");
        int n = 1;
        for(Arma arma : armas) {
            System.out.println(n + ") ");
            arma.mensagem();
            n++;
        }
        int escolha = sc.nextInt();
        while (escolha < 1 || escolha > n - 1) {
            System.out.println("Número inválido. Digite novamente: ");
            escolha = sc.nextInt();
        }

        armas[escolha-1].fazAtaque(criatura);
    }
}
