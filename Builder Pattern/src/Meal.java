import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("Item: " + item.name());
            System.out.println("Size: " + item.size());
            System.out.println("Price: " + item.price() + "\n");
        }
    }

    public int getCost() {
        int total = 0;
        for (Item item : items) {
            total += item.price();
        }
        return total;
    }
}
