package com.sandipbhattacharya.planeshooter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startGame(View v) {
        Log.i("ImageButton", "clicked");
        Intent intent = new Intent(this,StartGame.class);
        startActivity(intent);
        finish();
    }
}
