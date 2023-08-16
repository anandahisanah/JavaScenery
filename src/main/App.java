package main;

import java.awt.Color;

import javax.swing.JFrame;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("UAS Scenery");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawingJPanel drawingJPanel = new DrawingJPanel();
        drawingJPanel.setBackground(Color.WHITE);
        frame.add(drawingJPanel);
        frame.setSize(1000, 700);
        frame.setVisible(true);
    }
}
