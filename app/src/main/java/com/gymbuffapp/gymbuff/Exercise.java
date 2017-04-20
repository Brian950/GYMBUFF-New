package com.gymbuffapp.gymbuff;

/**
 * Created by Brian on 23/03/2017.
 */

public class Exercise {

    private String exerciseName;
    private int reps;
    private double weight;


    public Exercise()
    {
        this.exerciseName = "";
        this.reps = 0;
        this.weight = 0;
    }

    public Exercise(String exerciseName, int reps, double weight){
        this.exerciseName = exerciseName;
        this.reps = reps;
        this.weight = weight;
    }

    public void setName(String name){
        exerciseName = name;
    }

    public String getName()
    {
        return exerciseName;
    }

    public int getReps(){
        return reps;
    }

    public double getWeight(){return weight;}
}
