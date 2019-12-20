package com.delaroystudios.teacherassistant;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;

/**
 * Created by Sourabh Amancha on 12/27/2016.
 */

public class admin extends Activity implements OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin);

        EditText et = (EditText)findViewById(R.id.eadminPass);
        Button buttonEnter = (Button)findViewById(R.id.bAPass);
        buttonEnter.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.bAPass)
        {
            EditText et = (EditText)findViewById(R.id.eadminPass);
            String password = et.getText().toString();
            et.getEditableText().toString();

            if (password.equals("batch3"))
            {
                Intent irn = new Intent(admin.this, admin2.class);
                startActivity(irn);
            }else{

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("WRONG PASSWORD");
                builder.setMessage("TRY AGAIN");
                builder.setPositiveButton("OK", null);
                AlertDialog dialog = builder.show();
            }
        }

    }
}
