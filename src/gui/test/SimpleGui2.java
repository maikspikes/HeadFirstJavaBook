package gui.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SimpleGui2 {
    private JButton button;
    private JPanel panel;

    public static void main(String[] args) {
        SimpleGui2 gui = new SimpleGui2();
        gui.go();
    }
    public void go() {
        JFrame frame = new JFrame();

        button = new JButton("click me");
        button.addActionListener((ActionEvent event) -> button.setText("I have been clicked"));
        frame.getContentPane().add(BorderLayout.CENTER, button);

        //implement the MyDrawPanel from the other class
        panel = new MyDrawPanel();
        frame.getContentPane().add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }


    //If you were to not use lambdas, you would use this method
//    public void actionPerformed(ActionEvent event) {
//        button.setText("I've been clicked!");
//    }
}

