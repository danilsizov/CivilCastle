package com.example.goo.civilcastle;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int numberOfCoins=0;
    private static final int LENGTH_SHORT = 500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myMainClick(View view) {

        TextView myCoinsScore = (TextView)findViewById(R.id.myCoinsScore);
        numberOfCoins++;
        myCoinsScore.setText(numberOfCoins + "");
        Toast.makeText(this, "+1", Toast.LENGTH_SHORT).show();

    }
}
