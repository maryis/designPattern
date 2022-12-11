package structural.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * A cache for already created TreeTypes
 */
public class TreeFactory {
    static Map<String, TreeType> treeTypeMap = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherData) {
        TreeType treeType = treeTypeMap.get(name);
        if (treeType == null) {
            treeType = new TreeType(name, color, otherData);
            treeTypeMap.put(name, treeType);
        }
        return treeType;
    }
}
