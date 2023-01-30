package com.example.forus.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.forus.R;
import com.example.forus.databinding.ActivitySingUpBinding;

public class SingUpActivity extends AppCompatActivity {

    private ActivitySingUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySingUpBinding.inflate(getLayoutInflater());
        setListeners();
        setContentView(binding.getRoot());
    }

    private void setListeners(){
        binding.textSingIn.setOnClickListener(v -> onBackPressed());
    }
}