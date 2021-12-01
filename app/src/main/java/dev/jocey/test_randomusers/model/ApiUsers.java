package dev.jocey.test_randomusers.model;

import dev.jocey.test_randomusers.model.entities.Response;
import dev.jocey.test_randomusers.model.entities.User;
import io.reactivex.rxjava3.core.Single;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiUsers {

    @GET("api/")
    Single<Response> getUsers(@Query("results") Integer amountOfUsers);


}
