
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Matti");
         //printWithSmileys("Beerbottle");
        //printWithSmileys("Interface");
    }

    private static void printWithSmileys(String parm) {
        int i;
        //System.out.println("length is "+parm.length());
        int length = parm.length();
        
        int count ;
        
        if(parm.length()+4>=9){
            count = 6;
        }
        else{
            count = 5;
        }
        for (i = 0; i < count; i++) {
            printSmileys();
        }
        System.out.println("");
        
        int temp = 10 - parm.length();
        for (i = 0; i < temp / (int) 2/2; i++) {
            printSmileys();
        }
        System.out.print(" "+parm+" ");
        
        if (parm.length() % 2 != 0) {
            System.out.print(" ");
        }
        for (i = 0; i < temp / (int) 2/2; i++) {
            printSmileys();
        }
        System.out.println("");
        
        for (i = 0; i < count; i++) {
            printSmileys();
        }
        System.out.println("");
    }

    private static void printSmileys() {
        System.out.print(":)");
    }

}
