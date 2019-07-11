package com.example.crossland.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.crossland.Adapter.EuropeAdapter;
import com.example.crossland.Adapter.HomeAdapter;
import com.example.crossland.Model.HomeModel;
import com.example.crossland.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EuropeFragment extends Fragment {
    RecyclerView rec;
    ArrayList<HomeModel> arrayList=new ArrayList<>();
    EuropeAdapter europeAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_europe,container,false);
        rec=(RecyclerView)view.findViewById(R.id.europe_rec);
        arrayList.add(new HomeModel("GERMANY",R.drawable.germany));
        arrayList.add(new HomeModel("SWITZERLAND",R.drawable.switzerland));
        arrayList.add(new HomeModel("POLAND",R.drawable.poland));
        arrayList.add(new HomeModel("CYPRUS",R.drawable.cyprus));
        arrayList.add(new HomeModel("LATVIA",R.drawable.latvia));
        europeAdapter=new EuropeAdapter(arrayList,getActivity());
        rec.setNestedScrollingEnabled(false);
        rec.setAdapter(europeAdapter);
        rec.setLayoutManager(new GridLayoutManager(getActivity(),2));
        return view;
    }

}