package de.visionera.androidbuch.amando5.gui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;

import java.io.IOException;
import java.io.InputStream;

import de.visionera.androidbuch.amando5.R;
/**
 * Created by Diego on 16.11.2017.
 */

public class HilfeAnzeigen extends Activity{

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hilfe_anzeigen);

        final WebView view = (WebView) findViewById(R.id.webview);
        view.getSettings().setJavaScriptEnabled(true);
        initialisereWebKit(view, this);
        view.bringToFront();
    }

    private void initialisereWebKit(WebView view, Context context){
        final String mimetype = "text/html";
        final String encoding = "UTF-8";
        String htmldata;

        int contextMenueId = R.raw.hilfe_komplett;
        InputStream is = context.getResources().openRawResource(contextMenueId);

        try {
            if (is != null && is.available() > 0){
                final byte[] bytes = new byte[is.available()];
                is.read(bytes);
                htmldata = new String(bytes);
                view.loadDataWithBaseURL(null, htmldata, mimetype, encoding, null);
            }
        } catch (IOException e){}

    }
}
