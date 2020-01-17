package com.example.myapplication;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    // Создаем экземпляры для наших анимаций
    private Animation animOne, animTwo, animThree;
    private ImageView imageView;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageView5;
    private ImageView imageView6;
    private ImageView imageView7;
    private ImageView imageView8;
    private ImageView imageView9;
    private ImageView imageView10;
    private ImageView imageView11;
    private ImageView imageView12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView2);
        imageView2 = (ImageView) findViewById(R.id.imageView3);
        imageView3 = (ImageView) findViewById(R.id.imageView4);
        imageView4 = (ImageView) findViewById(R.id.imageView5);
        imageView5 = (ImageView) findViewById(R.id.imageView6);
        imageView6 = (ImageView) findViewById(R.id.imageView7);
        imageView7 = (ImageView) findViewById(R.id.imageView8);
        imageView8 = (ImageView) findViewById(R.id.imageView9);
        imageView9 = (ImageView) findViewById(R.id.imageView10);
        imageView10 = (ImageView) findViewById(R.id.imageView11);
        imageView11 = (ImageView) findViewById(R.id.imageView12);
        imageView12 = (ImageView) findViewById(R.id.imageView13);
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener (new View.OnClickListener() {
        @Override
        public void onClick(View v){
            imageView.startAnimation(animTwo);
            imageView2.startAnimation(animTwo);
            imageView3.startAnimation(animTwo);
            imageView4.startAnimation(animTwo);
            imageView5.startAnimation(animTwo);
            imageView6.startAnimation(animTwo);
            imageView7.startAnimation(animTwo);
            imageView8.startAnimation(animTwo);
            imageView9.startAnimation(animTwo);
            imageView10.startAnimation(animTwo);
            imageView11.startAnimation(animTwo);
            imageView12.startAnimation(animTwo);
        }
    });



        // Подгружаем все анимации
        animOne = AnimationUtils.loadAnimation(this, R.anim.animation_one);
        animTwo = AnimationUtils.loadAnimation(this, R.anim.animation_two);
        animThree = AnimationUtils.loadAnimation(this, R.anim.animation_three);
    }

}