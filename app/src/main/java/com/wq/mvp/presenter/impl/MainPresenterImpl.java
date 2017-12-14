package com.wq.mvp.presenter.impl;

import com.wq.mvp.model.User;
import com.wq.mvp.presenter.BasePresenterImpl;
import com.wq.mvp.presenter.MainPresenter;
import com.wq.mvp.view.view.MainBaseView;

import javax.inject.Inject;

/**
 * <p>Description:
 *
 * @author xzhang
 */

public class MainPresenterImpl extends BasePresenterImpl<MainBaseView> implements MainPresenter {


    @Inject
    public MainPresenterImpl(MainBaseView view){

    }

    @Override
    public void login(User user) {
        if(user.name.equals("abc") && user.pwd.equals("123")){
            mPresenterView.loginSuccess();
        }else {
            mPresenterView.loginFail();
        }
    }
}
