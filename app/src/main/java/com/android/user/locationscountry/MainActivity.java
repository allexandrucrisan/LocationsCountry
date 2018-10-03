package com.android.user.locationscountry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LocationAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Location> locationArrayList = new ArrayList<Location>();

        locationArrayList.add(new Location(getResources().getString(R.string.title1),getResources().getString(R.string.description1), R.drawable.rome ));
        locationArrayList.add(new Location(getResources().getString(R.string.title2),getResources().getString(R.string.description2), R.drawable.sydney ));
        locationArrayList.add(new Location(getResources().getString(R.string.title3),getResources().getString(R.string.description3), R.drawable.porto ));
        locationArrayList.add(new Location(getResources().getString(R.string.title4),getResources().getString(R.string.description4), R.drawable.london ));
        locationArrayList.add(new Location(getResources().getString(R.string.title5),getResources().getString(R.string.description5), R.drawable.paris ));
        locationArrayList.add(new Location(getResources().getString(R.string.title6),getResources().getString(R.string.description6), R.drawable.barcelona ));
        locationArrayList.add(new Location(getResources().getString(R.string.title7),getResources().getString(R.string.description7), R.drawable.dubai ));
        locationArrayList.add(new Location(getResources().getString(R.string.title8),getResources().getString(R.string.description8), R.drawable.florence ));
        locationArrayList.add(new Location(getResources().getString(R.string.title9),getResources().getString(R.string.description9), R.drawable.newyork ));

        RecyclerView recyclerView = findViewById(R.id.listLocations);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter = new LocationAdapter(this, locationArrayList);
        recyclerView.setAdapter(adapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, linearLayoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);

    }
}
