package com.statix.touchhandler;

import android.app.Fragment;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.MenuItem;

import androidx.preference.Preference;

import com.android.settingslib.collapsingtoolbar.CollapsingToolbarBaseActivity
import com.android.settingslib.collapsingtoolbar.R

public class TouchscreenGestureActivity extends CollapsingToolbarBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            TouchscreenGestureSettings settings = new TouchscreenGestureSettings();
            getFragmentManager().beginTransaction()
                .replace(android.R.id.content, settings)
                .commit();
        }
    }
}
