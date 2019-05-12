package com.code.knab.sportgeeks.network.api;

import com.code.knab.sportgeeks.network.json.SearchSportEvent;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MyEventsApi {

    @GET("event/user/list/{id}")
    Single<List<SearchSportEvent>> getEventsList(@Path("id") Long id);
}
