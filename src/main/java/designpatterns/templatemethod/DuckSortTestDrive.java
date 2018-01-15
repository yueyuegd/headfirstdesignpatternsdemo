package designpatterns.templatemethod;

import java.util.Arrays;

/**
 * Created by zhangyue-k on 2018/1/15.
 */
public class DuckSortTestDrive {

    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 2)
        };
        System.out.println("Before sorting:");
        display(ducks);
        Arrays.sort(ducks);
        System.out.println("After sorting:");
        display(ducks);

    }

    public static void display(Duck[] ducks) {
        for(int i = 0; i < ducks.length; i++) {
            System.out.println(ducks[i]);
        }
    }
}
