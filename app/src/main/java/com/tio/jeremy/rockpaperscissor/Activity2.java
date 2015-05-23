package com.tio.jeremy.rockpaperscissor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by lasha on 2015-05-23.
 */
public class activity2 extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
    }

    public void moveBack(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}
