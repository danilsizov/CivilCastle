package com.example.goo.civilcastle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by Goo on 16.07.2016.
 */
public class GameActivity extends AppCompatActivity {

    private int numberOfCoins=0;
    private static final int LONG_DELAY = 500;
    final Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void myMainClick(View view) {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_layout,
                (ViewGroup) findViewById(R.id.toast_layout));
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, random.nextInt(1000)-400, random.nextInt(1200)-500);
        toast.setDuration(Toast.LENGTH_LONG);
        TextView myCoinsScore = (TextView)findViewById(R.id.myCoinsScore);
        numberOfCoins++;
        myCoinsScore.setText(numberOfCoins + "");
        toast.setView(layout);
        toast.show();

    }
}


