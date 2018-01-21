package designpatterns.composite;

import java.util.Iterator;

/**
 * Created by zhangyue-k on 2018/1/21.
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
