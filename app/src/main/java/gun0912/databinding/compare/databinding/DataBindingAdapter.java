package gun0912.databinding.compare.databinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import gun0912.databinding.R;
import gun0912.databinding.common.BaseRecyclerViewAdapter;
import gun0912.databinding.common.model.User;
import gun0912.databinding.databinding.DatabindingItemBinding;

/**
 * Created by TedPark on 2017. 2. 15..
 */

public class DataBindingAdapter extends BaseRecyclerViewAdapter<User, DataBindingAdapter.UserViewHolder> {


    public DataBindingAdapter(Context context) {
        super(context);
    }


    @Override
    public void onBindView(UserViewHolder holder, int position) {

        User user = getItem(position);
        holder.binding.setUser(user);

    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.databinding_item, parent, false);
        return new UserViewHolder(view);
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        DatabindingItemBinding binding;

        public UserViewHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }


}
