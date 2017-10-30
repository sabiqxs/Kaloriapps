package com.apps.awey.kaloriapps;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity_home_pages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_pages);
    }

    public void nextPage(View view){
        Intent foodIntent = new Intent(activity_home_pages.this, activity_food_pages.class);
        startActivity(foodIntent);
        finish();
    }
}
