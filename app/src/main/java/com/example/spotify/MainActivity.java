package com.example.spotify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img_song;
    ImageView img_play;
    ImageView img_back;
    ImageView img_forward;
    ImageView img_like;
    ImageView img_turn;
    ImageView img_bground;

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

        Drawable originalDrawable = img_song.getDrawable();
        Bitmap originalBitmap = ((BitmapDrawable) originalDrawable).getBitmap();
        RoundedBitmapDrawable roundedDrawable = RoundedBitmapDrawableFactory.create(getResources(), originalBitmap);
        roundedDrawable.setCornerRadius(originalBitmap.getHeight());
        img_song.setImageDrawable(roundedDrawable);


    }
}
