package com.concur.meetup.javavskotlin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class SimpleActivityJava extends AppCompatActivity {

    private static final String TAG = "SimpleActivityJava";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        Toolbar toolbar = findViewById(R.id.request_toolbar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.i(TAG, "Navigation clicked.");
            }
        });
    }
}
