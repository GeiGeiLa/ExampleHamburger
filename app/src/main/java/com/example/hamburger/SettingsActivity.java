package com.example.hamburger;

import android.app.AppComponentFactory;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle saveInstaneState)
    {
        super.onCreate(saveInstaneState);
    }
    FragmentManager manager = getFragmentManager();
    FragmentTransaction transaction = manager.beginTransaction();
    SettingsFragmentForActivity myPreference = new SettingsFragmentForActivity(); //宣告剛剛做好的PreferenceFragment
    // FIXME!!!
//        transaction.commit(); //送出交易
}

