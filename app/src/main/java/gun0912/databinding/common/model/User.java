package gun0912.databinding.common.model;

/**
 * Created by TedPark on 2017. 2. 15..
 */

public class User {

    String name;
    int age;

    String imgUrl;

    public User(String name,int age,String imgUrl){
        this.name=name;
        this.age=age;
        this.imgUrl=imgUrl;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

}



