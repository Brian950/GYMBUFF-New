package com.gymbuffapp.gymbuff;

import java.util.ArrayList;

/**
 * Created by Brian on 25/03/2017.
 */

public class Session {

    private String day;
    private ArrayList<Exercise> exercises = new ArrayList<>();

    public Session(String day){
        this.day = day;
    }

    public String getDay(){
        return day;
    }

    public ArrayList getExercises(){
        return exercises;
    }

    public void addExercise(Exercise exercise){
        exercises.add(exercise);
    }
}
