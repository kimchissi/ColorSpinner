package edu.temple.colorspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] colors = {"red", "yellow", "green", "blue", "purple", "orange", "magenta", "pink", "black", "white"};



        View spinner = findViewById(R.id.ColorSpinner);

        ColorAdapter adapter = new ColorAdapter(colors);

        //spinner.setAdapter(adapter);

    }
}


