package com.chethan.animatedvectordrawable;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.graphics.drawable.Animatable2Compat;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivStartController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivStartController = findViewById(R.id.ivAnimatedDrawable);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startAnimation();
            }
        }, 300);


    }

    private void startAnimation() {
        AnimatedVectorDrawableCompat startControllerAnimatedVector = AnimatedVectorDrawableCompat.create(this, R.drawable.avd_anim);
        ivStartController.setImageDrawable(startControllerAnimatedVector);
        startControllerAnimatedVector.registerAnimationCallback(new Animatable2Compat.AnimationCallback() {
            @Override
            public void onAnimationEnd(final Drawable drawable) {
                onClickOfStartButton();
            }
        });

        if (startControllerAnimatedVector != null)
            startControllerAnimatedVector.start();
    }


    private void onClickOfStartButton() {
        AnimatedVectorDrawableCompat animatedVector = AnimatedVectorDrawableCompat.create(this, R.drawable.avd_anim_reverse_anim);
        ivStartController.setImageDrawable(animatedVector);
        //final Handler mainHandler = new Handler(Looper.getMainLooper());
        animatedVector.registerAnimationCallback(new Animatable2Compat.AnimationCallback() {

            @Override
            public void onAnimationStart(Drawable drawable) {
                super.onAnimationStart(drawable);

            }

            @Override
            public void onAnimationEnd(final Drawable drawable) {
                onClickOfDoneButton();
            }
        });


        if (animatedVector != null && !animatedVector.isRunning())
            animatedVector.start();
    }


    private void onClickOfDoneButton() {

        AnimatedVectorDrawableCompat animatedVector = AnimatedVectorDrawableCompat.create(this, R.drawable.avd_fall_down_anim);
        ivStartController.setImageDrawable(animatedVector);
        //final Handler mainHandler = new Handler(Looper.getMainLooper());
        animatedVector.registerAnimationCallback(new Animatable2Compat.AnimationCallback() {

            @Override
            public void onAnimationStart(Drawable drawable) {
                super.onAnimationStart(drawable);

            }

            @Override
            public void onAnimationEnd(final Drawable drawable) {
        }
        });


        if (animatedVector != null && !animatedVector.isRunning())
            animatedVector.start();

    }

}
