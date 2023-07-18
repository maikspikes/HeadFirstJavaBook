package gui.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SimpleGui3 {
    private JFrame frame;

    public static void main(String[] args) {
        SimpleGui3 gui = new SimpleGui3();
        gui.go();
    }
    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Change colors");
        button.addActionListener((ActionEvent event) -> {
            button.setText("I have been clicked");
            frame.repaint();
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(BorderLayout.SOUTH, button);

        //implement the MyDrawPanel from the other class
        MyDrawPanel drawPanel = new MyDrawPanel();
        panel.add(BorderLayout.CENTER, drawPanel);
        frame.setContentPane(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }


    //If you were to not use lambdas, you would use this method
//    public void actionPerformed(ActionEvent event) {
//        button.setText("I've been clicked!");
//    }
}

