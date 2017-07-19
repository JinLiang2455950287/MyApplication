package com.example.mylibrary.prsenter;

import android.database.Observable;

import com.example.mylibrary.base.ResultBase;
import com.example.mylibrary.view.TestView;

import org.reactivestreams.Subscriber;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by czy on 2017/7/19.
 */

public class TestPresenter implements BasePresenter<TestView> {
    private TestView testView;
    //    private Call<ResultBase> call;
    private Observable<ResultBase> obserable;

    @Override
    public void attachView(TestView mvpView) {
        this.testView = mvpView;
    }


    public void getData(Observable<ResultBase> obserable) {

//        call.enqueue(new ResponseCallback<ResultBase>() {
//            @Override
//            public void onSuccess(Call call, ResultBase resultBase) {
//                  testView.getData("");
//            }
//
//            @Override
//            public void onError(Call call, ResultBase resultBase, int errorCode) {
//                   testView.getDataErr("");
//            }
//
//            @Override
//            public void onFail(Call call, String msg) {
//
//            }
//
//            @Override
//            public void onResult() {
//
//            }
//        });
    }

//
//            @Override
//            public void detachView() {
//                testView = null;
//            }
//
//            @Override
//            public void onCancel() {
//                if (call != null && !call.isCanceled()) {
//                    call.cancel();
//                }
//            }
}
