package com.example.gachasimulator;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Dokkan_Summon extends AppCompatActivity implements View.OnClickListener, GestureDetector.OnGestureListener, View.OnTouchListener {
    MediaPlayer background_audio2;
    ImageButton mute_button, home_button, multi_summon, single_summon;
    ImageView bannerImage;
    Boolean state = true;
    public static Boolean volume_state = true;
    static ArrayList<Card> cardsPulled;
    static HashSet<Card> cardsPulledHash;
    static ImageView[] unitsSlots;

    int bannerChoice, stonesUsed = 0;

    DokkanBanner[] banners;
    GestureDetector detector;

    TextView stoneCount, resetButton, summonHistoryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dokkan_summon);

        bannerChoice = 0;
        DokkanBanner df_8442 = new DokkanBanner(R.drawable.dokkan_festival_8442, DokkanBanner.findCardsById(new ArrayList<>(Arrays.asList(1020440, 1020270, 1019130, 1018750, 1017880, 1015740, 1015150, 1012880, 1012580, 1008410))),
                DokkanBanner.customizePool(new ArrayList<>(Arrays.asList(1020520, 1020270)), null, DokkanBanner.NORMALPOOL), "DOKKAN FESTIVAL (A) 8442");

        DokkanBanner ls_8456 = new DokkanBanner(R.drawable.legendary_summon_8460, DokkanBanner.findCardsById(new ArrayList<>(Arrays.asList(1020200, 1018670, 1018570, 1015090, 1013180, 1013170, 1010150, 1008140, 1002460, 1001970, 1001940, 1001930))),
                DokkanBanner.customizePool(new ArrayList<>(Arrays.asList(1018670, 1018570, 1015090, 1013180, 1013170, 1008140, 1002460, 1001970, 1001940, 1001930)), null, DokkanBanner.NORMALPOOL, new ArrayList<>(Arrays.asList(1020200, 1010150)), null, DokkanBanner.SUMMONABLELRPOOL), "Top Legendary Summon");

        banners = new DokkanBanner[]{df_8442, ls_8456};

        background_audio2 = MediaPlayer.create(Dokkan_Summon.this, R.raw.dokkan_summon_theme_audio);
        background_audio2.setLooping(true);
        background_audio2.start();

        resetButton = findViewById(R.id.reset);
        resetButton.setOnClickListener(this);

        multi_summon = findViewById(R.id.multi_button);
        multi_summon.setOnClickListener(this);

        single_summon = findViewById(R.id.single_button);
        single_summon.setOnClickListener(this);

        cardsPulledHash = new HashSet<>();
        cardsPulled = new ArrayList<>();

        bannerImage = findViewById(R.id.banner_image);
        bannerImage.setImageResource(banners[bannerChoice].getImage());
        bannerImage.setOnTouchListener(this);

        summonHistoryButton = findViewById(R.id.summon_history_dokkan);
        summonHistoryButton.setOnClickListener(this);

        detector = new GestureDetector(this, this);

        home_button = findViewById(R.id.home_button);
        home_button.setOnClickListener(this);

        stoneCount = findViewById(R.id.stones_used);

        unitsSlots = new ImageView[]{findViewById(R.id.slot1), findViewById(R.id.slot2), findViewById(R.id.slot3), findViewById(R.id.slot4), findViewById(R.id.slot5),
                findViewById(R.id.slot6), findViewById(R.id.slot7), findViewById(R.id.slot8), findViewById(R.id.slot9), findViewById(R.id.slot10),};
        mute_button = findViewById(R.id.volume_control);
        mute_button.setOnClickListener(this);

        if (!volume_state) {
            background_audio2.setVolume(0f, 0f);
            mute_button.setImageResource(R.drawable.ic_mute_icon);
        }
    }

    public void onPause() {
        if (state)
            background_audio2.pause();
        super.onPause();
    }

    public void onResume() {
        state = true;
        super.onResume();
        if (!background_audio2.isPlaying())
            background_audio2.start();
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public void onClick(View view) {
        if (view == mute_button) {
            if (mute_button.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.no_mute).getConstantState())) {
                mute_button.setImageResource(R.drawable.ic_mute_icon);
                background_audio2.setVolume(0, 0);
                volume_state = false;
            } else {
                mute_button.setImageResource(R.drawable.no_mute);
                background_audio2.setVolume(1.0f, 1.0f);
                volume_state = true;
            }
        } else if (view == home_button) {
            background_audio2.release();
            state = false;
            Intent i = new Intent(Dokkan_Summon.this, MainActivity.class);
            startActivity(i);
            finish();
        } else if (view == multi_summon) {
            Card[] results = banners[bannerChoice].multiSummon();
            for (int i = 0; i < 10; i++) {
                unitsSlots[i].setImageResource(results[i].getCardImage());
            }
            cardsPulled.addAll(Arrays.asList(results));
            cardsPulledHash.addAll(Arrays.asList(results));
            stonesUsed += 50;
            stoneCount.setText(Integer.toString(stonesUsed));
        } else if (view == single_summon) {
            Card result = banners[bannerChoice].singleSummon();
            unitsSlots[0].setImageResource(result.getCardImage());
            stonesUsed += 5;
            stoneCount.setText(Integer.toString(stonesUsed));
        } else if (view == resetButton) {
            stonesUsed = 0;
            for (ImageView views : unitsSlots)
                views.setImageResource(android.R.color.transparent);

            stoneCount.setText(Integer.toString(stonesUsed));
        } else if (view == summonHistoryButton) {
            background_audio2.release();
            Intent i = new Intent(Dokkan_Summon.this, Dokkan_Summon_History.class);
            startActivity(i);
            state = false;
            Dokkan_Summon_History.setLists(cardsPulled, cardsPulledHash);
            finish();
        }
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        detector.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onFling(MotionEvent motionDown, MotionEvent motionEnd, float vX, float v1) {
        if (Math.abs(motionDown.getX() - motionEnd.getX()) >= 100 && Math.abs(vX) >= 750) {
            if (motionDown.getX() - motionEnd.getX() < 0) {
                bannerChoice++;
                if (bannerChoice > banners.length - 1)
                    bannerChoice = 0;

                bannerImage.setImageResource(banners[bannerChoice].getImage());
            } else if (motionDown.getX() - motionEnd.getX() > 0) {
                bannerChoice--;
                if (bannerChoice < 0)
                    bannerChoice = banners.length - 1;

                bannerImage.setImageResource(banners[bannerChoice].getImage());
            }
        }
        return true;
    }
}