package gun0912.databinding.sns;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import gun0912.databinding.BR;



/**
 * Created by TedPark on 2017. 2. 16..
 */

public class User extends BaseObservable {

    String name;
    String imgProfile;
    String introduce;
    int postCount;
    int followerCount;
    int followingCount;
    boolean follow;
    boolean loaded;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getImgProfile() {
        return imgProfile;
    }

    public void setImgProfile(String imgProfile) {
        this.imgProfile = imgProfile;
        notifyPropertyChanged(BR.imgProfile);
    }

    @Bindable
    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
        notifyPropertyChanged(BR.introduce);
    }

    @Bindable
    public int getPostCount() {
        return postCount;
    }

    public void setPostCount(int postCount) {
        this.postCount = postCount;
        notifyPropertyChanged(BR.postCount);
    }

    @Bindable
    public int getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(int followerCount) {
        this.followerCount = followerCount;
        notifyPropertyChanged(BR.followerCount);
    }

    @Bindable
    public int getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(int followingCount) {
        this.followingCount = followingCount;
        notifyPropertyChanged(BR.followingCount);
    }

    @Bindable
    public boolean isFollow() {
        return follow;
    }

    public void setFollow(boolean follow) {
        this.follow = follow;
        notifyPropertyChanged(BR.follow);
    }


    @Bindable
    public boolean isLoaded() {
        return loaded;
    }

    public void setLoaded(boolean loaded) {
        this.loaded = loaded;
        notifyPropertyChanged(BR.loaded);
    }
}
