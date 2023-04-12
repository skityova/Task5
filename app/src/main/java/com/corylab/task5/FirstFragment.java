package com.corylab.task5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import com.corylab.task5.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstance) {
        Button btn1 = binding.btn1;
        Button btn2 = binding.btn2;

        btn1.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_firstFragment_to_secondFragment);
        });

        btn2.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_firstFragment_to_thirdFragment);
        });
    }
}