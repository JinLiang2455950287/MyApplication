package com.example.mylibrary;

import android.support.multidex.MultiDexApplication;

import com.example.mylibrary.api.ApiManager;
import com.example.mylibrary.api.ApiService;
import com.example.mylibrary.base.BaseActivity;

import java.util.List;
import java.util.Vector;

/**
 * Created by czy on 2017/7/19.
 */

public class App extends MultiDexApplication {
    private List<BaseActivity> activityStacks = new Vector<BaseActivity>();
    protected static App app;
    private ApiService apiService;
    private Api api;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        init();

    }

    private void init() {
        ApiManager.build();//初始化retrofit对象
        apiService = ApiManager.getRetrofit().create(ApiService.class);//获取retrofit对象
        api = ApiManager.getRetrofit().create(Api.class);
    }

    public static App getInstance() {
        return app;
    }

    public ApiService getApiService() {
        return apiService;
    }

    public Api getApi() {
        return api;
    }

    public void pushActivity(BaseActivity activity) {
        if (!activityStacks.contains(activity))
            activityStacks.add(activity);
    }

    public void popActivity(BaseActivity activity) {
        activityStacks.remove(activity);
    }

    public void exitApp() {
        for (BaseActivity activity : activityStacks) {
            activity.finish();
        }
        activityStacks.clear();
    }
}
