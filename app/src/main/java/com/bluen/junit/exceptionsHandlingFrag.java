package com.bluen.junit;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by root on 4/1/17.
 */

public class exceptionsHandlingFrag extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.exceptions_handling_frag,container,false);
        return v;
    }
}
