package com.geektech.beerapp.presentation.beers.recycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.geektech.beerapp.R;
import com.geektech.beerapp.model.BeerEntity;

public class BeersHolder extends RecyclerView.ViewHolder {

    private TextView textTitle;
    private TextView textDescrip;
    private ImageView textImageUrl;
    private TextView textID;

    public BeersHolder(@NonNull View itemView) {
        super(itemView);

        textTitle = itemView.findViewById(R.id.txtBeersName);
        textDescrip = itemView.findViewById(R.id.txtBeersDescrip);
        textImageUrl = itemView.findViewById(R.id.imgBeers);
        textID = itemView.findViewById(R.id.txtBeersID);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Possition = " + getAdapterPosition(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    void onBind(BeerEntity beerEntity){
        textTitle.setText(beerEntity.getName());
        textDescrip.setText(beerEntity.getDescription());
        Glide.with(itemView.getContext()).load(beerEntity.getImageUrl()).into(textImageUrl);
        textID.setText(String.valueOf(beerEntity.getId()));

    }
}
