package com.kta.ultima;

import androidx.appcompat.app.AppCompatActivity;
import androidx.activity.OnBackPressedCallback;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class LogicBufferPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buffer_page);

        final Animation Button_Animation_Method = AnimationUtils.loadAnimation(this, R.anim.anim_button);
        Button start1 = findViewById(R.id.ExampleButton1);
        Button start2 = findViewById(R.id.ExampleButton2);
        Button start3 = findViewById(R.id.ExampleButton3);
        Button start4 = findViewById(R.id.ExampleButton4);
        Button start5 = findViewById(R.id.ExampleButton5);
        Button start6 = findViewById(R.id.ExampleButton6);
        Button start7 = findViewById(R.id.ExampleButton7);
        Button start8 = findViewById(R.id.ExampleButton8);


        start1.setOnClickListener(v -> {
            v.startAnimation(Button_Animation_Method);
            try {
                Intent intent = new Intent(LogicBufferPage.this, CheckBoxCode.class);
                startActivity(intent);
                finish();
            } catch (Exception ignored) {}
        });


        start2.setOnClickListener(v -> {
            v.startAnimation(Button_Animation_Method);
            try {
                Intent intent = new Intent(LogicBufferPage.this, LogicTxtPage.class);
                startActivity(intent);
                finish();
            } catch (Exception ignored) {}
        });
        start3.setOnClickListener(v -> {
            v.startAnimation(Button_Animation_Method);
            try {
                Intent intent = new Intent(LogicBufferPage.this, LogicGuessingGame.class);
                startActivity(intent);
                finish();
            } catch (Exception ignored) {}
        });
        start4.setOnClickListener(v -> {
            v.startAnimation(Button_Animation_Method);
            try {
                Intent intent = new Intent(LogicBufferPage.this, RiddlesCode.class);
                startActivity(intent);
                finish();
            } catch (Exception ignored) {}
        });
        start5.setOnClickListener(v -> {
            v.startAnimation(Button_Animation_Method);
            try {
                Intent intent = new Intent(LogicBufferPage.this, DialogboxCode.class);
                startActivity(intent);
                finish();
            } catch (Exception ignored) {}
        });
        start6.setOnClickListener(v -> {
            v.startAnimation(Button_Animation_Method);
            try {
                Intent intent = new Intent(LogicBufferPage.this, Mathematics.class);
                startActivity(intent);
                finish();
            } catch (Exception ignored) {}
        });
        start7.setOnClickListener(v -> {
            v.startAnimation(Button_Animation_Method);
            try {
                Intent intent = new Intent(LogicBufferPage.this, WorkingWithData.class);
                startActivity(intent);
                finish();
            } catch (Exception ignored) {}
        });
        start8.setOnClickListener(v -> {
            v.startAnimation(Button_Animation_Method);
            try {
                Intent intent = new Intent(LogicBufferPage.this, LogicPlayeer.class);
                startActivity(intent);
                finish();
            } catch (Exception ignored) {}
        });
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                Intent intent = new Intent(LogicBufferPage.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
                finish();
            }
        });
    }
}