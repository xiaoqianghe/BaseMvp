package com.wq.mvp.presenter;

import com.wq.mvp.view.view.BaseView;

/**
 * <p>Description:
 *
 * 因为所有的Presenter都有绑定和解绑View的操作，所以定义该基类
 *
 * @author xzhang
 */

public class BasePresenterImpl<T extends BaseView> implements BasePresenter<T> {

    public T mPresenterView ;

    @Override
    public void attachView(T view) {
        this.mPresenterView = view ;
    }

    @Override
    public void detachView() {
        this.mPresenterView = null ;
    }
}
