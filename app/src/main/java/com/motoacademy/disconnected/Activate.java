package com.motoacademy.disconnected;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activate);
        EditText passText = findViewById(R.id.inputPass);
        Button bActivate = findViewById(R.id.buttonActivate);


        bActivate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pass = passText.getText().toString();

                if(TextUtils.isEmpty(pass)){
                    Toast.makeText(Activate.this,"O campo está vazio!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Activate.this,"Wi-fi Liberado!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}