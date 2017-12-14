package com.wq.mvp.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.cnaio5.mvp.R;
import com.wq.mvp.base.BaseActivity;
import com.wq.mvp.di.module.MainModule;
import com.wq.mvp.model.User;
import com.wq.mvp.presenter.impl.MainPresenterImpl;
import com.wq.mvp.view.view.MainBaseView;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainBaseView{

    //被Inject注解的，不能使用private修饰
    @Inject
    public MainPresenterImpl mainPresenter ;

    private EditText et_username ;
    private EditText et_pwd ;
    private Button btn_login ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(
                R.layout.activity_main);

        //MVP+Dagger2
        //分析Dagger2的源码，理解如何实现解耦  依赖注入框架

        et_username = (EditText) findViewById(R.id.et_username);
        et_pwd = (EditText) findViewById(R.id.et_pwd);
        btn_login = (Button) findViewById(R.id.btn_login);

//        mainPresenter = new MainPresenterImpl();
//        DaggerMainComponent.builder().mainModule(new MainModule(this)).build().inject(this);

        mainPresenter.attachView(this);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et_username.getText().toString();
                String pwd = et_pwd.getText().toString();
                User user = new User() ;
                user.name = name ;
                user.pwd = pwd ;
                mainPresenter.login(user);
            }
        });
    }

    @Override
    public void loginSuccess() {
        showToast("登录成功");
    }

    @Override
    public void loginFail() {
        showToast("登录失败");
    }
}
