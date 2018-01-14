package designpatterns.facade;

/**
 * Created by zhangyue-k on 2018/1/14.
 */
public class Screen {

    String description;

    public Screen(String description) {
        this.description = description;
    }

    public void up() {
        System.out.println(description + " going up");
    }

    public void down() {
        System.out.println(description + " going down");
    }


    @Override
    public String toString() {
        return description;
    }
}
