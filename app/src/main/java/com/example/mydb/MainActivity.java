package com.example.mydb;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView1);

        CountDownTimer timer= new CountDownTimer(100000,10000) {

            @Override
            public void onTick(long l) {
                int time=(int)(l/1000);
                if (time<30){
                textView.setVisibility(View.INVISIBLE);
                textView2.setVisibility(View.VISIBLE);}


            }

            @Override
            public void onFinish() {

            }
        };timer.start();
    }

}