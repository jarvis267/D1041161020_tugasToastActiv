package com.example.ricky.d1041161020_tugastoastactiv;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/**
 * Created by ricky on 02/10/2019.
 */

public class count extends AppCompatActivity {
    TextView txtHello;
    private String name;
    private String KEY_NAME = "NAMA";

    Button countup,countdown;
    int counter;
    TextView nilai;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        txtHello = (TextView) findViewById(R.id.halo);

        Bundle extras = getIntent().getExtras();
        name = extras.getString(KEY_NAME);
        txtHello.setText("Hallo " + name);

        context = this;
        counter=20;

        countup = (Button)findViewById(R.id.countup);
        countdown = (Button)findViewById(R.id.countdown);
        nilai = (TextView)findViewById(R.id.number);
        nilai.setText(""+counter);

        countup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                nilai.setText(""+counter);
            }
        });

        countdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter--;
                nilai.setText(""+counter);
            }
        });
    }
}

