package com.example.fragment_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.fragment_test.fragments.fragment1;
import com.example.fragment_test.fragments.fragment2;

public class MainActivity extends AppCompatActivity {

    private fragment1 fragment1;
    private fragment2 fragment2;
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1 = new fragment1();
        fragment2 = new fragment2();

        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.fragmentFrame,fragment1);
        fragmentTransaction.commit();

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        button1.setOnClickListener(v -> {
            FragmentManager fm1 = getSupportFragmentManager();
            FragmentTransaction ft1 = fragmentManager.beginTransaction();
            ft1.replace(R.id.fragmentFrame, fragment1);
            ft1.commit();
        });

        button2.setOnClickListener(v -> {
            FragmentManager fm2 = getSupportFragmentManager();
            FragmentTransaction ft2 = fragmentManager.beginTransaction();
            ft2.replace(R.id.fragmentFrame, fragment2);
            ft2.commit();
        });
    }
}