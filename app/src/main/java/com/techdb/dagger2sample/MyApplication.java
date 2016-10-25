package com.techdb.dagger2sample;

import android.app.Application;

import com.techdb.dagger2sample.components.DaggerGitHubComponent;
import com.techdb.dagger2sample.components.DaggerNetComponent;
import com.techdb.dagger2sample.components.GitHubComponent;
import com.techdb.dagger2sample.components.NetComponent;
import com.techdb.dagger2sample.modules.AppModule;
import com.techdb.dagger2sample.modules.GitHubModule;
import com.techdb.dagger2sample.modules.NetModule;

/**
 * Created by le.quang.hoa on 10/24/16.
 */

public class MyApplication extends Application {

    GitHubComponent mGitHubComponent;
    NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mNetComponent = DaggerNetComponent.builder().appModule(new AppModule(this))
                .netModule(new NetModule("https://api.github.com")).build();
        mGitHubComponent = DaggerGitHubComponent.builder().netComponent(mNetComponent).gitHubModule(new GitHubModule()).build();

    }

    public GitHubComponent getGitHubComponent() {
        return mGitHubComponent;
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
}

