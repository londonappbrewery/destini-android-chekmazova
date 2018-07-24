package com.londonappbrewery.destini;

public class StoryPlot {
    private int story;
    private int answerTop;
    private int answerBottom;

    public StoryPlot(int story) {
        this.story = story;
    }

    public StoryPlot(int story, int answerTop, int answerBottom) {
        this.story = story;
        this.answerTop = answerTop;
        this.answerBottom = answerBottom;
    }

    public int getStory() {
        return story;
    }

    public void setStory(int story) {
        this.story = story;
    }

    public int getAnswerTop() {
        return answerTop;
    }

    public void setAnswerTop(int answerTop) {
        this.answerTop = answerTop;
    }

    public int getAnswerBottom() {
        return answerBottom;
    }

    public void setAnswerBottom(int answerBottom) {
        this.answerBottom = answerBottom;
    }
}
