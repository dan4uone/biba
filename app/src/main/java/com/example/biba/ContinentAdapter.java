package com.example.biba;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.biba.databinding.ItemBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter <ContinentAdapter.ContinentViewHolder>  {
    private ArrayList <Continent> list;
    private OnClick onClick;

    public ContinentAdapter(ArrayList<Continent> list, OnClick onClick) {
        this.list = list;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding itemBinding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ContinentViewHolder(itemBinding);

    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.bind(list.get(position));
       holder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               onClick.onClick(list.get(position));
           }
       });
    }

    @Override
    public int getItemCount() {

        return list.size();
    }

    class ContinentViewHolder extends RecyclerView.ViewHolder {
        private ItemBinding binding;
        public ContinentViewHolder(@NonNull ItemBinding itemView) {

            super(itemView.getRoot());
            this.binding=itemView;

        }

        public void bind(Continent continent) {
            binding.image.setImageResource(continent.getImage());
            binding.text1.setText(continent.getText());
        }
    }
}
