package com.kta.ultima;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
public class RiddlesCode extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.riddles_markup);

        TextView otvet = (TextView) findViewById(R.id.otvet);


        Button answer = (Button) findViewById(R.id.btn_otv);


        answer.setOnTouchListener(new View.OnTouchListener() {


            @Override
            public boolean onTouch(View v, MotionEvent event) {


                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    otvet.setTextColor(getResources().getColor(R.color.black));


                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    otvet.setTextColor(getResources().getColor(R.color.transparent));
                }


                return true;
            }
        });


        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                Intent intent = new Intent(RiddlesCode.this, LogicBufferPage.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
                finish();
            }
        });
    }
}
