
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wenhaowu
 */
public class AirTextUI {

    private Scanner sc;
    private Flights flg;
    private Planes pln;

    public AirTextUI(Scanner reader, Flights flg, Planes pln) {
        this.sc = reader;
        this.flg = flg;
        this.pln = pln;
    }

    public void start() {
        //String ID;// option;

        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");

        do {

            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            String option = this.sc.nextLine();

            if (option.equals("1")) {

                /**/
                System.out.print("Give plane ID: ");
                String ID = this.sc.nextLine();
                System.out.print("Give plane capacity: ");
                String cap = this.sc.nextLine();

                this.pln.add(new Plane(ID, Integer.parseInt(cap)));

            } else if (option.equals("2")) {
                System.out.print("Give plane ID: ");
                String ID1 = this.sc.nextLine();
                System.out.print("Give departure airport code: ");
                String dep = this.sc.nextLine();
                System.out.print("Give destination airport code: ");
                String des = this.sc.nextLine();

                this.flg.add(new Flight(ID1, dep, des));

            } else if (option.equals("x")) {
                break;
            }

            System.out.println("");
        } while (true);
    }
}
