package com.example.hamburger;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class DummyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dummy);
        Intent intent = getIntent();
        if(intent != null)
        {

        }
        else
        {

        }

    }

}
