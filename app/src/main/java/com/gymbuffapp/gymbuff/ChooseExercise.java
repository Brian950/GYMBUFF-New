package com.gymbuffapp.gymbuff;

import android.app.ListActivity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by Brian on 20/04/2017.
 */

public class ChooseExercise extends ListActivity {

    ArrayAdapter<String> adapter;
    String[] listItems = {"Arms", "Chest", "Back", "Legs", "Shoulders", "Abs"};

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.choose_area);
        adapter = new ArrayAdapter<String>(this,
                R.layout.bodylist,
                R.id.Itemname, listItems);
        setListAdapter(adapter);
    }

    public void test(String area){

    }
}
