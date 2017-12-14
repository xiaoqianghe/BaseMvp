package com.wq.mvp.di.module;

import com.wq.mvp.view.view.MainBaseView;

import dagger.Module;
import dagger.Provides;

/**
 * <p>Description:
 *
 * 提供参数
 *
 * @author xzhang
 */

@Module
public class MainModule {
    private MainBaseView mainBaseView ;

    public MainModule(MainBaseView view){
        this.mainBaseView = view ;
    }

    @Provides
    public MainBaseView provideMainBase(){
        return mainBaseView ;
    }
}
