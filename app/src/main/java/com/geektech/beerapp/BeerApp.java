package com.geektech.beerapp;

import android.app.Application;
import android.util.Log;

import com.geektech.beerapp.data.beers.BeerRepository;
import com.geektech.beerapp.data.beers.IBeerDataSource;
import com.geektech.beerapp.data.beers.local.BeerLocalDataSource;
import com.geektech.beerapp.data.beers.remote.BeerRemoteDataSource;

public class BeerApp extends Application {

    public static IBeerDataSource beerRepository;

    @Override
    public void onCreate() {
        super.onCreate();

        beerRepository = new BeerRepository(
                new BeerLocalDataSource(),
                new BeerRemoteDataSource()
        );

        Log.d("ololo", "On application create");
    }
}
