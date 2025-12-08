package com.kta.ultima;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.activity.OnBackPressedCallback;

public class Mathematics extends  AppCompatActivity{
    private Toast trueToast;
    private Toast falseToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_page);

        EditText otvet = (EditText) findViewById(R.id.otvet);
        Button proverka = (Button) findViewById(R.id.btn_proverka);

        proverka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (otvet.getText().toString().equals("45")) {
                    trueToast  =  Toast.makeText(getBaseContext(),  "Всё  верно", Toast.LENGTH_SHORT);
                    trueToast.show();
                } else {
                    falseToast = Toast.makeText(getBaseContext(), "Неверно, попробуйте ещё раз", Toast.LENGTH_SHORT);
                            falseToast.show();
                }


            }
        });


        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                Intent intent = new Intent(Mathematics.this, LogicBufferPage.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
                finish();
            }
        });
    }
}
