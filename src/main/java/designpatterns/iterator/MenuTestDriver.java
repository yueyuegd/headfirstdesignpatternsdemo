package designpatterns.iterator;

/**
 * Created by zhangyue-k on 2018/1/21.
 */
public class MenuTestDriver {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        //Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        //waitress.printMenu();
    }
}
