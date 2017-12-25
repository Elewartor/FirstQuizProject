package com.basarab.andrew.firstquizproject.LevelsSettings;

public class Level {
    private int id;
    private int emojiId_1;
    private int emojiId_2;
    private int emojiId_3;
    private String trueAnswer;
    private String falseAnswer_1;
    private String falseAnswer_2;
    private String falseAnswer_3;
    private int levelStatus;

    public Level(int id, int emojiId_1, int emojiId_2, int emojiId_3, String trueAnswer, String falseAnswer_1, String falseAnswer_2, String falseAnswer_3, int levelStatus) {
        this.id = id;
        this.emojiId_1 = emojiId_1;
        this.emojiId_2 = emojiId_2;
        this.emojiId_3 = emojiId_3;
        this.trueAnswer = trueAnswer;
        this.falseAnswer_1 = falseAnswer_1;
        this.falseAnswer_2 = falseAnswer_2;
        this.falseAnswer_3 = falseAnswer_3;
        this.levelStatus = levelStatus;
    }

    public int getId() {
        return id;
    }

    public int getEmojiId_1() {
        return emojiId_1;
    }

    public int getEmojiId_2() {
        return emojiId_2;
    }

    public int getEmojiId_3() {
        return emojiId_3;
    }

    public String getTrueAnswer() {
        return trueAnswer;
    }

    public String getFalseAnswer_1() {
        return falseAnswer_1;
    }

    public String getFalseAnswer_2() {
        return falseAnswer_2;
    }

    public String getFalseAnswer_3() {
        return falseAnswer_3;
    }

    public int getLevelStatus() {
        return levelStatus;
    }
}
