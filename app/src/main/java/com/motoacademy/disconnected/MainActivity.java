package com.motoacademy.disconnected;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiNetworkSpecifier;
import android.net.wifi.p2p.WifiP2pConfig;
import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.nsd.WifiP2pServiceRequest;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.StateSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {




    WifiManager mWifiManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView userText = findViewById(R.id.inputLogin);
        Button butCreate = findViewById(R.id.buttonCreate);
        Button butWifi = findViewById(R.id.buttonNext);

        mWifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);






        butCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String userInput = userText.getText().toString();

              if(TextUtils.isEmpty(userInput)){
                  Toast.makeText(MainActivity.this,"O campo está vazio!", Toast.LENGTH_SHORT).show();
              }else{
                  //Toast.makeText(MainActivity.this,"Seguinte!", Toast.LENGTH_SHORT).show();
                  Intent intent = new Intent(MainActivity.this, Activate.class);
                  startActivity(intent);
                  finish();
              }
            }
        });

            butWifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userInput = userText.getText().toString();

                if(mWifiManager.isWifiEnabled()){
                    Log.println(Log.ASSERT,"WIFITESTE","True")    ;
                    mWifiManager.setWifiEnabled(false);


                }else
                    Log.println(Log.ASSERT,"WIFITESTE","False");
                mWifiManager.setWifiEnabled(true);
            }
        });
    }




}