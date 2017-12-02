package com.example.mmaroun.mytravel;

/**
 * Created by mmaroun on 01/12/2017.
 */

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {
    ImageView imgLogo, imgLogo2,imgLogo3,imgLogo4,imgLogo5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        //TextView tvNameApp = (TextView)findViewById(R.id.tvLogo);
        //TextView tvSloganApp = (TextView) findViewById(R.id.tvName);


        // sets a Pretty Custom Font

        TextView myTitle = (TextView)findViewById(R.id.tvLogo);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/Mistletoe.otf");
        //myTitle.setTypeface(myFont);




        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.pulse_animation);
        myTitle.startAnimation(myanim2);
        openApp2();

    }

    public void openApp2() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
    /*
    public void openApp3() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        }, 4000);
    }
    */
}
