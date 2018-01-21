package designpatterns.composite;

import java.util.Iterator;

/**
 * Created by zhangyue-k on 2018/1/21.
 * 菜单项
 */
public class MenuItem extends MenuComponent {

    String name;
    String description;

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }

    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.print("   " + getName());
        if(isVegetarian()) {
            System.out.print("{v}");
        }
        System.out.println(",   " + getPrice());
        System.out.println("   -- " + getDescription());
    }
}
