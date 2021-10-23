package com.example.modu2_kelxx;

import com.example.modu2_kelxx.ListUserResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("api/users?page=1")
    Call<ListUserResponse> getList();

}

