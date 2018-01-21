package designpatterns.iterator;

import java.util.ArrayList;

/**
 * Created by zhangyue-k on 2018/1/16.
 */
public class PancakeHouseMenuIterator implements Iterator {

    ArrayList menuItems;
    int position;

    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(menuItems.size() > position && menuItems.get(position) != null) {
            return true;
        }else {
            return false;
        }

    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem)menuItems.get(position);
        position = position + 1;
        return menuItem;
    }
}
