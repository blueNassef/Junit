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

public class beforeClassAfterClassFrag extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.before_class_after_class_frag,container,false);
        Button beforeClassAfterClassVideo= (Button)v.findViewById(R.id.beforeClassAfterClassVideo);
        beforeClassAfterClassVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/GtUTYEF5XVE"));
                startActivity(i);
            }
        });
        return v;
    }
}
