package com.gymbuffapp.gymbuff;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Brian on 25/03/2017.
 */

public class CreateSession extends ListActivity {

    ArrayAdapter<String> adapter;
    ArrayList<String> listItems=new ArrayList<String>();
    int clickCounter=0;

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.create_session);
        String name = getIntent().getStringExtra("EXTRA_NAME");
        String desc = getIntent().getStringExtra("EXTRA_DESC");
        String levelChoice = getIntent().getStringExtra("EXTRA_LEVEL");
        ArrayList<String> days = getIntent().getStringArrayListExtra("EXTRA_DAYS");

        adapter=new ArrayAdapter<String>(this,
                R.layout.mylist,
                R.id.Itemname, listItems);
        setListAdapter(adapter);

        Workout workout = new Workout(name, desc, levelChoice);

        addSession(days.get(0));
    }

    public void addItems(View v) {
        Intent exerciseChoices = new Intent(this, ChooseExercise.class);
        startActivityForResult(exerciseChoices, 1);
        listItems.add("Clicked : "+clickCounter++);
        adapter.notifyDataSetChanged();
    }

    public void addSession(String day){
        TextView heading = (TextView)findViewById(R.id.textView11);
        heading.setText(day);

    }
}
