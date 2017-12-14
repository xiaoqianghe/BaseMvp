package com.wq.mvp.presenter;

/**
 * <p>Description:
 *
 * 如果应用中界面比较多，每个界面都有各自的接口View，那么在此就不能使用简单的BaseView了,可以使用泛型解决该问题
 *
 * @author xzhang
 */

public interface BasePresenter<T> {

    void attachView(T view) ;
    void detachView() ;
}
