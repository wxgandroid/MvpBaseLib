package com.wxg.mvpbaseapplication;

import android.util.Log;

import com.wxg.basemvplib.BasePresenter;


/**
 * @author WangXuguang
 * @date 2018/7/5.
 */

public class TestPresenter extends BasePresenter<TestView, TestModule> {


    public void testPresenter() {
        Log.e("TAG", "testPresenter()");
        mView.testView();
        mModule.testModule();
    }

}
