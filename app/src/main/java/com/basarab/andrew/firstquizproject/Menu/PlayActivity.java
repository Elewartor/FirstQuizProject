package com.basarab.andrew.firstquizproject.Menu;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

import com.basarab.andrew.firstquizproject.MainActivity;
import com.basarab.andrew.firstquizproject.R;

public class PlayActivity extends Activity{

    private ImageView imageView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_layout);
        imageView = findViewById(R.id.emoji_1);

        String str = "emoji_u1f0cf";
        Resources res = getResources();
        int resID = res.getIdentifier(str, "drawable", getPackageName());
        Drawable drawable = res.getDrawable(resID );
        imageView.setImageDrawable(drawable);
    }


    //Тимчасове рішення для тестування лайаутів
    public void onBack (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
