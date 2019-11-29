package com.example.pushnotificatindemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.messaging.FirebaseMessaging;

public class DetailsActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseMessaging.getInstance().setAutoInitEnabled(true);
        Button btnNavigate = findViewById(R.id.btnNavigate);

        Person personName = getIntent().getParcelableExtra("PersonData");

        btnNavigate.setText(""+ personName.getName());

    }





}