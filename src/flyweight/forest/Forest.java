package flyweight.forest;

import flyweight.trees.Tree;
import flyweight.trees.TreeFactory;
import flyweight.trees.TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, long otherTreeData) {
        TreeType type = TreeFactory.getTreeType(); // TODO: add intrinsic (shared) attributes in parameters
        Tree tree = new Tree(); // TODO: create a new Tree with extrinsic (unique) attributes and the type
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}