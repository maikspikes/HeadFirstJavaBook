package gui.test;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
//        System.out.println(g);
//        g.setColor(Color.orange);
//        g.fillRect(20, 50, 100, 100);
//    }


//    g.fillRect(0, 0, this.getWidth(), this.getHeight());
//    Random random = new Random();
//    int red = random.nextInt(256);
//    int green = random.nextInt(256);
//    int blue = random.nextInt(256);
//    Color randomColor = new Color(red, green, blue);
//    g.setColor(randomColor);
//    g.fillOval(70, 70, 100, 100);
//}

//    public void paintComponent(Graphics g) {
//        Image image = new ImageIcon("catzilla.jpg").getImage();
//        g.drawImage(image, 3, 4, this);
//    }





        Random random = new Random();

        Color startColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        Color endColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

        //why am I using super.?
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
            g2d.setPaint(gradient);
            g2d.fillOval(70, 70, 100, 100);
        }
}
