package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator cal;

    public UserInterface(Calculator cal) {
        this.cal = cal;
    }
    

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        BorderLayout layout = new BorderLayout();
        JLabel JL = new JLabel("0");
        JButton JB = new JButton("Click!");
        JB.addActionListener(new ClickListener(this.cal, JL));
        
        container.add(JL);
        container.add(JB, BorderLayout.SOUTH);
    }
    

    public JFrame getFrame() {
        return frame;
    }
}
