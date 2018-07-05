package com.wxg.mvpbaseapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wxg.basemvplib.BaseActivity;


public class MainActivity extends BaseActivity<TestPresenter> implements View.OnClickListener {

    private Button btn_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter.testPresenter();
    }

    @Override
    public void onClick(View v) {
    }
}
