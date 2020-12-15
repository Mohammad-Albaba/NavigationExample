package com.example.navigationexample;

import android.media.Image;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyPager2Adapter extends RecyclerView.Adapter<MyPager2Adapter.ImagesHolder> {

    private List<Integer> mItems;

    public MyPager2Adapter(List<Integer> items) {
        mItems = items;
    }

    @NonNull
    @Override
    public ImagesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ImagesHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImagesHolder holder, int position) {
        holder.bind(mItems.get(position));
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    class ImagesHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public ImagesHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);

        }

        public void bind(Integer item) {
            imageView.setImageResource(item);
            // TODO: bind item with view
        }
    }
}
