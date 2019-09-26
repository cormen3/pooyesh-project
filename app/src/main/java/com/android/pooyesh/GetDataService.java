package com.android.pooyesh;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Hossein Gheisary on 26/09/2019.
 */
public interface GetDataService {

    @GET("/v2/5d8c75842e00002f05abd919")
    Call<List<Movie>> getAllMovies();
}
