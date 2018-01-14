package designpatterns.singleton;

/**
 * Created by zhangyue-k on 2018/1/12.
 */
public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;

    public static ChocolateBoiler instance;



    public static ChocolateBoiler getInstance() {
        if(instance == null) {
            instance =  new ChocolateBoiler();
        }
        return instance;
    }


    private ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
