package com.basarab.andrew.firstquizproject.Menu;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.basarab.andrew.firstquizproject.Levels.FilmsLevels;
import com.basarab.andrew.firstquizproject.LevelsSettings.Connector;
import com.basarab.andrew.firstquizproject.LevelsSettings.Level;
import com.basarab.andrew.firstquizproject.LevelsSettings.LevelsDataBase;
import com.basarab.andrew.firstquizproject.R;

import java.util.ArrayList;
import java.util.Collections;

public class PlayActivity extends Activity implements View.OnClickListener{

    private static final String SINGLE_LOAD = "SingleLoad";

    private static final int ATTEMPTS_LIMIT = 3;
    private static int CURRENT_LIMIT;

    private static final int TIME_LIMIT = 30 * 1000;

    private ImageView emojiView_1;
    private ImageView emojiView_2;
    private ImageView emojiView_3;

    private Button btnAnswer_1;
    private Button btnAnswer_2;
    private Button btnAnswer_3;
    private Button btnAnswer_4;

    private String trueAnswer;

    private LevelsDataBase levelsDataBase;
    private Level newLevel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_layout);

        // Одиночна загрузка даних рівнів.
        loadData();

        levelsDataBase = new LevelsDataBase(this);

        emojiView_1 = findViewById(R.id.emoji_1);
        emojiView_2 = findViewById(R.id.emoji_2);
        emojiView_3 = findViewById(R.id.emoji_3);

        btnAnswer_1 = findViewById(R.id.btn_answer_1);
        btnAnswer_2 = findViewById(R.id.btn_answer_2);
        btnAnswer_3 = findViewById(R.id.btn_answer_3);
        btnAnswer_4 = findViewById(R.id.btn_answer_4);

        playConnector();
    }

    private void playConnector(){
        Connector connector = new Connector(this);
        newLevel = connector.getRandomLevel();
        trueAnswer = newLevel.getTrueAnswer();

        emojiView_1.setImageDrawable(getDrawableByString(newLevel.getEmojiId_1()));
        emojiView_2.setImageDrawable(getDrawableByString(newLevel.getEmojiId_2()));
        emojiView_3.setImageDrawable(getDrawableByString(newLevel.getEmojiId_3()));

        ArrayList<String> answers = new ArrayList<>();
        answers.add(newLevel.getTrueAnswer());
        answers.add(newLevel.getFalseAnswer_1());
        answers.add(newLevel.getFalseAnswer_2());
        answers.add(newLevel.getFalseAnswer_3());

        Collections.shuffle(answers);

        btnAnswer_1.setText(answers.get(0).toUpperCase());
        btnAnswer_2.setText(answers.get(1).toUpperCase());
        btnAnswer_3.setText(answers.get(2).toUpperCase());
        btnAnswer_4.setText(answers.get(3).toUpperCase());
    }

    private Drawable getDrawableByString(String imageName){
        Resources resources = getResources();
        int resID = resources.getIdentifier(imageName, "drawable", getPackageName());
        return resources.getDrawable(resID);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_answer_1:
                if(btnAnswer_1.getText().toString().toUpperCase().compareTo(trueAnswer.toUpperCase())==0)
                    levelWin();
                else
                    levelLose();
                break;
            case R.id.btn_answer_2:
                if(btnAnswer_2.getText().toString().toUpperCase().compareTo(trueAnswer.toUpperCase())==0)
                    levelWin();
                else
                    levelLose();
                break;
            case R.id.btn_answer_3:
                if(btnAnswer_3.getText().toString().toUpperCase().compareTo(trueAnswer.toUpperCase())==0)
                    levelWin();
                else
                    levelLose();
                break;
            case R.id.btn_answer_4:
                if(btnAnswer_4.getText().toString().toUpperCase().compareTo(trueAnswer.toUpperCase())==0)
                    levelWin();
                else
                    levelLose();
                break;
        }
    }

    private void levelWin() {
        levelsDataBase.updateStatus(newLevel.getId(), 1);
        playConnector();


        Toast.makeText(this, "win", Toast.LENGTH_LONG).show();
    }

    private void levelLose() {
        if()
        Toast.makeText(this, "lose", Toast.LENGTH_LONG).show();
    }

    private void loadData(){
        SharedPreferences sp = getSharedPreferences(SINGLE_LOAD, Context.MODE_PRIVATE);
        boolean hasVisited = sp.getBoolean("hasVisited2", false);

        if (!hasVisited) {
            FilmsLevels filmsLevels = new FilmsLevels(this);

            SharedPreferences.Editor e = sp.edit();
            e.putBoolean("hasVisited2", true);
            e.commit();
        }
    }
}
