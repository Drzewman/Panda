package com.example.panda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static androidx.core.os.LocaleListCompat.create;

public class MainActivity extends AppCompatActivity {

    private Button buttonEnter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnter = findViewById(R.id.buttonEnter);

        final MediaPlayer clicksound = MediaPlayer.create(this,R.raw.clicksound);       //dźwięk kliknięcia buttonEnter

        buttonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicksound.start();
                openActivity2();
            }
        });

    }
    public void openActivity2(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

}
