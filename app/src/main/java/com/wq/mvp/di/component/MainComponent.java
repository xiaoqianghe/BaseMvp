package com.wq.mvp.di.component;



import com.wq.mvp.di.module.MainModule;
import com.wq.mvp.view.MainActivity;

import dagger.Component;

/**
 * <p>Description:
 *
 * 提供注入
 *
 * @author xzhang
 */
@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity activity);
}
