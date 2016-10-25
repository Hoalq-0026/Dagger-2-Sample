package com.techdb.dagger2sample.components;

import android.content.SharedPreferences;

import com.squareup.okhttp.OkHttpClient;
import com.techdb.dagger2sample.modules.AppModule;
import com.techdb.dagger2sample.modules.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit.Retrofit;

/**
 * Created by le.quang.hoa on 10/24/16.
 */
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {

    Retrofit retrofit();

    OkHttpClient okHttpClient();

    SharedPreferences sharedPreferences();
}
