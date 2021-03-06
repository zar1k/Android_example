package com.andreyzarazka.babygame.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.andreyzarazka.babygame.R;
import com.andreyzarazka.babygame.activity.ColorActivity;

public class ColorsBtnFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_colors_btn, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        final ImageButton button = (ImageButton) getActivity().findViewById(R.id.id_colors_img_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ColorActivity.class);
                startActivity(intent);
            }
        });
    }
}
