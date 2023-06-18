package com.motoacademy.disconnected;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView userText = findViewById(R.id.inputLogin);
        Button butCreate = findViewById(R.id.buttonCreate);
        Button butNext = findViewById(R.id.buttonNext);

        butCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String userInput = userText.getText().toString();

              if(TextUtils.isEmpty(userInput)){
                  Toast.makeText(MainActivity.this,"O campo está vazio!", Toast.LENGTH_SHORT).show();
              }else{
                  Toast.makeText(MainActivity.this,"Seguinte!", Toast.LENGTH_SHORT).show();
              }
            }
        });

        butNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userInput = userText.getText().toString();

                if(TextUtils.isEmpty(userInput)){
                    Toast.makeText(MainActivity.this,"O campo está vazio!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"Seguinte!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}