package com.wxg.basemvplib;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author WangXuguang
 * @date 2018/7/5.
 */

public class ParameterClassFactory {

    public static <T> T getParameterClass(Class tClass, int index) {
        //这里获得到的是类的泛型的类型

        ParameterizedType type = (ParameterizedType) tClass.getGenericSuperclass();
        T t = null;
        if (type != null) {
            Type[] actualTypeArguments = type.getActualTypeArguments();
            Class<T> sClass = (Class<T>) actualTypeArguments[index];
            try {
                t = sClass.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return t;

    }

}
