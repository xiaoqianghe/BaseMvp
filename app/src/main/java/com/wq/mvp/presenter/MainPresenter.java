package com.wq.mvp.presenter;

import com.wq.mvp.model.User;
import com.wq.mvp.view.view.MainBaseView;

/**
 * <p>Description:
 *
 * @author xzhang
 */

public interface MainPresenter extends BasePresenter<MainBaseView> {

    void login(User user) ;
}
