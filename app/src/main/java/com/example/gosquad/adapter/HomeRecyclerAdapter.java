package com.example.gosquad.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gosquad.model.Order;

import java.util.List;

public class HomeRecyclerAdapter extends RecyclerView.Adapter<HomeRecyclerAdapter.HomeRecyclerViewHolder> {

    private List<Order> items;
    public HomeRecyclerAdapter(List<Order> items)
    {
        this.items = items;
    }

    @NonNull
    @Override
    public HomeRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull HomeRecyclerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class HomeRecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        public HomeRecyclerViewHolder(View itemView)
        {
            super(itemView);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
