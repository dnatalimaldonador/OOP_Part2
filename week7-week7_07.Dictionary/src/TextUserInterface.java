
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
public class TextUserInterface {

    private Scanner sc;
    private Dictionary dic;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.sc = reader;
        this.dic = dictionary;
    }

    public void start() {
        System.out.println("Statements:");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quit the text user interface");
        
        while (true) {
            System.out.print("Statement: ");
            String option = this.sc.nextLine();

            if (option.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } 
            else if(option.equals("add")){
                System.out.print("In Finnish: ");
                String fin = this.sc.nextLine();
                System.out.print("Translation: ");
                String trans = this.sc.nextLine();
                
                this.dic.add(fin, trans);
            }
            else if(option.equals("translate")){
                System.out.print("Give a word: ");
                String word = this.sc.nextLine();
                System.out.print("Translation: "+ this.dic.translate(word));
            }
            else {
                System.out.println("Unknown statement");
            }
            
            System.out.println("");
        }

    }
}
