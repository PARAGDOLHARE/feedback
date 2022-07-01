package com.example.feedback;

public class User {
    String Date,Feedback;
    //empty constructor for firestore
    public User(){}
    //constructor
    public User(String date, String feedback) {
        Date = date;
        Feedback = feedback;
    }
    //getter and setter
    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        this.Date = Date;
    }

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String feedback) {
        this.Feedback = Feedback;
    }
}
