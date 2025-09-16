import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner hw = new Scanner(System.in);
        String[] cpuHand = {"R", "P", "S"};
        int playerWins = 0;
        int cpuWins = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("\tMenu\n\nEnter your hand (Rock, Paper, Scissors): ");
            String userInput = hw.nextLine().toLowerCase();
            String playerHand = nInput(userInput);

            int index = (int) (Math.random() * 10) % 3;
            String cpuChoice = cpuHand[index];

            String result = whoTheWinnerIs(playerHand, cpuChoice);
            if (result.equals("ME")) {
                playerWins++;
            } else if (result.equals("COMPUTER")) {
                cpuWins++;
            }

            System.out.println("Round " + (i + 1) + ": You chose " + playerHand + ", The computer chose " + cpuChoice + ". \nThe winner is: " + result);
        }

        if (playerWins > cpuWins) {
            System.out.println("\t\nYou are the final winner!");
        } else if (cpuWins > playerWins) {
            System.out.println("\t\nThe computer is the final winner!");
        } else {
            System.out.println("\t\nThe game ended in a TIE!");
        }
    }

    public static String nInput(String input) {
        if (input.startsWith("r")) {
            return "R";
        } else if (input.startsWith("p")) {
            return "P";
        } else if (input.startsWith("s")) {
            return "S";
        } else {
            return "";
        }
    }

    public static String whoTheWinnerIs(String playerHand, String cpuHand) {
        if (playerHand.equals(cpuHand)) {
            return "TIE";
        } else if ((playerHand.equals("R") && cpuHand.equals("S")) ||
                   (playerHand.equals("P") && cpuHand.equals("R")) ||
                   (playerHand.equals("S") && cpuHand.equals("P"))) {
            return "ME";
        } else {
            return "COMPUTER";
        }
    }
}
