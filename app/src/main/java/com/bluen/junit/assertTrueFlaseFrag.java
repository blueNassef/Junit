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

public class assertTrueFlaseFrag extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.assert_true_false_frag,container,false);
        Button assertTrueVideo= (Button)v.findViewById(R.id.assertTrueVideo);
        assertTrueVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=jUdcGCg5Z8I&index=4&list=PLLousje9t9nhV3GqNg0xgJTrFb8-qvvc5"));
                startActivity(i);
            }
        });
        return v;
    }
}
