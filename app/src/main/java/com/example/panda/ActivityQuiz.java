package com.example.panda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityQuiz extends AppCompatActivity {

    Button BT1;
    TextView textViewQuiz, TextViewPlease;
    WebView webViewCat;
    CountDownTimer odliczanie;
    ImageView imageViewCat2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        BT1 = (Button) findViewById(R.id.BT1);
        textViewQuiz = (TextView) findViewById(R.id.textViewQuiz);
        TextViewPlease = (TextView)findViewById(R.id.textViewPlease);
        webViewCat = (WebView)findViewById(R.id.webViewCat);
        imageViewCat2 = (ImageView)findViewById(R.id.imageViewCat2);

        //cat gif
        WebSettings webSettings = webViewCat.getSettings();
        webSettings.setJavaScriptEnabled(true);
        String file = "file:android_asset/cat.gif";
        webViewCat.loadUrl(file);


        BT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ostatnia_nadzieja();
            }
        });


    }


    public void ostatnia_nadzieja(){
        BT1.setVisibility(View.INVISIBLE);
        TextViewPlease.setVisibility(View.VISIBLE);
        webViewCat.setVisibility(View.VISIBLE);
        textViewQuiz.setTextSize(20);
        textViewQuiz.setText("Niestety quiz się zepsuł i nie miałem czasu go naprawiać. Ale naprawię.");

        odliczanie = new CountDownTimer(8000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                last_hope();
            }
        };

        odliczanie.start();
    }

    public void last_hope(){

        TextViewPlease.setVisibility(View.VISIBLE);
        webViewCat.setVisibility(View.VISIBLE);
        TextViewPlease.setTextSize(30);
        TextViewPlease.setText("PAN DA 3");
        webViewCat.setVisibility(View.INVISIBLE);
        textViewQuiz.setTextSize(20);
        textViewQuiz.setText("BARDZO PROSZĘ");
        imageViewCat2.setVisibility(View.VISIBLE);

    }


}
