package designpatterns.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by zhangyue-k on 2018/1/9.
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream inputStream = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("D:\\project-git\\headfirstdesignpatternsdemo\\src\\main\\java\\designpatterns\\decorator\\test.txt")
                    )
            );
            while((c = inputStream.read()) >= 0){
                System.out.print((char)c);
            }
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
