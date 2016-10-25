package com.techdb.dagger2sample.components;

import com.techdb.dagger2sample.MainActivity;
import com.techdb.dagger2sample.modules.GitHubModule;
import com.techdb.dagger2sample.scopes.UserScope;

import dagger.Component;

/**
 * Created by le.quang.hoa on 10/24/16.
 */
@UserScope
@Component (dependencies = NetComponent.class, modules = GitHubModule.class)

public interface GitHubComponent {

    void inject(MainActivity mainActivity);
}
