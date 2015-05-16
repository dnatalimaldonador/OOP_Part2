package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        // Create your app here
        frame = new JFrame ("Title");
        frame.setPreferredSize(new Dimension(200, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponent(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }


    public JFrame getFrame() {
        return frame;
    }

    private void createComponent(Container container) {
        //tchrow new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /**/
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        container.add(new JLabel("Are you?"));
        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(yes);
        bg1.add(no);
        container.add(yes);
        container.add(no);
        
        container.add(new JLabel("Why?"));
        JRadioButton norea = new JRadioButton("No reason.");
        JRadioButton bif = new JRadioButton("Because it is fun!");
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(bif);
        bg2.add(norea);
        
       
        
        
        container.add(bif);
        container.add(norea);
        
        
         container.add(new JButton("Done!"));
    }
}
