package gun0912.databinding.compare.basic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import gun0912.databinding.BaseActivity;
import gun0912.databinding.R;
import gun0912.databinding.common.util.DataUtil;
import gun0912.databinding.common.SimpleDividerItemDecoration;

/**
 * Created by TedPark on 2017. 2. 2..
 */

public class BasicActivity extends BaseActivity  {

    TextView tvText1;
    TextView tvText2;
    TextView tvText3;
    TextView tvText4;
    TextView tvText5;
    Button btnSample;

    RecyclerView rcContent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_activity);


        tvText1 = (TextView) findViewById(R.id.tvText1);
        tvText2 = (TextView) findViewById(R.id.tvText2);
        tvText3 = (TextView) findViewById(R.id.tvText3);
        tvText4 = (TextView) findViewById(R.id.tvText4);
        tvText5 = (TextView) findViewById(R.id.tvText5);
        btnSample = (Button) findViewById(R.id.btnSample);
        rcContent = (RecyclerView) findViewById(R.id.rcContent);



        //btnSample.setOnClickListener(this);
        btnSample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        onButtonClick(view);
            }
        });




        setRecyclerView();

    }

    private void setRecyclerView() {

        rcContent.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rcContent.addItemDecoration(new SimpleDividerItemDecoration(this));
        BasicAdapter adapter = new BasicAdapter(this);
        rcContent.setAdapter(adapter);


        adapter.updateItems(DataUtil.getUsers());

    }



    public void onButtonClick(View view){
        Toast.makeText(this,"Button Click",Toast.LENGTH_SHORT).show();
    }




}
