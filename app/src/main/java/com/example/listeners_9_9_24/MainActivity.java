package com.example.listeners_9_9_24;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import java.util.Random;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {


    Button btn1 , btn2 , btn3;
    LinearLayout wall;

    int a , b;
    private Intent si ;

    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wall = findViewById(R.id.wall);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        a = 0;
        b = 0;


        btn1.setOnClickListener(this);
        btn3.setOnLongClickListener(this);


    }



    @Override
    public void onClick(View view)
    {
        change_back();
        b = b + 1;
    }

    @Override
    public boolean onLongClick(View v) {
        change_back();
        a = a + 2;
        return false;
    }
public void change_back()
{
    int rand_int = rand.nextInt(3);
    if(rand_int == 1)
    {
        wall.setBackgroundColor(Color.rgb(76, 175, 80));

    }
    else if(rand_int == 2)
    {
        wall.setBackgroundColor(Color.rgb(156, 39, 176));

    }
    else
    {
        wall.setBackgroundColor(Color.rgb(255, 152, 0));
    }

}


    public void next_page(View view) {
        Intent si = new Intent(this,MainActivity2.class);

        si.putExtra("a",a);
        si.putExtra("b",b);

        startActivity(si);

        a = 0;
        b = 0;
        wall.setBackgroundColor(Color.rgb(255, 255, 255));

    }
}