package com.beckytech.faarfannaaafaanoromoo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class OpenerActivity extends AppCompatActivity {

    View decorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_opener);

        decorView = getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            @Override
            public void onSystemUiVisibilityChange(int visibility) {
                if (visibility == 0) {
                    decorView.setSystemUiVisibility(hideSystemBars());
                }
            }
        });

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide_splash);
        ImageView imageView = findViewById(R.id.splashScreenImage);
        imageView.setAnimation(animation);

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                OpenerActivity.this.finish();
                OpenerActivity.this.startActivity(new Intent(OpenerActivity.this, MainHomeActivity.class));
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    public void onWindowFocusChanged(boolean hasFocus) {
        if (hasFocus) {
            decorView.setSystemUiVisibility(hideSystemBars());
        }
    }

    private int hideSystemBars() {
        return View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
    }
}