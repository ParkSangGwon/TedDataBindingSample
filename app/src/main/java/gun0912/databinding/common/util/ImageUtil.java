package gun0912.databinding.common.util;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by TedPark on 2017. 2. 16..
 */

public class ImageUtil {

    public static void loadImage(ImageView imageView, String url, Drawable errorDrawable) {
        Glide.with(imageView.getContext()).load(url).error(errorDrawable).into(imageView);
    }

}
