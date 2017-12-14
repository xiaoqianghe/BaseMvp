package com.wq.mvp.base;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.wq.mvp.view.view.BaseView;


/**
 * <p>Description:
 *
 * @author xzhang
 */

public class BaseActivity extends AppCompatActivity implements BaseView {


    @Override
    public void showToast(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
