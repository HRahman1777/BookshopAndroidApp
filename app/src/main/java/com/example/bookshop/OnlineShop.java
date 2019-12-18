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

public class OnlineShop extends AppCompatActivity {

    private Button rokomari, boibazar, eboighar, bookshopbd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_shop);

        rokomari = findViewById(R.id.rokomariId);
        boibazar = findViewById(R.id.boibazarId);
        eboighar = findViewById(R.id.eboigharId);
        bookshopbd = findViewById(R.id.bookshopbdId);

        rokomari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((OnlineShop.this),(Webview.class));
                intent.putExtra("webKey","rokomari");
                startActivity(intent);
            }
        });
        boibazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((OnlineShop.this),(Webview.class));
                intent.putExtra("webKey","boibazar");
                startActivity(intent);
            }
        });
        eboighar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((OnlineShop.this),(Webview.class));
                intent.putExtra("webKey","eboighar");
                startActivity(intent);
            }
        });
        bookshopbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((OnlineShop.this),(Webview.class));
                intent.putExtra("webKey","bookshopbd");
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
            Intent intent = new Intent((OnlineShop.this) , (AboutUs.class));
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
