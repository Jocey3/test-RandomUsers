package dev.jocey.test_randomusers.model;

import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dev.jocey.test_randomusers.model.entities.Response;
import dev.jocey.test_randomusers.model.entities.User;
import io.reactivex.rxjava3.core.Single;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.HttpException;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class Fetcher {
    public static final String BASE_URL = "https://randomuser.me/";
    private final ApiUsers apiUsers;

    public Fetcher() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .build();
        apiUsers = retrofit.create(ApiUsers.class);
    }

    public Single<List<User>> getUsers(Integer amountOfUsers) {
        return apiUsers.getUsers(amountOfUsers)
                .map(Response::getUsers);
    }
}
