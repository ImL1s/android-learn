package com.johnsontechinc.rocketman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_open).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startService(new Intent(getApplicationContext(), RocketService.class));
            }
        });
    }


}
