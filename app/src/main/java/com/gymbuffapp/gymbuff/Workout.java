package com.gymbuffapp.gymbuff;

import java.util.ArrayList;

/**
 * Created by Brian on 23/03/2017.
 */

public class Workout {

    private String workoutName;
    private String description;
    private String level;
    private ArrayList<Session> sessions = new ArrayList<Session>();;

    public Workout(){
        workoutName = "";
        description = "";
        level = "";
    }

    public Workout(String name, String description, String level){
        workoutName = name;
        this.description = description;
        this.level = level;
    }

    public void setName(String name){
        workoutName = name;
    }

    public String getName(){
        return workoutName;
    }

    public void addSession(Session session){
        sessions.add(session);
    }

}
