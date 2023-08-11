package ru.vdv.myworkingtimetracker.ui.settings

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import ru.vdv.myworkingtimetracker.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}