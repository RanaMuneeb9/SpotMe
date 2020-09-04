package com.munib.spotme.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.munib.spotme.R;
import com.munib.spotme.adapters.LendedDealsAdapter;
import com.munib.spotme.adapters.PendingDealsAdapter;
import com.munib.spotme.dataModels.DataModel;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MyDealsLendedFragment extends Fragment {


    ListView list;
    RecyclerView recyclerView;
    ArrayList<DataModel> dataModels;

    public MyDealsLendedFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_deals_lended, container, false);

        recyclerView=view.findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        dataModels=new ArrayList<>();
        dataModels.add(new DataModel());
        dataModels.add(new DataModel());
        dataModels.add(new DataModel());
        dataModels.add(new DataModel());
        dataModels.add(new DataModel());
        dataModels.add(new DataModel());

        recyclerView.setAdapter(new LendedDealsAdapter(getActivity(),dataModels));
        return view;
    }
}