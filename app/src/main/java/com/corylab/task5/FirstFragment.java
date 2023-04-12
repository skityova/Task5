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
            Bundle arguments = new Bundle();
            String data = binding.editText1.getText().toString();
            arguments.putString("Data", data);
            Navigation.findNavController(v).navigate(R.id.action_firstFragment_to_secondFragment,
                    arguments);
        });

        btn2.setOnClickListener(v -> {
            Bundle arguments = new Bundle();
            String data = binding.editText2.getText().toString();
            arguments.putString("Data", data);
            Navigation.findNavController(v).navigate(R.id.action_firstFragment_to_thirdFragment,
                    arguments);
        });
    }
}