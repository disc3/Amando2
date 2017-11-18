package de.visionera.androidbuch.amando5.gui;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.test.suitebuilder.annotation.Suppress;

import de.visionera.androidbuch.amando5.R;
/**
 * Created by Diego on 17.11.2017.
 */

public class EinstellungenBearbeiten extends PreferenceActivity {


    public void onCreate(Bundle icicle){
        super.onCreate(icicle);

        this.addPreferencesFromResource(R.xml.amando_einstellungen);
    }
}
