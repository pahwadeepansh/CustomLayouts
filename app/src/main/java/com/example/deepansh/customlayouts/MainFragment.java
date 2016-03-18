package com.example.deepansh.customlayouts;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.deepansh.customlayouts.Widgets.CustomLayoutSample;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainFragment extends Fragment implements CustomLayoutSample.CustomLayout {
    MainFragmentClicked fragmentListener;

//    public MainFragment() {
//    }

    public MainFragment(MainFragmentClicked fragmentListener) {
    this.fragmentListener = fragmentListener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_main, container, false);

        CustomLayoutSample custom_layout = (CustomLayoutSample) view.findViewById(R.id.custom_layout);
        custom_layout.setCustomLayoutButton(this);

        return view;
    }


    @Override
    public void onButtonClicked() {
        fragmentListener.fragmentClickListener();
    }

    public interface MainFragmentClicked {
        void fragmentClickListener();
    }
}
