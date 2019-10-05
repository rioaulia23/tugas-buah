package com.example.tugasbuah;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.tugasbuah.helper.Pref;

public class Afterclick extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afterclick);
        TextView textView = findViewById(R.id.tvnama);

        String x = Pref.sharedIntance(getApplicationContext()).getNama();
        textView.setText(x);


    }
}
