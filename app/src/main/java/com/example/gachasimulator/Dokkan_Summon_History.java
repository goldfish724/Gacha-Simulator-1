package com.example.gachasimulator;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Dokkan_Summon_History extends AppCompatActivity implements View.OnClickListener {
    TextView[] frequency;
    ConstraintLayout mainView;
    MediaPlayer background_audio3;
    TextView back;
    ImageView back_arrow;
    int tracker = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dokkan__summon__history);

        back_arrow = findViewById(R.id.back_arrow_dokkan_history);
        back_arrow.setOnClickListener(this);
        back = findViewById(R.id.back_dokkan_history);
        back.setOnClickListener(this);
        background_audio3 = MediaPlayer.create(Dokkan_Summon_History.this, R.raw.dokkan_summon_theme_audio);
        background_audio3.setLooping(true);
        background_audio3.start();

        //USE LINEAR LAYOUT (HORIZONTAL)
        mainView = findViewById(R.id.display_dokkan_summon_history);
//        frequency = new TextView[Dokkan_Summon.getCardsPulledHash().size()];
//
//        for(Card card : Dokkan_Summon.getCardsPulledHash())
//        {
//
//        }
    }

    @Override
    public void onClick(View view) {
        background_audio3.release();
        Intent i = new Intent(Dokkan_Summon_History.this, Dokkan_Summon.class);
        startActivity(i);
        finish();
    }
}