package com.example.listeners_9_9_24;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    Intent gi;
    LinearLayout wall;

    TextView tv1 , tv2 , tv3;
    int a , b ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent gi = getIntent();
        int a = gi.getIntExtra("a",-1);
        int b = gi.getIntExtra("b",-1);

        wall = findViewById(R.id.wall);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);

        tv1.setText("Blue: " + b);
        tv3.setText("Red: " + a);

        if(b > a)
        {
            wall.setBackgroundColor(Color.rgb(3, 169, 244));
            tv2.setText("Red Win!");
        }
        else if (b < a)
        {
            wall.setBackgroundColor(Color.rgb(244, 67, 54));
            tv2.setText("Blue Win!");

        }
        else
        {
            wall.setBackgroundColor(Color.rgb(255, 235, 59));
            tv2.setText("Draw!");

        }
    }


    public void back(View view) {
        finish();
    }
}