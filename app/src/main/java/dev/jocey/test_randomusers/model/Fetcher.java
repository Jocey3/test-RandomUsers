package dev.jocey.test_randomusers.model;

import dev.jocey.test_randomusers.model.entities.User;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Single;
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

    public @NonNull Single<String> getUsers(Integer amountOfUsers) {
        return apiUsers.getUsers(amountOfUsers).map(response -> response.getInfo().getResults().toString());

    }
}
