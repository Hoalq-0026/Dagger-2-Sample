package com.techdb.dagger2sample.modules;

import com.techdb.dagger2sample.network.networkinterface.GitHubApiInterface;
import com.techdb.dagger2sample.scopes.UserScope;

import dagger.Module;
import dagger.Provides;
import retrofit.Retrofit;

/**
 * Created by le.quang.hoa on 10/24/16.
 */

@Module
public class GitHubModule {

    @Provides
    @UserScope
    public GitHubApiInterface providesGitHubInterface(Retrofit retrofit) {
        return retrofit.create(GitHubApiInterface.class);
    }
}
