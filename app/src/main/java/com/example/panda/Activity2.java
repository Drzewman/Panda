package com.example.panda;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    private Button button111, button222, button333;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        button111 = findViewById(R.id.button111);   //przycisk "O STUDENCIE"
        button222 = findViewById(R.id.button222);   //przycisk "QUIZ"
        button333 = findViewById(R.id.button333);   //przycisk "FILMIK NA YT"

        final MediaPlayer clicksound = MediaPlayer.create(this,R.raw.clicksound);       //dźwięk kliknięcia buttonEnter


        button111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicksound.start();
                openActivityAboutMe();
            }
        });

        button222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicksound.start();
                openActivityQuiz();
            }
        });

        button333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vyt) {
                clicksound.start();
                openActivityYT();

            }
        });

    }

    //O studencie
    public void openActivityAboutMe(){
        Intent intent = new Intent(this, ActivityAboutMe.class);
        startActivity(intent);
    }


    //Quiz
    public void openActivityQuiz(){
        Intent intent = new Intent(this, ActivityQuiz.class);
        startActivity(intent);
    }


    //Filmik na yt
    public void openActivityYT(){
        Intent intent = new Intent(this, ActivityYT.class);
        startActivity(intent);
    }

}
