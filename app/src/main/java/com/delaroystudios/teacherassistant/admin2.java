package com.delaroystudios.teacherassistant;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Sourabh Amancha on 2/3/2017.
 */

public class admin2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin2);
    }

    public void onadmin2 (View v)
    {
        if(v.getId() == R.id.vsButton)
        {
            Intent ivs = new Intent(admin2.this, viewstaff.class);
            startActivity(ivs);
        }
        if(v.getId() == R.id.rnButton)
        {
            Intent irn = new Intent(admin2.this, register_new_member.class);
            startActivity(irn);
        }

    }



}
