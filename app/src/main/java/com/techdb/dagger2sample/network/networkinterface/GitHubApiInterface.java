package com.techdb.dagger2sample.network.networkinterface;

import com.techdb.dagger2sample.models.Repository;

import java.util.ArrayList;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by le.quang.hoa on 10/24/16.
 */

public interface GitHubApiInterface {

    @GET("/users/{user}/repos")
    Call<ArrayList<Repository>> getRepository(@Path("user") String userName);
}
