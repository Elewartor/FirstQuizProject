package com.basarab.andrew.firstquizproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.basarab.andrew.firstquizproject.Menu.PlayActivity;
import com.basarab.andrew.firstquizproject.Menu.ShopActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Перехід на лайаут безпосередньо гри
    public void goToPlayActivity (View view){
        Intent intent = new Intent(this, PlayActivity.class);
        startActivity(intent);
    }
    //Перехід на лайаут покупки нових рівнів
    public void goToShopLayout (View view){
        Intent intent = new Intent(this, ShopActivity.class);
        startActivity(intent);
    }

}
