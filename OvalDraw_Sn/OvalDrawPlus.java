// Author: Simeon Ngalamou
// Assignment: Programming Assignment 2, OvalDrawPlus 
// Note:   Drawing an oval in Maroon.

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Container; 
import java.awt.Color;

class Oval extends JPanel {
    private Color myColor;
    public void setColor(int red, int green, int blue) {
        myColor = new Color(red,green,blue);
    }
    public Color getColor() {
        return myColor;
    }

    Oval() {
        setColor(255,0,0);
    }

    Oval(int red, int green, int blue) {
        setColor(red,green,blue);       
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        g.setColor(myColor);
        g.fillOval(0,0,panelWidth,panelHeight);
    }
}

class Rectangle extends JPanel {
    private Color myColor;
    public void setColor(int red, int green, int blue) {
        myColor = new Color(red,green,blue);
    }
    public Color getColor() {
        return myColor;
    }

    Rectangle() {
        setColor(255,0,0);
    }

    Rectangle(int red, int green, int blue) {
        setColor(red,green,blue);       
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        g.setColor(myColor);
        g.fillRect(0,0,panelWidth,panelHeight);
    }
}

class OvalFrame extends JFrame {
    OvalFrame() {
        setTitle("OvalDraw");
        setBounds(200,200,300,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Oval myOval = new Oval(128,0,0);
        Container contentPane = getContentPane();
        contentPane.add(myOval);      
    }
}
class RectFrame extends JFrame {
    RectFrame() {
        setTitle("OvalDraw");
        setBounds(200,200,400,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Rectangle myRectangle = new Rectangle(1,36,86);
        Container contentPaneR = getContentPane();
        contentPaneR.add(myRectangle);       
    }
}

public class OvalDrawPlus {
    public static void main(String[] args) {
        System.out.println("OvalDraw Starting...");
        RectFrame myFrameR = new RectFrame();
        OvalFrame myFrame = new OvalFrame();
        

    }
}