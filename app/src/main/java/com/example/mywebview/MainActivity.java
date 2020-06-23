package com.example.mywebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView myWebView = new WebView(this);

        setContentView(myWebView);
        myWebView.loadUrl("https://m.facebook.com/pg/Ice-102826024821865/posts/?ref=page_internal/");
    }
}