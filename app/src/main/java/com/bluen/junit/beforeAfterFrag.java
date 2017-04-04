package com.bluen.junit;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by root on 4/1/17.
 */

public class beforeAfterFrag extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.before_after_frag,container,false);
        Button beforeAfterVideo= (Button)v.findViewById(R.id.beforeAfterVideo);
        beforeAfterVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=i0O_eTl8hmY&feature=youtu.be"));
                startActivity(i);
            }
        });
        return v;
    }
}
