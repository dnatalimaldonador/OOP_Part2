
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    
    private JFrame frame;
    private CalculatorLogic cal;
    
    public GraphicCalculator(CalculatorLogic cal) {
        this.cal = cal;
    }
    
    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 200));
        
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }
    
    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        JTextField up = new JTextField("0");
        //up.setText(this.cal.toString());
        up.setEnabled(false);
        JTextField mid = new JTextField("");
        JPanel down = this.createPanel(mid, up);
        
        container.add(up);
        container.add(mid);
        container.add(down);
    }
    
    public JFrame getFrame() {
        return frame;
    }
    
    private JPanel createPanel(JTextField input, JTextField output) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        GridLayout layout = new GridLayout(1, 3);
        JPanel JP = new JPanel(layout);
        JButton b1 = new JButton("+");
        JButton b2 = new JButton("-");
        JButton b3 = new JButton("Z");
        
        System.out.println("Output is "+output.getText().toString());
        if(output.getText().toString().equals("0")){
            System.out.println("here");
            b3.setEnabled(false);
        }
        
        
        b1.addActionListener(new ClickListener(this.cal, output, input, 1, b3));
        b2.addActionListener(new ClickListener(this.cal, output, input, 2, b3));
        b3.addActionListener(new ClickListener(this.cal, output, input, 3, b3));
        
        JP.add(b1);
        JP.add(b2);
        JP.add(b3);
        return JP;
    }
}
