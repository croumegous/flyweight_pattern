package flyweight;

import flyweight.forest.Forest;

import java.awt.*;

public class Demo {
    static int CANVAS_SIZE = 500;
    static double TREES_TO_DRAW = 100000000;
    static double TREE_TYPES = 2;

    public static void main(String[] args) {
        Long startTime = System.currentTimeMillis();
        Forest forest = new Forest();
        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Summer Oak", Color.GREEN,
                    4522219986995656551L);
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Autumn Oak", Color.ORANGE,
                    4556299999999687L);
        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        Long totalTime = System.currentTimeMillis() - startTime;
        System.out.println(TREES_TO_DRAW + " trees created, in " + totalTime.toString() + " ms");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}