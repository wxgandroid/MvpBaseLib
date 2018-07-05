package com.wxg.basemvplib;

/**
 * @author WangXuguang
 * @date 2018/7/5.
 */

public class BasePresenter<V extends IBaseView, M extends BaseModule> {

    protected V mView;

    protected M mModule;

    public BasePresenter() {
        mView = attachView();
        mModule = createModule();
    }

    /**
     * 创建module对象
     *
     * @return
     */
    private M createModule() {
        //这里获得到的是类的泛型的类型
        return ParameterClassFactory.getParameterClass(getClass(), 1);
    }

    /**
     * 创建view对象
     *
     * @return
     */
    private V attachView() {
        //这里获得到的是类的泛型的类型
        return ParameterClassFactory.getParameterClass(getClass(), 0);
    }


}
