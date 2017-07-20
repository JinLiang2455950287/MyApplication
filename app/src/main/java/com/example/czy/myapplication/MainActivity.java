package com.example.czy.myapplication;

import android.os.Bundle;

import com.example.mylibrary.RequestBody.RequsetParams;
import com.example.mylibrary.base.BaseActivity;
import com.example.mylibrary.base.ResultBase;
import com.example.mylibrary.prsenter.TestPresenter;
import com.example.mylibrary.view.TestView;

import io.reactivex.Observable;

public class MainActivity extends BaseActivity implements TestView {
    private TestPresenter testPresenter = new TestPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testPresenter.attachView(this);
        testPresenter.getData(app.getApiService().getTest(new RequsetParams()));
    }

    @Override
    public void getData(String data) {

    }

    @Override
    public void getDataErr(String err) {

    }
}