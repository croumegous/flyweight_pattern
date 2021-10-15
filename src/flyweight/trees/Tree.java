package flyweight.trees;

import java.awt.*;

public class Tree {
    //TODO: add all extrinsic (unique) attributes
    private TreeType type;

    public Tree() { //TODO: initialize all extrinsic attribute and treeType      
    }

    public void draw(Graphics g) {
        type.draw(g); // TODO: add the two extrinsic variables
    }
}