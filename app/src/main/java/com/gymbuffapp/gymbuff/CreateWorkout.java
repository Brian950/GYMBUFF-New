package com.gymbuffapp.gymbuff;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CreateWorkout extends AppCompatActivity {

    private ArrayList<String> days = new ArrayList<>();
    private CheckBox mon, tue, weds, thur, fri, sat, sun;
    private String name, desc, levelChoice;
    private EditText workoutNameText;
    private EditText description;
    private Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_workout);

        spinner = (Spinner) findViewById(R.id.spinner);
        String[] levels = new String[]{"Beginner","Intermediate","Expert"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, levels);
        spinner.setAdapter(adapter);

        workoutNameText = (EditText) findViewById(R.id.workoutName);
        description = (EditText) findViewById(R.id.editText4);

        mon = (CheckBox) findViewById(R.id.checkBox8);
        tue = (CheckBox) findViewById(R.id.checkBox9);
        weds = (CheckBox) findViewById(R.id.checkBox10);
        thur = (CheckBox) findViewById(R.id.checkBox11);
        fri = (CheckBox) findViewById(R.id.checkBox12);
        sat = (CheckBox) findViewById(R.id.checkBox13);
        sun = (CheckBox) findViewById(R.id.checkBox14);
    }


    public void buildWorkout(View view){
        name = workoutNameText.getText().toString();
        desc = description.getText().toString();
        levelChoice = spinner.getSelectedItem().toString();

        int count = 0;
        if (mon.isChecked()) {
            count++;
            days.add("Monday");
        }
        if (tue.isChecked()) {
            count++;
            days.add("Tuesday");
        }
        if (weds.isChecked()) {
            count++;
            days.add("Wednesday");
        }
        if (thur.isChecked()) {
            count++;
            days.add("Thursday");
        }
        if (fri.isChecked()) {
            count++;
            days.add("Friday");
        }
        if (sat.isChecked()) {
            count++;
            days.add("Saturday");
        }
        if (sun.isChecked()) {
            count++;
            days.add("Sunday");
        }

        if (count == 0) {
            Toast.makeText(CreateWorkout.this, "A workout must have at least one day!", Toast.LENGTH_SHORT).show();
        }
        else if(name.length() < 4){
            Toast.makeText(CreateWorkout.this, "Enter a name between 4 and 32 characters.", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent sessionIntent = new Intent(CreateWorkout.this, CreateSession.class);
            sessionIntent.putExtra("EXTRA_DAYS", days);
            sessionIntent.putExtra("EXTRA_NAME", name);
            sessionIntent.putExtra("EXTRA_LEVEL", levelChoice);
            sessionIntent.putExtra("EXTRA_DESC", desc);
            startActivity(sessionIntent);
            overridePendingTransition(R.anim.right_slide_in, R.anim.right_slide_out);
        }
    }
}
