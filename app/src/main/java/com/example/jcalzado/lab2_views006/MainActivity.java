package com.example.jcalzado.lab2_views006;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView callingText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callingText = (TextView) findViewById(R.id.callingText);
    }

    public void llamar (View v) {
        callingText.setText("LLamando...");
    }
}
