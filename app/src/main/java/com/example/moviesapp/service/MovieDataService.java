package com.example.moviesapp.service;

import com.example.moviesapp.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDataService {

    // Api key 63ff45a8b879c7b49eb41e01cd263c69
    // BASE URL https://api.themoviedb.org/3/
    // END POINT URL movie/popular?api_key=63ff45a8b879c7b49eb41e01cd263c69
    @GET("Movie/popular")
    Call<Result> getPopularMovies(@Query("api_key") String apiKey);

}
