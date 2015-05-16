

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        
       // CalculatorLogic cal = new CalculatorLogic();
        SwingUtilities.invokeLater(new GraphicCalculator(new CalculatorLogic()));
        
    }
}
