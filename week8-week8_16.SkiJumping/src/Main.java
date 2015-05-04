
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.
        String input = "Arto\n"
            + "\n"
            + "jump\n"
            + "quit";
        Scanner reader = new Scanner(System.in);
        Participants ppl = new Participants();
        int roundCount = 1;

        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        while (true) {
            System.out.print("  Participant name: ");
            String temp = reader.nextLine();
            if (temp.equals("")) {
                break;
            } else {
                Athlete Atemp = new Athlete(temp);
                ppl.add(Atemp);
            }
        }

        System.out.println("");
        System.out.println("");
        System.out.println("The tournament begins!");
        System.out.println("");

        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String option = reader.nextLine();

            if (option.equals("jump")) {
                System.out.println("");
                System.out.println("");
                System.out.println("Round" + roundCount);
                System.out.println("");

                ppl.sort();
                System.out.println("Jumping order:");
                int j = 1;
                for (Athlete Atemp : ppl.getPlist()) {
                    System.out.println("  "+j + ". " + Atemp);
                    j++;

                }
                System.out.println("");

                System.out.println("Results of round " + roundCount);
                for (Athlete Atemp : ppl.getPlist()) {
                    Random rd = new Random();

                    int rLength = rd.nextInt((120 - 60) + 1) + 60;
                    int[] rVote = new int[5];

                    for (int i = 0; i < 5; i++) {
                        rVote[i] = rd.nextInt((20 - 10) + 1) + 10;
                    }

                    Arrays.sort(rVote);
                    int pointTemp = rLength + rVote[1] + rVote[2] + rVote[3];

                    ppl.setPoint(Atemp, pointTemp);
                    ppl.setLegnthArray(Atemp, rLength);

                    System.out.println("  " + Atemp.getName());
                    System.out.println("     length: " + rLength);
                    System.out.println("     judge votes: [" + rVote[0] + ", " + rVote[1] + ", " + rVote[2] + ", " + rVote[3] + ", " + rVote[4] + "]");

                }
                System.out.println("");
                roundCount++;

            } else {
                break;
            }
        }

        System.out.println("");
        System.out.println("");
        System.out.println("Thanks!");
        System.out.println("");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        ppl.sort();
        ppl.reverse();
        int j = 1;
        for (Athlete Atemp : ppl.getPlist()) {
            System.out.println(j + "           " + Atemp);
            System.out.print("             " + "jump lengths: ");
            ppl.getLengthArray(Atemp);
            System.out.println("");
            j++;
        }

    }
}
