package com.example.bookshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Webview extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        webView = findViewById(R.id.webViewId);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            String value = bundle.getString("webKey");
            String rokomariCmp = "rokomari";
            String boibazarCmp = "boibazar";
            String eboigharCmp = "eboighar";
            String bookshopCmp = "bookshopbd";
            if (value.equals(rokomariCmp)){
                WebSettings webSettings = webView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("http://www.rokomari.com/");
            }
            else if (value.equals(boibazarCmp)){
                WebSettings webSettings = webView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://www.boibazar.com/");
            }
            else if (value.equals(eboigharCmp)){
                WebSettings webSettings = webView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://eboighar.com/");
            }
            else if (value.equals(bookshopCmp)){
                WebSettings webSettings = webView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://www.bookshopbd.com/");
            }
        }
    }
    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }
        else
            super.onBackPressed();
    }
}
