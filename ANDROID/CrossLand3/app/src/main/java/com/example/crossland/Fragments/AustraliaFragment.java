package com.example.crossland.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.crossland.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AustraliaFragment extends Fragment {
private ImageView ausflag;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_australia, container, false);
        ausflag=(ImageView)view.findViewById(R.id.ausflag);
        Glide.with(getActivity()).load(R.drawable.australia).into(ausflag);
        return view;
    }

}
