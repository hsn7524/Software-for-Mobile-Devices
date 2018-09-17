package com.example.hahma.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
   public Button b2;
   public Button b1;

    public void func1()
    {
        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent toy1 = new Intent(MainActivity.this,signup_constraint.class);
                startActivity(toy1);
            }
        });

    }

    public void func2()
    {
        b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent toy2=new Intent(MainActivity.this,singup_relative.class);
                startActivity(toy2);
            }
        });
    }



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        func1();
        func2();
    }
}
