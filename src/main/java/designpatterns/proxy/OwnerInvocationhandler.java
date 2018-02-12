package designpatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by zhangyue-k on 2018/2/12.
 * 拥有者可以调用get，set方法，但是不允许调用setHotOrNotRating方法
 */
public class OwnerInvocationhandler implements InvocationHandler{

    PersonBean person;

    public OwnerInvocationhandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try{
            if(method.getName().startsWith("get")) {
                return method.invoke(person, args);
            }else if(method.getName().equals("setHotOrNotRating")) {
                throw new IllegalAccessException();
            }else if(method.getName().startsWith("set")) {
                return method.invoke(person, args);
            }

        }catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
