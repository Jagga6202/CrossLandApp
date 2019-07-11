package com.example.crossland.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.crossland.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class StudyAbroadFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_study_abroad, container, false);
        return view;
    }

}
