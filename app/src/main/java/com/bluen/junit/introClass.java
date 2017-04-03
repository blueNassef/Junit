package com.bluen.junit;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by root on 3/27/17.
 */

public class introClass extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.intro_frag,container,false);
        TextView body= (TextView)v.findViewById(R.id.body);
        body.setMovementMethod(new ScrollingMovementMethod());
        Button introVideo= (Button)v.findViewById(R.id.introVideo);
        introVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=yMNewluH4go&list=PLLousje9t9nhV3GqNg0xgJTrFb8-qvvc5"));
                startActivity(i);
            }
        });
        return v;
    }
}
