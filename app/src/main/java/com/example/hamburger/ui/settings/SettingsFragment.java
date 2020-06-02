package com.example.hamburger.ui.settings;

import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.preference.PreferenceFragmentCompat;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragment;

import com.example.hamburger.R;
import com.google.android.material.snackbar.Snackbar;

public class SettingsFragment extends PreferenceFragmentCompat
//        implements AdapterView.OnItemClickListener
{
    private View currentView;
    private SettingsViewModel slideshowViewModel;
//    @Override
//    public void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        addPreferencesFromResource(R.xml.preferences);
//    }
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        // Indicate here the XML resource you created above that holds the preferences
//        setPreferencesFromResource(R.xml.preferences, rootKey);
        addPreferencesFromResource(R.xml.preferences);

    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                new ViewModelProvider(this).get(SettingsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_settings, container, false);
        this.currentView = root;
        return root;
    }

//    @Override
//    public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
//        Snackbar.make(this.currentView,"點擊項目："+position, Snackbar.LENGTH_SHORT).show();
//    }
}
