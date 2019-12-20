package com.delaroystudios.teacherassistant;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Sourabh Amancha on 2/5/2017.
 */

public class viewstaff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewstaff);
        TextView tv = (TextView) findViewById(R.id.textView13);
        staff_db info = new staff_db(this);
        info.open();
        String data = info.getData();
        info.close();
        tv.setText(data);
    }
}
