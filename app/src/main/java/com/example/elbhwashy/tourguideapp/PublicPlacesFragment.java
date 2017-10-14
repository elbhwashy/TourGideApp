package com.example.elbhwashy.tourguideapp;

/**
 * Created by elbhwashy on 9/29/2017.
 */
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class PublicPlacesFragment extends Fragment{
    public PublicPlacesFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items, container, false);
        final ArrayList<Attraction> attract = new ArrayList<Attraction>();

        attract.add(new Attraction(R.drawable.alexander ,R.string.alexander ,R.string.rating_five,R.string.superior));
        attract.add(new Attraction(R.drawable.gaucho_steakhouse ,R.string.gaucho_steak_house ,R.string.rating_five,R.string.superior));
        attract.add(new Attraction(R.drawable.smokry ,R.string.the_smokry ,R.string.rating_fourh,R.string.superior));
        attract.add(new Attraction(R.drawable.le_deauville,R.string.le_deauville ,R.string.rating_four,R.string.very_good));
        attract.add(new Attraction(R.drawable.la_rotisserie ,R.string.la_rotisserio ,R.string.rating_four,R.string.very_good));
        attract.add(new Attraction(R.drawable.blue_blue,R.string.blue_blue ,R.string.rating_three,R.string.good));
        attract.add(new Attraction(R.drawable.mo_by_drick,R.string.mo_by_drick ,R.string.rating_four,R.string.very_good));
        attract.add(new Attraction(R.drawable.zia_amelia,R.string.zia_amelia ,R.string.rating_four,R.string.good));
        attract.add(new Attraction(R.drawable.caribbean_restaurant,R.string.caribbean ,R.string.rating_fourh,R.string.good));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attract, R.color.category_numbers);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }
}
