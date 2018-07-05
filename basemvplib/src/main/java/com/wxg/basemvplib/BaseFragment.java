package com.wxg.basemvplib;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * @author WangXuguang
 * @date 2018/7/5.
 */

public class BaseFragment<T extends BasePresenter> extends Fragment {

    protected T mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();
    }

    private T createPresenter() {
        return ParameterClassFactory.getParameterClass(getClass(), 0);
    }
}
