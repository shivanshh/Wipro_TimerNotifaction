package com.wipronotifaction_timer

import android.os.Bundle
import android.support.v7.preference.PreferenceFragmentCompat
import com.resocoder.timertutorial.R


class SettingsActivityFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.preferences)
    }
}