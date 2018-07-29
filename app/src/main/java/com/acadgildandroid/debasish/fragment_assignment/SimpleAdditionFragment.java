package com.acadgildandroid.debasish.fragment_assignment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SimpleAdditionFragment extends Fragment {

    private TextView nameFragTxt;


    public SimpleAdditionFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_simple_additionfragment, container, false);

        nameFragTxt = (TextView) rootView.findViewById(R.id.nameTxt);


        //UNPACK OUR DATA FROM OUR BUNDLE
        String name = this.getArguments().getString("VALUE_KEY").toString();

        nameFragTxt.setText("VALUE : " + name);


        return rootView;
       // return inflater.inflate(R.layout.fragment_simple_additionfragment, container, false);
    }


}
