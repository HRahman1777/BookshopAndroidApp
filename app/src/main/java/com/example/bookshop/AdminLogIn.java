package com.example.bookshop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdminLogIn extends AppCompatActivity {

    EditText nameEdittxt, passwdEdittxt;
    Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_log_in);

        nameEdittxt = findViewById(R.id.adminLoginEditTxtId);
        passwdEdittxt = findViewById(R.id.adminLoginPasswdId);

        loginBtn = findViewById(R.id.adminLoginBtnId);



        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nm = nameEdittxt.getText().toString();
                String ps = passwdEdittxt.getText().toString();
                String nmCmp = "admin";
                String psCmp = "adminJS";
                if (nameEdittxt != null && passwdEdittxt != null){
                    if (nm.equals(nmCmp) && ps.equals(psCmp)){

                        Intent intent = new Intent((AdminLogIn.this) , (AdminPanel.class));
                        startActivity(intent);
                        finish();
                    }
                    else
                        Toast.makeText(getApplicationContext(),"Please Enter Valid Name And Password!",Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(getApplicationContext(),"Please Enter Valid Name And Password!",Toast.LENGTH_SHORT).show();
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_items,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==R.id.shareId){
            Toast.makeText(getApplicationContext(),"Developing...",Toast.LENGTH_SHORT).show();
        }

        if(item.getItemId()==R.id.feedbackId){
            Toast.makeText(getApplicationContext(),"Developing...",Toast.LENGTH_SHORT).show();
        }

        if(item.getItemId()==R.id.aboutUsId){
            Intent intent = new Intent((AdminLogIn.this) , (AboutUs.class));
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
