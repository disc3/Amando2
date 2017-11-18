package de.visionera.androidbuch.amando5.gui;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


import java.util.Arrays;

import de.visionera.androidbuch.amando5.R;

/**
 * Created by Diego on 16.11.2017.
 */


public class GeoKontakteAuflisten extends ListActivity {

    private String[] NAMEN = new String[5];

    private ArrayAdapter<String> mKontaktAdapter;


    private void initialisiereNamen() {
        NAMEN[0] = "Berthold Schmitz";
        NAMEN[1] = "Chantal Schulze";
        NAMEN[2] = "Bartolomäus Weissenbaum";
        NAMEN[3] = "Jean-Paul Küppers";
        NAMEN[4] = "Anneliese Müller";

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.geokontakte_auflisten);
        zeigeGeokontakte();
        ((Spinner) this.findViewById(R.id.sp_sortierung)).setOnItemSelectedListener(mSpinnerItemAuswahlListener);
    }

    private void zeigeGeokontakte() {
        initialisiereNamen();
        mKontaktAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, NAMEN);
        setListAdapter(mKontaktAdapter);
    }

    private AdapterView.OnItemSelectedListener
            mSpinnerItemAuswahlListener =
            new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> arg0,
                                           View arg1, int position, long id) {

                    switch (position) {
                        case 0:
                            zeigeGeokontakte();
                            break;
                        case 1:
                            Arrays.sort(NAMEN);
                            zeigeGeokontakte();
                            break;
                        default:
                            break;
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> arg0) {

                }
            };


    protected void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l,v,position,id);

        final Toast hinweis = Toast.makeText(this, "Element" + ((TextView) v).getText(), Toast.LENGTH_LONG);
    }


}
