package gun0912.databinding.compare.basic;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import gun0912.databinding.R;
import gun0912.databinding.common.BaseRecyclerViewAdapter;
import gun0912.databinding.common.model.User;
import gun0912.databinding.common.util.ImageUtil;

/**
 * Created by TedPark on 2017. 2. 15..
 */

public class BasicAdapter extends BaseRecyclerViewAdapter<User, BasicAdapter.UserViewHolder> {


    public BasicAdapter(Context context) {
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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.basic_item, parent, false);
        return new UserViewHolder(view);
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        TextView tvName;
        TextView tvAge;
        ImageView ivProfile;

        public UserViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tvName);
            tvAge = (TextView) itemView.findViewById(R.id.tvAge);
            ivProfile = (ImageView) itemView.findViewById(R.id.ivProfile);
        }
    }


}
