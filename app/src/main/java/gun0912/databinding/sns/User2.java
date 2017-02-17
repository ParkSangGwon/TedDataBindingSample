package gun0912.databinding.sns;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;


/**
 * Created by TedPark on 2017. 2. 16..
 */

public class User2  {

    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableField<String> imgProfile = new ObservableField<>();
    public final ObservableField<String> introduce = new ObservableField<>();


    public final ObservableInt postCount = new ObservableInt();
    public final ObservableInt followerCount = new ObservableInt();
    public final ObservableInt followingCount = new ObservableInt();

    public final ObservableBoolean follow = new ObservableBoolean();
    public final ObservableBoolean loaded = new ObservableBoolean();
    

}


