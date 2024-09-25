import java.util.Random;

public class Player {
    enum VARIANTS {
        ROCK, PAPER, SCISSORS
    }

    private String name;
    private VARIANTS choice;

    public Player() {
        this.name = "Bot";
        this.choice = getRandomVariant();
    }

    public Player(VARIANTS choice, String name) {
        this.name = name;
        this.choice = choice;
    }

    private VARIANTS getRandomVariant() {
        VARIANTS[] values = VARIANTS.values();
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex];
    }

    public String getName() {
        return name;
    }

    public VARIANTS getChoice() {
        return choice;
    }

    public String whoWins(Player player1, Player player2) {
        if (player1.choice == player2.choice) {
            return "Ничья";
        }

        if ((player1.choice == VARIANTS.ROCK && player2.choice == VARIANTS.SCISSORS) ||
                (player1.choice == VARIANTS.SCISSORS && player2.choice == VARIANTS.PAPER) ||
                (player1.choice == VARIANTS.PAPER && player2.choice == VARIANTS.ROCK)) {
            return "Побдели игрок с именем: " + player1.name + " ему выпало " + player1.choice;
        } else {
            return "Побдели игрок с именем: " + player2.name + " ему выпало " + player2.choice;
        }
    }
}
