package flyweight.trees;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>();

    // TODO: implement TreeFactory
    public static TreeType getTreeType() { // TODO: add intrinsic (shared) attribute
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(...); // TODO: invoke with all intrinsic attribute
            treeTypes.put(name, result);
        }
        return result;
    }
}
