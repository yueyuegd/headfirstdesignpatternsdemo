package designpatterns.iterator;

import java.util.Iterator;

/**
 * Created by zhangyue-k on 2018/1/21.
 * 统一的菜单接口
 */
public interface Menu {

    public Iterator createIterator();
}
