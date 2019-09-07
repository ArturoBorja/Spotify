package com.example.spotify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    ImageView img_song;
    ImageView img_play;
    ImageView img_back;
    ImageView img_forward;
    ImageView img_like;
    ImageView img_turn;
    ImageView img_bground;
    ConstraintLayout lyt_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img_song = findViewById(R.id.img_song);
        img_back = findViewById(R.id.img_back);
        img_forward = findViewById(R.id.img_forward);
        img_bground = findViewById(R.id.img_bgound);
        img_like = findViewById(R.id.img_like);
        img_turn = findViewById(R.id.img_turn);
        img_play = findViewById(R.id.img_play);
        lyt_main=findViewById(R.id.lyt_main);

        Drawable originalDrawable = img_song.getDrawable();
        Bitmap originalBitmap = ((BitmapDrawable) originalDrawable).getBitmap();
        RoundedBitmapDrawable roundedDrawable = RoundedBitmapDrawableFactory.create(getResources(), originalBitmap);
        roundedDrawable.setCornerRadius(originalBitmap.getHeight());
        img_song.setImageDrawable(roundedDrawable);

        img_bground.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                //lyt_main.setBackgroundResource(R.color.playwhite);


                CountDownTimer countDownTimer = new CountDownTimer(600, 30) {
                    int a01 = 1;
                    public void onTick(long millisUntilFinished) {
                         if(a01 %2==0){
                            img_bground.setBackgroundResource(R.color.bgrounddarck);
                        }else{
                            img_bground.setBackgroundResource(R.color.playwhite);
                        }
                        a01++;
                    }

                    public void onFinish() {
                        img_bground.setBackgroundResource(R.color.itemnaorange);
                    }
                }.start();

            }
        });
        img_bground.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                lyt_main.setBackgroundResource(R.color.itemnaorange);
                return true;
            }
        });

    }
}
