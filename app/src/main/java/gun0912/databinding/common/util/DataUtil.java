package gun0912.databinding.common.util;

import java.util.ArrayList;
import java.util.List;

import gun0912.databinding.common.model.User;

/**
 * Created by TedPark on 2017. 2. 15..
 */

public class DataUtil {


    public static List<User> getUsers(){


        List<User> users = new ArrayList();

        users.add(new User("Ted",32,"http://cfile25.uf.tistory.com/image/251F6B4C558E627E26807B"));
        users.add(new User("Jane",20,"http://image.celebtide.com/celeb/new/ve/279_ve_1452259300.jpg"));
        users.add(new User("Paul",40,"http://res.heraldm.com/content/image/2013/12/01/20131201000224_0.jpg"));
        users.add(new User("Ailee",25,"http://cfile8.uf.tistory.com/image/194599374F7049A9010251"));



        return users;
    }



}
