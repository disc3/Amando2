package de.visionera.androidbuch.amando5.gui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import de.visionera.androidbuch.amando5.R;

public class Startseite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startseite);
        setTitle(R.string.startseite_titel);
        registerForContextMenu(findViewById(R.id.sf_starte_geokontakte));
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.hauptmenue, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.opt_einstellungenBearbeiten:
                startActivity(new Intent(this, EinstellungenBearbeiten.class));
                return true;
            case R.id.opt_hilfe:
                startActivity(new Intent(this, HilfeAnzeigen.class));
                return true;
            case R.id.opt_amandoBeenden:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        if (v.getId() == R.id.sf_starte_geokontakte){
            getMenuInflater().inflate(R.menu.startseite_contextmenue, menu);
        }

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    public boolean onContextItemSelected(MenuItem item){
        if (item.getItemId() == R.id.sf_starte_geokontakte){
            // TODO
            return true;
        }

        return super.onContextItemSelected(item);
    }

    public void onClickPositionSenden(final View sfNormal){
        // TODO
    }

    public void onClickGeokontakteVerwalten(final View sfNormal){
        startActivity(new Intent(this, GeoKontakteAuflisten.class));
    }

    public void onClickKarteAnzeigen(final View sfNormal){
        // TODO
    }

    public void onClickSimulationStarten(final View sfNormal){
        // TODO
    }
}
