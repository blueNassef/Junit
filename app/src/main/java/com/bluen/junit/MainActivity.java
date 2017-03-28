package com.bluen.junit;

import android.content.pm.ActivityInfo;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView logo= (ImageView) findViewById(R.id.logo);
        final AlphaAnimation anim= new AlphaAnimation(5f, 0f);
        anim.setDuration(5000);
        logo.startAnimation(anim);

        final String [] Tuts= getResources().getStringArray(R.array.tuts);
        final ArrayAdapter<String> adap=
                new ArrayAdapter<>(this, R.layout.custom_listview,Tuts);
        lv= (ListView) findViewById(R.id.listView);
        lv.setAdapter(adap);

        anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}
            @Override
            public void onAnimationEnd(Animation animation) {
                lv.setVisibility(View.VISIBLE);}
            @Override
            public void onAnimationRepeat(Animation animation) {}
        });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String itemValue= (String) lv.getItemAtPosition(position);
                SoundPool sp= new SoundPool(5, AudioManager.STREAM_MUSIC,0);
                int soundId= sp.load(getBaseContext(),R.raw.bsound,1);

                android.app.FragmentManager fm= getFragmentManager();
                android.app.FragmentTransaction ft= fm.beginTransaction();

                switch (position){
                    case 0:
                        sp.play(soundId,1,1,0,0,1);
                        Toast.makeText(getApplicationContext(),itemValue,
                                Toast.LENGTH_SHORT).show();
                        sp.play(soundId,1, 1, 0, 0, 1);
                        ft.add(R.id.fragContainer,new introClass());
                        ft.addToBackStack("");
                        ft.commit();
                        break;
                    case 1:

                        break;
                }
            }
        });

    }
}
