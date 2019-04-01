package com.geektech.beerapp.presentation.beers.recycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.beerapp.R;
import com.geektech.beerapp.model.BeerEntity;

import java.util.ArrayList;
import java.util.List;

public class BeersAdapter extends RecyclerView.Adapter<BeersHolder> {

    private List<BeerEntity> listBeer = new ArrayList<>();


    @NonNull
    @Override
    public BeersHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_beers, viewGroup, false);

        return new BeersHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BeersHolder beersHolder, int i) {
        beersHolder.onBind(listBeer.get(i));

    }

    @Override
    public int getItemCount() {
        return listBeer.size();
    }

    public void setListBeer(List<BeerEntity> listBeer){
        this.listBeer.clear();
        this.listBeer.addAll(listBeer);
        notifyDataSetChanged();
    }
}
