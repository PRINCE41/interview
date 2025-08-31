package peight;

import java.util.ArrayList;
import java.util.List;

class FinalReferenceExample {
    final List<String> items = new ArrayList<>(); // Final reference

    void modifyList() {
        items.add("Item 1"); // Modifying the contents
        items.add("Item 2");

        // Uncommenting below line will cause a compilation error
        // items = new ArrayList<>(); // Cannot reassign a final reference
    }

    public static void main(String[] args) {
        FinalReferenceExample obj = new FinalReferenceExample();
        obj.modifyList();
        System.out.println(obj.items); // Output: [Item 1, Item 2]
        obj.items.add("XYZ");
        System.out.println(obj.items);
    }
}
