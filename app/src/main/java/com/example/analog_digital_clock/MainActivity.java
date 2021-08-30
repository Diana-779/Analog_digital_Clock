package com.example.analog_digital_clock;

import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.DigitalClock;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       DigitalClock simpleDigitalClock = (DigitalClock) findViewById(R.id.digitalClock);
        AnalogClock simpleAnalogClock = (AnalogClock) findViewById(R.id.analogClock);

        simpleAnalogClock.setOnClickListener(view -> Toast.makeText(MainActivity.this, "Ceas analog", Toast.LENGTH_LONG).show());
        simpleDigitalClock.setOnClickListener(view -> Toast.makeText(MainActivity.this, "Ceas digital", Toast.LENGTH_LONG).show());
    }
}