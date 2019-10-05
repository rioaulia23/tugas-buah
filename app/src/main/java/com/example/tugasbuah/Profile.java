package com.example.tugasbuah;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tugasbuah.helper.Pref;

public class Profile extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        TextView textView = findViewById(R.id.nama);
        Button btnout = findViewById(R.id.logout);
        String x = Pref.sharedIntance(getApplicationContext()).getNama();
        textView.setText(x);

        btnout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Profile.this, MainActivity.class);
                Pref.sharedIntance(getApplicationContext())
                        .setStatusInput(false);
                startActivity(i);
                finish();
            }
        });
    }


}
