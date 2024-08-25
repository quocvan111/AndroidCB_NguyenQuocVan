package com.example.lab1_bvn2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnRandom;
    ImageView imgNumber;

    private void innitControl(){
        btnRandom = findViewById(R.id.btnRamdom);
        imgNumber = findViewById(R.id.imgRandom);

        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = (int) (Math.random() * 6) + 1;
                if(x == 1) {imgNumber.setImageResource(R.drawable.dice1);};
                if(x == 2) {imgNumber.setImageResource(R.drawable.dice2);}
                if(x == 3) {imgNumber.setImageResource(R.drawable.dice3);}
                if(x == 4) {imgNumber.setImageResource(R.drawable.dice4);}
                if(x == 5) {imgNumber.setImageResource(R.drawable.dice5);}
                if(x == 6) {imgNumber.setImageResource(R.drawable.dice6);}
            }
        });

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        innitControl();
    }
}