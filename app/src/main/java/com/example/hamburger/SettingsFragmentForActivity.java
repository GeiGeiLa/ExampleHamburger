package com.example.hamburger;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceFragment;

public class SettingsFragmentForActivity extends PreferenceFragment
{

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String string) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
