package com.sumonkmr.passivenews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Locale;

public class NewsActivity extends AppCompatActivity {

    public static String CATEGORY, TITLE, REPORTING, DESCRIPTIONS, TIME, DATE;
    public static Bitmap IMG_BITMAP;
    public static int ColorBg;
    LinearLayout parentLay,info_news;
    FloatingActionButton floating_btn;
    ImageView img_news;
    TextView reporting_news, time_date, title_news, cat_news, des_news;
    TextToSpeech textToSpeech;
    private boolean isSpeaking = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        Hookups();
        Settings();
        floating_btn.setOnClickListener(v -> ReadAndSpeak());
        parentLay.setOnClickListener(v -> pauseSpeech());
        Animation right_to_left = AnimationUtils.loadAnimation(NewsActivity.this,R.anim.right_to_left);
        Animation left_to_right = AnimationUtils.loadAnimation(NewsActivity.this,R.anim.left_to_right);
        Animation fade_in = AnimationUtils.loadAnimation(NewsActivity.this,R.anim.fade_in);
        Animation up_from_bottom = AnimationUtils.loadAnimation(NewsActivity.this,R.anim.up_from_bottom);
        Animation zoom_in = AnimationUtils.loadAnimation(NewsActivity.this,R.anim.zoom_in);
        Animation middle_to_top = AnimationUtils.loadAnimation(NewsActivity.this,R.anim.middle_to_top);

        title_news.setAnimation(left_to_right);
        cat_news.setAnimation(right_to_left);
        des_news.setAnimation(middle_to_top);
        info_news.setAnimation(fade_in);
        img_news.setAnimation(fade_in);
        floating_btn.setAnimation(right_to_left);
    }

    private void Hookups() {
        img_news = findViewById(R.id.img_news);
        reporting_news = findViewById(R.id.reporting_news);
        time_date = findViewById(R.id.time_date);
        title_news = findViewById(R.id.title_news);
        cat_news = findViewById(R.id.cat_news);
        des_news = findViewById(R.id.des_news);
        floating_btn = findViewById(R.id.floating_btn);
        parentLay = findViewById(R.id.parentLay);
        info_news = findViewById(R.id.info_news);
    }

    private void Settings() {
        if (IMG_BITMAP != null) img_news.setImageBitmap(IMG_BITMAP);
        cat_news.setText(CATEGORY);
        reporting_news.setText(REPORTING);
        title_news.setText(TITLE);
        des_news.setText(DESCRIPTIONS);
        time_date.setText(String.format("%s ~ %s", DATE, TIME));


        int whiteColor = ContextCompat.getColor(NewsActivity.this, R.color.white);
        cat_news.setBackgroundColor(ColorBg);
        floating_btn.setImageTintList(ColorStateList.valueOf(whiteColor));
    }

    private void ReadAndSpeak() {
        String speakingTxt = des_news.getText().toString();
        textToSpeech = new TextToSpeech(this, status -> {
            if (status == TextToSpeech.SUCCESS) {
                if (!isSpeaking) {
                    speakText(speakingTxt);
                }
            }
        });


    }

    private void speakText(String text) {
        if (textToSpeech != null && !isSpeaking) {
            isSpeaking = true;
            textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null, null);
            floating_btn.setImageDrawable(getDrawable(R.drawable.stop));
            Log.d("speakText", "speakText: " + isSpeaking);
        }
    }

    private void pauseSpeech() {
        if (textToSpeech != null && isSpeaking) {
            isSpeaking = false;
            textToSpeech.stop();
            floating_btn.setImageDrawable(getDrawable(R.drawable.microphone));
            Log.d("pauseSpeech", "pauseSpeech: " + isSpeaking);
        }
    }

}