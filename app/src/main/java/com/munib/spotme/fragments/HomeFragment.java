package com.munib.spotme.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.munib.spotme.LendMoneyActivity;
import com.munib.spotme.MessagesActivity;
import com.munib.spotme.R;
import com.munib.spotme.RequestMoneyActivity;

public class HomeFragment extends Fragment {

    CardView request_card,lend_card;
    FrameLayout btn_messages;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        btn_messages=root.findViewById(R.id.btn_messages);
        btn_messages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), MessagesActivity.class));
            }
        });
        request_card=(CardView) root.findViewById(R.id.request_card);
        request_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), RequestMoneyActivity.class));
            }
        });

        lend_card=(CardView) root.findViewById(R.id.lend_card);
        lend_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), LendMoneyActivity.class));
            }
        });
        return root;
    }
}