package designpatterns.templatemethod;

/**
 * Created by zhangyue-k on 2018/1/15.
 * 比较鸭子：实现接口
 */
public class Duck implements Comparable {

    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " weights " + weight;
    }

    @Override
    public int compareTo(Object o) {
        Duck otherDuck = (Duck) o;
        if(this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else {
            return 1;
        }
    }
}
