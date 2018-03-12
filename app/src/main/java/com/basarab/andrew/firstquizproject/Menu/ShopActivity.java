package com.basarab.andrew.firstquizproject.Menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.basarab.andrew.firstquizproject.MainActivity;
import com.basarab.andrew.firstquizproject.R;


public class ShopActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop_layout);
    }

    //Тимчасове рішення для тестування лайаутів
    public void onBack2 (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
