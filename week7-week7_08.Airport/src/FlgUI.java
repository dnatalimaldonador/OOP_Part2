
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
public class FlgUI {
    private Scanner sc;
    private Flights flg;
    private Planes pln;

    public FlgUI(Scanner reader, Flights flg, Planes pln) {
        this.sc = reader;
        this.flg = flg;
        this.pln = pln;
    }
    
    public void start(){
        System.out.println("Flight service");
        System.out.println("--------------------");
        System.out.println("");
        
        
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String option = this.sc.nextLine();
            if (option.equals("1")) {
                this.pln.printPlns();
            } else if (option.equals("2")) {
                this.flg.printFlgs(this.pln);
                System.out.println("");
            } else if (option.equals("x")) {
                break;
            }
            else if(option.equals("3")){
                System.out.println("Give plane ID: ");
                String ID = this.sc.nextLine();
                System.out.println(this.pln.printSinglePln(ID));
                System.out.println("");
            }
        }
    }
}
