
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wenhaowu
 */
public class ClickListener implements ActionListener {

    private CalculatorLogic cal;
    private JTextField output;
    private JTextField input;
    private int flag;
    private JButton b3;

    public ClickListener(CalculatorLogic cal, JTextField output, JTextField input, int flag, JButton b3) {
        this.cal = cal;
        this.output = output;
        this.input = input;
        this.flag = flag;
        this.b3 = b3;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //hrow new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        switch (flag) {
            case 1:
                String temp = this.input.getText().toString();
                if (isParsable(temp)) {
                    this.cal.add(Integer.parseInt(temp));
                    System.out.println(this.cal.toString());
                    this.output.setText(this.cal.toString());
                }
                this.input.setText("");
                setB3();
                break;
            case 2:
                temp = this.input.getText().toString();
                if (isParsable(temp)) {
                    this.cal.remove(Integer.parseInt(temp));
                    System.out.println(this.cal.toString());
                    this.output.setText(this.cal.toString());
                }
                this.input.setText("");
                setB3();
                break;
            case 3:
                this.cal.removeAll();
                System.out.println(this.cal.toString());
                this.output.setText(this.cal.toString());
                this.input.setText("");
                setB3();
                break;
        }
    }

    public static boolean isParsable(String input) {
        boolean parsable = true;
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            parsable = false;
        }
        return parsable;
    }
    
    public void setB3(){
        System.out.println("Output is "+output.getText().toString());
        if(output.getText().toString().equals("0")){
            System.out.println("here");
            b3.setEnabled(false);
        }
        else{
            b3.setEnabled(true);
        }
    }
    
}
