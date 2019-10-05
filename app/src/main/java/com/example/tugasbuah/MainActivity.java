package com.example.tugasbuah;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tugasbuah.helper.Pref;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText = findViewById(R.id.etName);
        Button btnmasuk = findViewById(R.id.btnmasuk);

        final Bundle b = new Bundle();
        boolean statusInput = Pref.sharedIntance(getApplicationContext())
                .cekStatus();
        if (statusInput) {
            startActivity(new Intent(MainActivity.this, Main2.class));
            finish();
        }

        btnmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Please insert your name", Toast.LENGTH_SHORT).show();
                } else {

//                b.putString("nama", editText.getText().toString());
                    Intent i = new Intent(MainActivity.this, Main2.class);
//                i.putExtras(b);
                    Pref.sharedIntance(getApplicationContext()).setNama(
                            editText.getText().toString());
                    Pref.sharedIntance(getApplicationContext())
                            .setStatusInput(true);
                    startActivity(i);
                    finish();
                }
            }
        });

    }
}