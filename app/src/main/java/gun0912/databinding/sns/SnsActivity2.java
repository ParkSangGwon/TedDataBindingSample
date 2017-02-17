package gun0912.databinding.sns;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.View;

import gun0912.databinding.BindActivity;
import gun0912.databinding.R;
import gun0912.databinding.databinding.SnsActivity2Binding;

/**
 * Created by TedPark on 2017. 2. 16..
 */

public class SnsActivity2 extends BindActivity<SnsActivity2Binding> {

    @Override
    protected int getLayoutId() {
        return R.layout.sns_activity2;
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        User2 user = new User2();

        user.imgProfile.set("http://cfile25.uf.tistory.com/image/251F6B4C558E627E26807B");
        user.follow.set(false);
        user.postCount.set(124);
        user.followingCount.set(847);
        user.followerCount.set(2312);
        user.name.set(getString(R.string.sns_profile_name));
        user.introduce.set(getString(R.string.sns_profile_introduce));
        user.loaded.set(true);


        binding.setUser(user);
        binding.setActivity(this);
    }

    public void onFollowToggle(View view) {
        final User2 user = binding.getUser();

        user.loaded.set(false);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                int currentFolowerCount = user.followerCount.get();

                if (user.follow.get()) {
                    currentFolowerCount--;
                } else {
                    currentFolowerCount++;
                }

                user.follow.set(!user.follow.get());
                user.followerCount.set(currentFolowerCount);

                user.loaded.set(true);
            }
        }, 1500);


    }
}
