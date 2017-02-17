package gun0912.databinding.compare.butterknife;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import gun0912.databinding.R;
import gun0912.databinding.common.BaseRecyclerViewAdapter;
import gun0912.databinding.common.model.User;
import gun0912.databinding.common.util.ImageUtil;

/**
 * Created by TedPark on 2017. 2. 15..
 */

public class ButterKnifeAdapter extends BaseRecyclerViewAdapter<User, ButterKnifeAdapter.UserViewHolder> {


    public ButterKnifeAdapter(Context context) {
        super(context);
    }

    @Override
    public void onBindView(UserViewHolder holder, int position) {

        User user = getItem(position);

        String name = user.getName();
        holder.tvName.setText(name);

        int age = user.getAge();
        holder.tvAge.setText(Integer.toString(age));

        String imgUrl=user.getImgUrl();
        ImageUtil.loadImage(holder.ivProfile,imgUrl, ContextCompat.getDrawable(getContext(),R.drawable.no_pic));

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.butterknife_item, parent, false);
        return new UserViewHolder(view);
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tvName)
        TextView tvName;
        @BindView(R.id.tvAge)
        TextView tvAge;
        @BindView(R.id.ivProfile)
        ImageView ivProfile;

        public UserViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);

        }
    }


}
