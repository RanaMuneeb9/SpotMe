package com.munib.spotme.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.munib.spotme.R;
import com.munib.spotme.adapters.PendingDealsAdapter;
import com.munib.spotme.dataModels.DataModel;

import java.util.ArrayList;

public class InvestFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<DataModel> dataModels;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_invest, container, false);
        recyclerView=root.findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        dataModels=new ArrayList<>();
//        dataModels.add(new DataModel());
//        dataModels.add(new DataModel());
//        dataModels.add(new DataModel());
//        dataModels.add(new DataModel());
//        dataModels.add(new DataModel());
//        dataModels.add(new DataModel());

        recyclerView.setAdapter(new PendingDealsAdapter(getActivity(),dataModels));
        return root;
    }
}