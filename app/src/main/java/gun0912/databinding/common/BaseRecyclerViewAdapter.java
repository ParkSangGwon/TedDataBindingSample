package gun0912.databinding.common;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TedPark on 15. 9. 10..
 */
public abstract class BaseRecyclerViewAdapter<T, H extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    protected List<T> arrayList;
    OnItemClickListener onItemClickListener;
    OnItemLongClickListener onItemLongClickListener;
    private Context context;


    public BaseRecyclerViewAdapter(Context context) {
        this.context = context;
    }

    public BaseRecyclerViewAdapter(Context context, List<T> arrayList) {
        this.context = context;
        this.arrayList = arrayList;

    }

    public Context getContext() {
        return context;
    }

    @Override
    public int getItemCount() {
        if (arrayList == null)
            return 0;


        return arrayList.size();
    }

    public T getItem(int position) {
        if (arrayList == null)
            return null;


        return arrayList.get(position);
    }

    public void updateItems(List<T> items) {

        if (this.arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.arrayList.clear();
        this.arrayList.addAll(items);

        notifyDataSetChanged();
    }

    public void addItems(List<T> items) {

        if (this.arrayList == null) {
            this.arrayList = items;
        } else {
            this.arrayList.addAll(items);
        }

        notifyDataSetChanged();


    }

    public void clearItems() {
        if (arrayList != null) {

            arrayList.clear();
            notifyDataSetChanged();
        }


    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (onItemClickListener != null) {
                    onItemClickListener.onItemClick(holder.itemView, position);
                }

            }
        });
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (onItemLongClickListener != null) {
                    onItemLongClickListener.onItemLongClick(holder.itemView, position);
                }

                return false;
            }
        });


        onBindView((H) holder, position);


    }

    abstract public void onBindView(H holder, int position);

    public void setOnItemClickListener(
            OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public void setOnItemLongClickListener(
            OnItemLongClickListener onItemLongClickListener) {
        this.onItemLongClickListener = onItemLongClickListener;
    }

    public interface OnItemClickListener {

        public void onItemClick(View view, int position);
    }


    public interface OnItemLongClickListener {

        public void onItemLongClick(View view, int position);
    }


}
