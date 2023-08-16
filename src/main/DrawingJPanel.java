package main;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingJPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        this.setBackground(Color.WHITE);

        // sky
        g.setColor(new Color(135, 206, 235)); // light blue 
        g.fillRect(0, 0, getWidth(), getHeight());

        // sun
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 100, 100);

        // mountains
        g.setColor(new Color(139, 69, 19)); // brown
        g.fillPolygon(new int[] { 100, 400, 250 }, new int[] { 400, 400, 100 }, 3);
        g.fillPolygon(new int[] { 250, 600, 400 }, new int[] { 400, 400, 150 }, 3);
        g.fillPolygon(new int[] { 400, 750, 575 }, new int[] { 400, 400, 50 }, 3);

        // road
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 400, getWidth(), 200);

        // dashed line on road
        g.setColor(Color.WHITE);
        int dashWidth = 20;
        for (int x = 0; x < getWidth(); x += dashWidth * 2) {
            g.fillRect(x, 500, dashWidth, 10);
        }

        // house
        g.setColor(Color.RED);
        g.fillRect(300, 300, 150, 100);
        g.setColor(Color.ORANGE);
        g.fillPolygon(new int[] { 300, 375, 450 }, new int[] { 300, 250, 300 }, 3);
        g.setColor(Color.YELLOW);
        g.fillRect(340, 330, 30, 30);

        // trees
        tree(g, 150, 300);
        tree(g, 650, 300);
        tree(g, 800, 300);
        tree(g, 900, 300);

        // flowers
        flower(g, 100, 550);
        flower(g, 300, 550);
        flower(g, 500, 550);
        flower(g, 700, 550);
        flower(g, 900, 550);
    }

    private void tree(Graphics g, int x, int y) {
        g.setColor(new Color(0, 128, 0));
        g.fillRect(x, y, 30, 100);
        g.setColor(Color.GREEN);
        g.fillOval(x - 30, y - 50, 90, 90);
    }

    private void flower(Graphics g, int x, int y) {
        g.setColor(Color.GREEN);
        g.fillRect(x + 10, y + 30, 10, 50); // stem
        g.setColor(Color.RED);
        g.fillOval(x, y, 30, 30); // head
        g.setColor(Color.YELLOW);
        g.fillOval(x + 5, y - 10, 20, 20); // flower center
    }
}
