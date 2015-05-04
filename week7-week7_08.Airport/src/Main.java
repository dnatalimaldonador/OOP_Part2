
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        /**/
        String input = "1\n"
                + "AY-123\n"
                + "108\n"
                + "1\n"
                + "DE-213\n"
                + "75\n"
                + "x\n"
                + "1\n"
                + "x";
        
        
        Scanner reader = new Scanner(System.in);
        Flights flg = new Flights();
        Planes pln = new Planes();

        AirTextUI aUI = new AirTextUI(reader, flg, pln);

        aUI.start();

        FlgUI fUI = new FlgUI(reader, flg, pln);

        fUI.start();
        

        /*
         Scanner sc = new Scanner(System.in);
        
         while (true) {

         System.out.println("Choose operation:");
         System.out.println("[1] Add airplane");
         System.out.println("[2] Add flight");
         System.out.println("[x] Exit");
         System.out.print("> ");
         String option = sc.nextLine();

         if (option.equals("1")) {
         System.out.println("1");

         } else if (option.equals("2")) {
         System.out.println("2");

         } else if (option.equals("x")) {
         break;
         }

         System.out.println("");
                
         }
         */
    }
}
