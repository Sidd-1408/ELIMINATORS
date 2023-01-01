package com.example.testapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splashscreen extends AppCompatActivity {

    private static int timer = 4000;

    ImageView imageview;
    TextView textview1,textview2;
    Animation upperanim,bottomanim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splashscreen);

        imageview = findViewById(R.id.kiitlogo);
        textview1 = findViewById(R.id.kiitname);
        textview2 = findViewById(R.id.textView2);

        upperanim = AnimationUtils.loadAnimation(this,R.anim.upperanim);
        bottomanim = AnimationUtils.loadAnimation(this,R.anim.bottomanim);

        imageview.setAnimation(upperanim);
        textview1.setAnimation(bottomanim);
        textview2.setAnimation(bottomanim);

    }
}