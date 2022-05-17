package com.beckytech.faarfannaaafaanoromoo;

        import android.app.Application;
        import android.content.Intent;
        import android.os.Bundle;
        import android.os.CountDownTimer;
        import androidx.appcompat.app.AppCompatActivity;
        import android.util.Log;
        import android.view.View;
        import android.view.animation.Animation;
        import android.view.animation.AnimationUtils;
        import android.widget.ImageView;
        import android.widget.TextView;


public class OpenerActivity extends AppCompatActivity {

    private static final String LOG_TAG = "SplashActivity";

    private static final long COUNTER_TIME = 5;

    private long secondsRemaining;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opener);

        getSupportActionBar().hide();

        createTimer(COUNTER_TIME);

    }


    private void createTimer(long seconds) {
        final TextView counterTextView = findViewById(R.id.timer);

        CountDownTimer countDownTimer =
                new CountDownTimer(seconds * 1000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        secondsRemaining = ((millisUntilFinished / 1000) + 1);
                        counterTextView.setText("App is done loading in: " + secondsRemaining);
                    }

                    @Override
                    public void onFinish() {
                        secondsRemaining = 0;
                        counterTextView.setText("Done.");

                        Application application = getApplication();

                        if (!(application instanceof MyApplication)) {
                            Log.e(LOG_TAG, "Failed to cast application to MyApplication.");
                            startMainActivity();
                            return;
                        }

                        // Show the app open ad.
                        ((MyApplication) application)
                                .showAdIfAvailable(
                                        OpenerActivity.this,
                                        new MyApplication.OnShowAdCompleteListener() {
                                            @Override
                                            public void onShowAdComplete() {
                                                startMainActivity();
                                            }
                                        });
                    }
                };
        countDownTimer.start();
    }

    public void startMainActivity() {
        Intent intent = new Intent(this, MainHomeActivity.class);
        this.startActivity(intent);
    }

}