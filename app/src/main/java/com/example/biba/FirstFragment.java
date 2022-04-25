package com.example.biba;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.biba.databinding.FragmentFirstBinding;

import java.util.ArrayList;

public class FirstFragment extends Fragment implements OnClick {
    private FragmentFirstBinding binding;
    private ContinentAdapter adapter;
    private ArrayList <Continent> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding =  FragmentFirstBinding.inflate(LayoutInflater.from(requireContext()),container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter= new ContinentAdapter(list, (OnClick) this);
        binding.recycle.setAdapter(adapter);


    }

    private void loadData() {
        list = new ArrayList<>();
        list.add(new Continent(R.drawable.COC, "Australia"));
        list.add(new Continent(R.drawable.CAS, "Eurasia"));
        list.add(new Continent(R.drawable.sa, "SouthAmerica"));
        list.add(new Continent(R.drawable.na, "NorthAmerica"));
        list.add(new Continent(R.drawable.africa, "Africa"));
        list.add(new Continent(R.drawable.CEU, "Antarctica"));


    }
    public void onClick(Continent continent){
        Bundle bundle = new Bundle();
        bundle.putString("key", continent.getText());
        Fragment fragment = new SecondFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).addToBackStack(null).commit();


    }
}