package com.example.android.navigationdrawerexample;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;

/**
 * Created by SnsPlusVN_05 on 3/27/2015.
 */
public class fragment_map extends android.app.Fragment {
    private GoogleMap gMap;
    private MapView mapView;
    private FragmentManager fragmentManager;



    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.layout_fragment_map,container, false);


        /*mapView = (MapView) getView().findViewById(R.id.mapview);
        mapView.onCreate(savedInstanceState);

        gMap = mapView.getMap();
        MapsInitializer.initialize(getActivity());*/
        return  v;


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);





        Log.d("haunt", "da gan duoc Map");

        Toast.makeText(getActivity(), "Da gan duoc map", Toast.LENGTH_LONG).show();
    }
}
