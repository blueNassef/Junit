package com.bluen.junit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by root on 3/31/17.
 */

public class improvingFirstFrag extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.improving_first_frag,container,false);
        Button improvingVideo= (Button)v.findViewById(R.id.improvingVideo);
        improvingVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=d8vHnrsfCW0&list=PLLousje9t9nhV3GqNg0xgJTrFb8-qvvc5&index=3"));
                startActivity(i);
            }
        });
        return v;
    }
}
