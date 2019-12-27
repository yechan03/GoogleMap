package com.example.realfinalgooglemap;

public class MarkerItem {
    String food;

    public MarkerItem(String food, String feedback) {
        this.food = food;
        this.feedback = feedback;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    String feedback;
}
