package designpatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by zhangyue-k on 2018/2/12.
 * 非拥有者可以调用get方法，和setHotOrNotRating，但是不能调用set方法
 */
public class NonOwnerInvocationHandler implements InvocationHandler {

    PersonBean person;

    public NonOwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if(method.getName().startsWith("get")) {
                return method.invoke(person, args);
            }else if(method.getName().equals("setHotOrNotRating")) {
                return method.invoke(person, args);
            }else if(method.getName().startsWith("set")) {
               throw new IllegalAccessException();
            }

        }catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;

    }
}
