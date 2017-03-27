package com.bluen.junit;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private AlphaAnimation anim;
    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anim= new AlphaAnimation(5f, 0f);
        anim.setDuration(5000);
        logo= (ImageView) findViewById(R.id.logo);
        logo.startAnimation(anim);

    }
}
