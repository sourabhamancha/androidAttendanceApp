package com.delaroystudios.teacherassistant;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Sourabh Amancha on 12/27/2016.
 */

public class staff extends Activity {

    staff_db helper = new staff_db(this);

    EditText eSUname, eSPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.staff);
    }

    public void onLoginClick(View v) {
        if(v.getId() == R.id.bSLogin)
        {
            EditText a = (EditText)findViewById(R.id.eSUname);
            String str = a.getText().toString();
            EditText b = (EditText)findViewById(R.id.eSPass);
            String pass = b.getText().toString();




                Intent iA = new Intent(staff.this, AppBase.class);
                startActivity(iA);


        }
    }
}
