package com.wxg.mvpbaseapplication;

import android.util.Log;

import com.wxg.basemvplib.IBaseView;


/**
 * @author WangXuguang
 * @date 2018/7/5.
 */

public class TestView implements IBaseView {

    public void testView(){
        Log.e("TAG", "testView()");
    }

}
