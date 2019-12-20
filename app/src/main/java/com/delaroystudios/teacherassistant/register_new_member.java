package com.delaroystudios.teacherassistant;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

/**
 * Created by Sourabh Amancha on 2/3/2017.
 */

public class register_new_member extends Activity implements View.OnClickListener{

    Button bUpdate;
    EditText etName, etAge, etUname, etPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_new_member);

        etName = (EditText) findViewById(R.id.etName);
        etAge = (EditText) findViewById(R.id.etAge);
        etUname = (EditText) findViewById(R.id.etUname);
        etPass = (EditText) findViewById(R.id.etPass);
        bUpdate = (Button) findViewById(R.id.bUpdate);

        bUpdate.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bUpdate :

                boolean work = true;
                try {
                    String name = etName.getText().toString();
                    String age = etAge.getText().toString();
                    String uname = etUname.getText().toString();
                    String pass = etPass.getText().toString();

                    staff_db entry = new staff_db(register_new_member.this);
                    entry.open();
                    entry.creatEntry(name, age, uname, pass);
                    entry.close();
                }
                catch(Exception e){
                    work = false;
                    String error = e.toString();
                    Dialog d = new Dialog(this);
                    d.setTitle("ERROR");
                    TextView tv = new TextView(this);
                    tv.setText(error);
                    d.setContentView(tv);
                    d.show();
                }
                finally {
                    if (work){
                        Dialog d = new Dialog(this);
                        d.setTitle("SUCCESS");
                        TextView tv = new TextView(this);
                        tv.setText("DATABASE UPDATED!");
                        d.setContentView(tv);
                        d.show();
                    }
                }

                break;
        }
    }
}
