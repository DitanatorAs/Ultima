package com.kta.ultima;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class LogicGuessingGame extends AppCompatActivity {
    private int animal;
    private AnimalData animalData = new AnimalData();
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guessing_game_markup);

        rand_anim();

        Button next = findViewById(R.id.btn_next);
        next.setOnClickListener(v -> rand_anim());

        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                Intent intent = new Intent(LogicGuessingGame.this, LogicBufferPage.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
                finish();
            }
        });
    }

    public void rand_anim() {
        TextView name = findViewById(R.id.name);
        ImageView picture = findViewById(R.id.picture);
        TextView voic = findViewById(R.id.voic);

        animal = random.nextInt(5);
        name.setText(animalData.names[animal]);
        picture.setImageResource(animalData.images[animal]);
        voic.setText(animalData.sounds[animal]);
    }
}
