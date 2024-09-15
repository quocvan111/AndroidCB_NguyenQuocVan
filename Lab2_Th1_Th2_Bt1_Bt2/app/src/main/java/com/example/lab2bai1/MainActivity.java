package com.example.lab2bai1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.animation.RotateAnimation;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private LinearLayout layout;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int red= (int) (Math.random() * 255) + 1;
        int blue= (int) (Math.random() * 255) + 1;
        int green= (int) (Math.random() * 255) + 1;
        int color = Color.rgb(red,blue,green);
//        progressBar = findViewById(R.id.Progressbar);
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.m001_act_splash);
        layout = findViewById(R.id.layout);
        layout.setBackgroundColor(color);


    }
}