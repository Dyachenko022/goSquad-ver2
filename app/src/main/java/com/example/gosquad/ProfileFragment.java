package com.example.gosquad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfileFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.profile_fragment, container, false);

        BottomNavigationView bottomNavigationView = view.findViewById(R.id.profile_navigation);

        //NavController navController = Navigation.findNavController(getActivity(), R.id.profile_nav_host_fragment);
        //NavigationUI.setupWithNavController(bottomNavigationView, navController);
        return view;
    }
}
