package com.example.gachasimulator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    MediaPlayer background_audio;
    ImageView right_arrow,left_arrow,app_logo;
    ConstraintLayout main;
    int[] audio_id;
    int[] app_icon_id;
    int[] background_icon_id;
    int selection;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selection = 0;

        audio_id = new int[]{R.raw.dokkan_theme_audio,R.raw.legends_theme_audio,R.raw.naruto_blazing_theme_audio,R.raw.seven_deadly_sins_theme_audio};
        app_icon_id = new int[]{R.drawable.dokkan_home,R.drawable.legends_home,R.drawable.naruto_home,R.drawable.sds_home_};
        background_icon_id = new int[]{R.drawable.dokkan_app_icon,R.drawable.legends_app_icon,R.drawable.naruto_app_icon,R.drawable.seven_deadly_sins_app_icon};

        right_arrow = (ImageView) findViewById(R.id.rightArrow);
        left_arrow = (ImageView) findViewById(R.id.leftArrow);
        main = (ConstraintLayout)findViewById(R.id.background);
        app_logo = (ImageView)findViewById((R.id.app));

        background_audio= MediaPlayer.create(MainActivity.this,audio_id[selection]);
        background_audio.setLooping(true);
        background_audio.start();
    }

    public void selectRight(View v) {
            if(selection == 3)
                selection = 0;
            else
                selection++;
            setMedia();
            app_logo.setImageResource(selection);
//            main.setBackground(getDrawable(selection));
    }
    public void selectLeft(View v) {
        if(selection == 0)
            selection = 3;
        else
            selection--;
        setMedia();
        app_logo.setImageResource(selection);
//        main.setBackground(getDrawable(selection));
    }
    public void setMedia() {
        background_audio.reset();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                background_audio.reset();
                background_audio= MediaPlayer.create(MainActivity.this,audio_id[selection]);
                background_audio.setLooping(true);
                background_audio.start();
            }
        },2000);

    }


}