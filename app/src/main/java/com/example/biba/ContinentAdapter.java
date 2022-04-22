package com.example.biba;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.biba.databinding.ItemBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter <ContinentAdapter.ContinentViewHolder>  {
    private ArrayList <Continent> list;

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding itemBinding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ContinentViewHolder(itemBinding);

    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.bind(list.get(position));
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
