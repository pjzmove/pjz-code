package com.example.pjz.mytestcodedemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{
    private Button mGetToastBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mGetToastBt.setOnClickListener(this);
    }

    private void initView() {
        mGetToastBt = (Button) findViewById(R.id.get_toast);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.get_toast:
                show("this is test demo");
                break;
            default:
                break;
        }
    }

    private void show(String txt) {
        Toast.makeText(this,txt,Toast.LENGTH_SHORT).show();
    }
}
