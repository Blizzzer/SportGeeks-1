package com.code.knab.sportgeeks.ui.welcome.mvp;

import com.code.knab.sportgeeks.network.json.SearchSportEvent;

import java.util.List;

import io.reactivex.Single;

public interface WelcomeMVP {

    interface View {

    }

    interface Presenter {
        void getEventsList(Long userId);
    }

    interface Model {
        Single<List<SearchSportEvent>> getEventsList(Long userId);
    }

}
