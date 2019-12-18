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
import android.widget.Toast;

public class VarsityBooks extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varsity_books);

        btn1 = findViewById(R.id.btn_lvl1t1Id);
        btn2 = findViewById(R.id.btn_lvl1t2Id);
        btn3 = findViewById(R.id.btn_lvl1t3Id);
        btn4 = findViewById(R.id.btn_lvl21t1Id);
        btn5 = findViewById(R.id.btn_lvl2t2Id);
        btn6 = findViewById(R.id.btn_lvl2t3Id);
        btn7 = findViewById(R.id.btn_lvl31t1Id);
        btn8 = findViewById(R.id.btn_lvl3t2Id);
        btn9 = findViewById(R.id.btn_lvl3t3Id);
        btn10 = findViewById(R.id.btn_lvl41t1Id);
        btn11 = findViewById(R.id.btn_lvl4t2Id);
        btn12 = findViewById(R.id.btn_lvl4t3Id);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((VarsityBooks.this),(AdminUploads.class));
                intent.putExtra("Key","one");
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((VarsityBooks.this),(AdminUploads.class));
                intent.putExtra("Key","two");
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((VarsityBooks.this),(AdminUploads.class));
                intent.putExtra("Key","three");
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((VarsityBooks.this),(AdminUploads.class));
                intent.putExtra("Key","four");
                startActivity(intent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((VarsityBooks.this),(AdminUploads.class));
                intent.putExtra("Key","five");
                startActivity(intent);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((VarsityBooks.this),(AdminUploads.class));
                intent.putExtra("Key","six");
                startActivity(intent);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((VarsityBooks.this),(AdminUploads.class));
                intent.putExtra("Key","seven");
                startActivity(intent);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((VarsityBooks.this),(AdminUploads.class));
                intent.putExtra("Key","eight");
                startActivity(intent);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((VarsityBooks.this),(AdminUploads.class));
                intent.putExtra("Key","nine");
                startActivity(intent);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((VarsityBooks.this),(AdminUploads.class));
                intent.putExtra("Key","ten");
                startActivity(intent);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((VarsityBooks.this),(AdminUploads.class));
                intent.putExtra("Key","eleven");
                startActivity(intent);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((VarsityBooks.this),(AdminUploads.class));
                intent.putExtra("Key","twelve");
                startActivity(intent);
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
            Intent intent = new Intent((VarsityBooks.this) , (AboutUs.class));
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
