package gun0912.databinding.binding;

import android.databinding.BindingConversion;
import android.view.View;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by TedPark on 2017. 2. 16..
 */

public class BindingConversions {


    @BindingConversion
    public static int convertBooleanToVisibility(boolean visible) {
        return visible ? View.VISIBLE : View.GONE;
    }



    @BindingConversion
    public static String convertDateToDisplayedText(Date date) {
        return new SimpleDateFormat("yyyy:MM:dd").format(date);
    }



}
