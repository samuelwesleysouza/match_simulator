package com.example.simulator;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.simulator.databinding.ActivityMainBinding;

public class MainActivity  extends AppCompatActivity {

    private ActivityMainBinding biding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

         biding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(biding.getRoot());

    }
}
