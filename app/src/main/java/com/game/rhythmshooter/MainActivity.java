package com.game.rhythmshooter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //

        ViewPager viewPager = findViewById(R.id.viewPager2);
        MainScreenAdapter adapter = new MainScreenAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);
    }

    public void onClick(View view) {
        //
    }
}