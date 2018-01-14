package designpatterns.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by zhangyue-k on 2018/1/14.
 */
public class TeaWithHook extends CoffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")) {
            return true;
        }else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like lemon with your tea(y/n)?");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = bufferedReader.readLine();
        }catch (IOException e) {
            System.out.println("IO error trying to read your answer");
        }
        if(answer == null) {
            return "no";
        }
        return answer;
    }
}
