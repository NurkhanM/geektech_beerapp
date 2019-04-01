package com.geektech.beerapp.data.beers;

import com.geektech.beerapp.data.beers.local.IBeerLocalDataSource;
import com.geektech.beerapp.data.beers.remote.IBeerRemoteDataSource;
import com.geektech.beerapp.model.BeerEntity;

public class BeerRepository implements IBeerDataSource {

    private IBeerLocalDataSource mLocal;
    private IBeerRemoteDataSource mRemote;

    public BeerRepository(
            IBeerLocalDataSource local,
            IBeerRemoteDataSource remote) {
        mLocal = local;
        mRemote = remote;
    }

    @Override
    public void getBeers(BeersCallback callback) {
       mRemote.getBeers(callback);
    }

    //1 - Activity make request data from repository via getBeers(callback)
    //2 - Repository redirect to remote


    @Override
    public BeerEntity getBeer(int id) {
        return null;
    }
}
