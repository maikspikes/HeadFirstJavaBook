package gui.test.LayoutManager.button;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("My Frame");
        JPanel myPanel = new JPanel();

        // Add components to myPanel
        JLabel label = new JLabel("Hello, World!");
        myPanel.add(label);

        // Set myPanel as the content pane of myFrame
        myFrame.setContentPane(myPanel);

        // Set frame properties
        myFrame.setSize(300, 200);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}

