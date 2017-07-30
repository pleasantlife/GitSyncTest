package com.kimjinhwan.android.gitsynctest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String layout = "레이아웃";
        String happyMil = "해피밀";

        String momstouch = "맘스터치";
        String lotteRia = "롯데리아";
        String popeyes = "파파이스";

        pizza();
        sushi();
        tv();
    }

    private void pizza(){
        String domino = "도미노피자";
        String pizzHut = "피자헛";

    }

    private void sushi(){
         String salmon = "연어";
    }

    private void tv(){
        String samsung = "삼성";
        String lg = "엘지";
        String sony = "소니";
    }
}
