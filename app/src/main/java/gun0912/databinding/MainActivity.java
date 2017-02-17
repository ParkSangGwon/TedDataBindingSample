package gun0912.databinding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import gun0912.databinding.compare.basic.BasicActivity;
import gun0912.databinding.compare.butterknife.ButterKnifeActivity;
import gun0912.databinding.compare.databinding.DataBindingActivity;
import gun0912.databinding.sns.SnsActivity1;
import gun0912.databinding.sns.SnsActivity2;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button  btnBasic = (Button) findViewById(R.id.btnBasic);
        btnBasic.setOnClickListener(this);
        Button  btnButterKnife = (Button) findViewById(R.id.btnButterKnife);
        btnButterKnife.setOnClickListener(this);
        Button  btnDataBinding = (Button) findViewById(R.id.btnDataBinding);
        btnDataBinding.setOnClickListener(this);

        Button btnSns1 = (Button) findViewById(R.id.btnSns1);
        btnSns1.setOnClickListener(this);

        Button btnSns2 = (Button) findViewById(R.id.btnSns2);
        btnSns2.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        Intent intent;

        switch (view.getId()){
            case R.id.btnBasic:
                intent = new Intent(this,BasicActivity.class);
                break;

            case R.id.btnButterKnife:
                intent = new Intent(this,ButterKnifeActivity.class);
                break;
            case R.id.btnDataBinding:
                intent = new Intent(this,DataBindingActivity.class);
                break;

            case R.id.btnSns1:
                intent=new Intent(this, SnsActivity1.class);
                break;

            case R.id.btnSns2:
                intent=new Intent(this, SnsActivity2.class);
                break;

            default:
                return;
        }

        startActivity(intent);

    }
}
