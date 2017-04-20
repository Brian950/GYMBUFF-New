package com.gymbuffapp.gymbuff;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Brian on 14/04/2017.
 */

public class Menu extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
        setContentView(R.layout.menu);
    }

    public void settingsOnClick(View view) {
        Toast.makeText(Menu.this, "Settings have not been implemented yet.", Toast.LENGTH_SHORT).show();
    }

    public void startWorkout(View view){
        Toast.makeText(Menu.this, "Creating workouts has not been implemeted yet.", Toast.LENGTH_SHORT).show();
    }

    public void startRun(View view){
        Toast.makeText(Menu.this, "Runs have not been implemeted yet.", Toast.LENGTH_SHORT).show();
    }

    public void dietDiary(View view){
        Toast.makeText(Menu.this, "The diet diary has not been implemeted yet.", Toast.LENGTH_SHORT).show();
    }

    public void createWorkout(View view){
        startActivity(new Intent(Menu.this, CreateWorkout.class));
    }

    public void progressPhoto(View view){
        Toast.makeText(Menu.this, "Progress photos have not been implemeted yet.", Toast.LENGTH_SHORT).show();
    }

    public void workoutDiary(View view){
        Toast.makeText(Menu.this, "Workout diaries have not been implemeted yet.", Toast.LENGTH_SHORT).show();
    }
}
