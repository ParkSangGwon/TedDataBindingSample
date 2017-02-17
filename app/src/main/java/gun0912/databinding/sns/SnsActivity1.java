package gun0912.databinding.sns;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.View;

import gun0912.databinding.BindActivity;
import gun0912.databinding.R;
import gun0912.databinding.databinding.SnsActivity1Binding;

/**
 * Created by TedPark on 2017. 2. 16..
 */

public class SnsActivity1 extends BindActivity<SnsActivity1Binding> {

    @Override
    protected int getLayoutId() {
        return R.layout.sns_activity1;
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        User user = new User();
        user.setImgProfile("http://cfile25.uf.tistory.com/image/251F6B4C558E627E26807B");
        user.setFollow(false);
        user.setPostCount(124);
        user.setFollowingCount(847);
        user.setFollowerCount(2312);
        user.setName(getString(R.string.sns_profile_name));
        user.setIntroduce(getString(R.string.sns_profile_introduce));
        user.setLoaded(true);

        binding.setUser(user);
        binding.setActivity(this);
    }

    public void onFollowToggle(View view) {
        final User user = binding.getUser();

        user.setLoaded(false);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                int currentFolowerCount = user.getFollowerCount();

                if (user.isFollow()) {
                    currentFolowerCount--;
                } else {
                    currentFolowerCount++;
                }

                user.setFollow(!user.isFollow());
                user.setFollowerCount(currentFolowerCount);

                user.setLoaded(true);
            }
        }, 1500);


    }
}
