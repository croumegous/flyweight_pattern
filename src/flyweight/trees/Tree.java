package flyweight.trees;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public class Tree {
    private int x;
    private int y;
    private String name;
    private Color color;
    private long otherTreeData;

    public Tree(int x, int y, String name, Color color, long otherTreeData) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}