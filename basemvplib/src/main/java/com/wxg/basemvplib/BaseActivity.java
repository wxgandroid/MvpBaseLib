package com.wxg.basemvplib;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @author WangXuguang
 * @date 2018/7/5.
 */

public class BaseActivity<T extends BasePresenter> extends AppCompatActivity {

    protected T mPresenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();
    }

    /**
     * 获得presenter的对象
     *
     * @return
     */
    private T createPresenter() {
        //这里获得到的是类的泛型的类型
        return ParameterClassFactory.getParameterClass(getClass(), 0);
    }
}
