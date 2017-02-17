package gun0912.databinding.compare.butterknife;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import gun0912.databinding.BaseActivity;
import gun0912.databinding.R;
import gun0912.databinding.common.util.DataUtil;
import gun0912.databinding.common.SimpleDividerItemDecoration;

/**
 * Created by TedPark on 2017. 2. 2..
 */

public class ButterKnifeActivity extends BaseActivity {



    @BindView(R.id.tvText1)
    TextView tvText1;
    @BindView(R.id.tvText2)
    TextView tvText2;
    @BindView(R.id.tvText3)
    TextView tvText3;
    @BindView(R.id.tvText4)
    TextView tvText4;
    @BindView(R.id.tvText5)
    TextView tvText5;
    @BindView(R.id.btnSample)
    Button btnSample;

    @BindView(R.id.rcContent)
    RecyclerView rcContent;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.butterknife_activity);
        ButterKnife.bind(this);




        setRecyclerView();
    }


    private void setRecyclerView() {

        rcContent.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rcContent.addItemDecoration(new SimpleDividerItemDecoration(this));
        ButterKnifeAdapter adapter = new ButterKnifeAdapter(this);
        rcContent.setAdapter(adapter);


        adapter.updateItems(DataUtil.getUsers());

    }



    @OnClick(R.id.btnSample)
    public void onButtonClick(View view) {
        Toast.makeText(this, "Button Click", Toast.LENGTH_SHORT).show();
    }




}
