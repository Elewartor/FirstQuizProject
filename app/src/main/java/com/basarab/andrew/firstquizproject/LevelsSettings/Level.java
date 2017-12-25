package com.basarab.andrew.firstquizproject.LevelsSettings;

public class Level {
    private int id;
    private int emojiId_1;
    private int emojiId_2;
    private int emojiId_3;
    private String trueAnswer;
    private String failAnswer_1;
    private String failAnswer_2;
    private String failAnswer_3;
    private boolean levelStatus;

    public Level(int id, int emojiId_1, int emojiId_2, int emojiId_3, String trueAnswer, String failAnswer_1, String failAnswer_2, String failAnswer_3, boolean levelStatus) {
        this.id = id;
        this.emojiId_1 = emojiId_1;
        this.emojiId_2 = emojiId_2;
        this.emojiId_3 = emojiId_3;
        this.trueAnswer = trueAnswer;
        this.failAnswer_1 = failAnswer_1;
        this.failAnswer_2 = failAnswer_2;
        this.failAnswer_3 = failAnswer_3;
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

    public String getFailAnswer_1() {
        return failAnswer_1;
    }

    public String getFailAnswer_2() {
        return failAnswer_2;
    }

    public String getFailAnswer_3() {
        return failAnswer_3;
    }

    public boolean isLevelStatus() {
        return levelStatus;
    }
}
