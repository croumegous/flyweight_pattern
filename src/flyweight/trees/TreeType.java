package flyweight.trees;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public class TreeType {
    //TODO: add the other intrinsic (shared) attribute
    private String ...;
    private Color color;
    private long otherTreeData;

    public TreeType(String ..., Color color, long otherTreeData) {
        // this... = ...; // TODO
        this.color = color;
        this.otherTreeData = otherTreeData;        
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);

    }
}