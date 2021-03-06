package com.darkspacelab.gra2dzdotykiem;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class GlownaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Ustaw na cały ekran
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Wyłącz pasek tytułowy
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(new GameSurface(this));
    }
}
