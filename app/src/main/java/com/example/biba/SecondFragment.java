package com.example.biba;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.biba.databinding.FragmentSecondBinding;

import java.util.ArrayList;


public class SecondFragment extends Fragment implements OnClick {
    private ContinentAdapter adapter;
    private ArrayList <Continent> list;
    private FragmentSecondBinding binding;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(LayoutInflater.from(requireActivity()), container , false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter=new ContinentAdapter(list,this);
        binding.recycler.setAdapter(adapter);




    }

    private void loadData() {
        list = new ArrayList<>();
        Bundle bundle = getArguments();
        switch (bundle.getString("key")){
            case "South America":
                list.add(new Continent(R.drawable.brasil, "Brasil"));
                list.add(new Continent(R.drawable.argentina, "Argentina"));
                list.add(new Continent(R.drawable.uruguay, "Urgay"));
                list.add(new Continent(R.drawable.ve, "Venezuela"));
                list.add(new Continent(R.drawable.guy, "Guyana"));
                break;
            case "North America":
                list.add(new Continent(R.drawable.usa, "USA"));
                list.add(new Continent(R.drawable.canada, "Canada"));
                list.add(new Continent(R.drawable.jm, "Jamaica"));
                list.add(new Continent(R.drawable.cuba, "Cuba"));
                list.add(new Continent(R.drawable.pa, "Panama"));
            case "Eurasia":
                list.add(new Continent(R.drawable.de, "Germany"));
                list.add(new Continent(R.drawable.it, "Italy"));
                list.add(new Continent(R.drawable.china, "China"));
                list.add(new Continent(R.drawable.kg, "Spawnpoint"));
                list.add(new Continent(R.drawable.kz, "Kazakhstan"));
            case "Africa":
                list.add(new Continent(R.drawable.south_af, "South Africa"));
                list.add(new Continent(R.drawable.ng, "Nigeria"));
                list.add(new Continent(R.drawable.ug, "Uganda"));
                list.add(new Continent(R.drawable.nigger, "Niger"));
                list.add(new Continent(R.drawable.ao, "Angola"));
            case "Australia":
                list.add(new Continent(R.drawable.au, "Australia"));
            case "Antarctica" :
                list.add(new Continent(R.drawable.CEU, "NONE") );












        }
    }


    @Override
    public void onClick(Continent continent) {


    }
}