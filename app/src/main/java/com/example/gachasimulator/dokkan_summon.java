package com.example.gachasimulator;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class dokkan_summon extends AppCompatActivity implements View.OnClickListener{
    MediaPlayer background_audio2;
    ImageButton mute_button,home_button;
    static ImageView[] unitsSlots;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dokkan_summon);

        background_audio2= MediaPlayer.create(dokkan_summon.this,R.raw.dokkan_theme_audio);
        background_audio2.setLooping(true);
        background_audio2.start();

        home_button = findViewById(R.id.home_button);
        home_button.setOnClickListener(this);

        unitsSlots = new ImageView[]{findViewById(R.id.slot1), findViewById(R.id.slot2),findViewById(R.id.slot3),findViewById(R.id.slot4),findViewById(R.id.slot5),
                                    findViewById(R.id.slot6),findViewById(R.id.slot7),findViewById(R.id.slot8),findViewById(R.id.slot9),findViewById(R.id.slot10),};

        mute_button = findViewById(R.id.volume_control);
        mute_button.setOnClickListener(this);
    }
    public void onPause() {
        super.onPause();
        background_audio2.pause();
    }

    public void onResume() {
        super.onResume();
        if(!background_audio2.isPlaying())
            background_audio2.start();
        else
            return;
    }
    @Override
    public void onClick(View view) {
        if(view == mute_button)
        {
            if(mute_button.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.no_mute).getConstantState()))
            {
                mute_button.setImageResource(R.drawable.ic_mute_icon);
                background_audio2.setVolume(0,0);
            }
            else
            {
                mute_button.setImageResource(R.drawable.no_mute);
                background_audio2.setVolume(1.0f,1.0f);
            }
        }
        else if(view == home_button)
        {
            Intent i = new Intent(dokkan_summon.this,MainActivity.class );
            background_audio2.release();
            startActivity(i);
            finish();
        }
    }
    public static ImageView[] getUnitSlots() {
        return unitsSlots;
    }
}