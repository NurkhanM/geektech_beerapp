package com.geektech.beerapp.presentation.beers;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.beerapp.R;
import com.geektech.beerapp.model.BeerEntity;
import com.geektech.beerapp.presentation.beers.recycler.BeersAdapter;

import java.util.List;

public class BeersFragment extends Fragment
    implements IBeersContract.View {

    private IBeersContract.Presenter mPresenter;

    private RecyclerView recyclerView;
    private BeersAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new BeersAdapter();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate (
                R.layout.fragment_beers,
                container,
                false
        );

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);


        return view;
    }

    @Override
    public void showBeers(List<BeerEntity> beers) {
        adapter.setListBeer(beers);
        for (BeerEntity beerEntity : beers) {
            Log.d("ololo", beerEntity.toString());
        }
    }

    @Override
    public void openBeerDetails(int id) {

    }

    @Override
    public void attachPresenter(IBeersContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void finishView() {

    }
}
