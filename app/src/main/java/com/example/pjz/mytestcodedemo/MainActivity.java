package com.example.pjz.mytestcodedemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{
    private Button mGetToastBt;
    private Button mGetLogTxtBt;
    private Button mNewBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mGetToastBt.setOnClickListener(this);
        mGetLogTxtBt.setOnClickListener(this);
        mNewBt.setOnClickListener(this);
    }

    private void initView() {
        mGetToastBt = (Button) findViewById(R.id.get_toast);
        mGetLogTxtBt = (Button) findViewById(R.id.log_text);
        mNewBt = (Button) findViewById(R.id.new_button);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.get_toast:
                show("this is test demo");
                break;
            case R.id.log_text:
                show("this is a log button, if you click this button then output some message of this project debug");
                break;
            case R.id.new_button:

                break;
            default:
                break;
        }
    }

    private void show(String txt) {
        Toast.makeText(this,txt,Toast.LENGTH_SHORT).show();
        Factory.getInstance();
    }
}
