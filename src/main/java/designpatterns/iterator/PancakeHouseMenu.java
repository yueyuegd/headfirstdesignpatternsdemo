package designpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by zhangyue-k on 2018/1/15.
 */
public class PancakeHouseMenu implements Menu{

    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("K&B's Pancake Breajfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries or strawberries", true, 2.99);
        addItem("Waffles", "Waffles, with you choice of blueberries or strawberries", true, 3.59);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
