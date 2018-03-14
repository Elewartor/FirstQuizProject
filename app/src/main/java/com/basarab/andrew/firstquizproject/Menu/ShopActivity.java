package com.basarab.andrew.firstquizproject.Menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.basarab.andrew.firstquizproject.MainActivity;
import com.basarab.andrew.firstquizproject.R;


public class ShopActivity extends Activity{

    ConstraintLayout shop_lyt;
    ImageView btn_mask, btn_mask2;
    TextView time1, time2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop_layout);

        //получаэмо контейнер
        shop_lyt = findViewById(R.id.shop_layout);
        //затемняючий фон
        btn_mask =findViewById(R.id.imageMaskB);
        btn_mask2 =findViewById(R.id.imageMaskB2);
        //textview для таймера
        time1 =findViewById(R.id.timer);
        time2 =findViewById(R.id.timer2);


        shop_lyt.removeView(btn_mask);
        //shop_lyt.removeView(btn_mask2);
        shop_lyt.removeView(time1);
        //shop_lyt.removeView(time2);


        //щоб створити знову картинку
        //shop_lyt.addView(btn_mask);


    }

    //Тимчасове рішення для тестування лайаутів
    public void onBack2 (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
