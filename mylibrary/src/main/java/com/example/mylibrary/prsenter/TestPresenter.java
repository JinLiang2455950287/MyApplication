package com.example.mylibrary.prsenter;


import com.example.mylibrary.base.ResultBase;
import com.example.mylibrary.view.TestView;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by czy on 2017/7/19.
 */

public class TestPresenter implements BasePresenter<TestView> {
    private TestView testView;
    private Observable<ResultBase> obserable;

    @Override
    public void attachView(TestView mvpView) {
        this.testView = mvpView;
    }


    public void getData(Observable<ResultBase> obserable) {
        obserable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResultBase>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull ResultBase resultBase) {

                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
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
