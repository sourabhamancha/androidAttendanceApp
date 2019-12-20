package com.delaroystudios.teacherassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v)
    {
        if(v.getId() == R.id.bAdmin)
        {
            Intent iA = new Intent(MainActivity.this, admin.class);
            startActivity(iA);
        }
        if(v.getId() == R.id.bStaff)
        {
            Intent iS = new Intent(MainActivity.this, staff.class);
            startActivity(iS);
        }

    }
}
