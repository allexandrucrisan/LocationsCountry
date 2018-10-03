package com.android.user.locationscountry;

import android.content.Context;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.ViewHolder> {

    private List<Location> itemData;
    private LayoutInflater layoutInflater;
    //private ItemClickListener mClickListener;

    // data is passed into the constructor
    LocationAdapter(Context context, List<Location> data) {
        this.layoutInflater = LayoutInflater.from(context);
        this.itemData = data;
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.items_list, parent, false);
        return new ViewHolder(view);
    }


    // binds the data to the TextView in each row
    @Override

    public void onBindViewHolder(ViewHolder holder, int position) {
        Location location = itemData.get(position);
        holder.title.setText(location.getTitle());
        holder.description.setText(location.getDescription());
        holder.locationImage.setImageResource(location.getImageResourceId());

    }


    // total number of rows
    @Override
    public int getItemCount() {
        return itemData.size();
    }

    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView description;
        ImageView locationImage;

        ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title_name);
            description = itemView.findViewById(R.id.description_name);
            locationImage = itemView.findViewById(R.id.image_location);

            //itemView.setOnClickListener(this);
        }

        //@Override
        // public void onClick(View view) {
        //     if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        // }
    }
/**
 // convenience method for getting data at click position
 String getItem(int id) {
 return mData.get(id);
 }

 // allows clicks events to be caught
 void setClickListener(ItemClickListener itemClickListener) {
 this.mClickListener = itemClickListener;
 }

 // parent activity will implement this method to respond to click events
 public interface ItemClickListener {
 void onItemClick(View view, int position);
 }**/
}

