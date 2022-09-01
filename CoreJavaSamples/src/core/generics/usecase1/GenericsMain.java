package core.generics.usecase1;

import java.util.ArrayList;
import java.util.List;

public class GenericsMain {
    public static void main(String[] args) {

        final SpecializedStringFlowerBox stringFlowerBox = new SpecializedStringFlowerBox();
        stringFlowerBox.setItemType("Daisy");

        final GenericFlowerBox<Integer> genericFlowerBox = new GenericFlowerBox<Integer>();
        // Json Parser
        genericFlowerBox.setItemType(1);

        final GenericFlowerBox<String> genericFlowerBoxStr = new GenericFlowerBox<>();
        genericFlowerBoxStr.setItemType("AShushjahsj");

        final GenericFlowerBox<Object> genericFlowerBoxObj = new GenericFlowerBox<>();
        genericFlowerBoxObj.setItemType("AShushjahsj");
        genericFlowerBoxObj.setItemType(1);

        // Data structure
    }
}
