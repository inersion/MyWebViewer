package com.inersion.mywebviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView; //Import the WebView class

public class UCSDExtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucsdext);

        WebView ucsdextView = (WebView) findViewById(R.id.webViewUCSDExt);
        ucsdextView.loadUrl("https://extension.ucsd.edu/");
    }
}
