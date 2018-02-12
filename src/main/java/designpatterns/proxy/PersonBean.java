package designpatterns.proxy;

/**
 * Created by zhangyue-k on 2018/2/12.
 */
public interface PersonBean {

    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();


    void setName(String name);
    void setgender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);
}
