package com.example.mylibrary.prsenter;

/**
 * Created by czy on 2017/7/19.
 */
public interface BasePresenter<V> {

    void attachView(V mvpView);

//    void detachView();
//
//    void onCancel();
}
