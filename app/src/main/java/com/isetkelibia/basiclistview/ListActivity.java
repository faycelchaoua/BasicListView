package com.isetkelibia.basiclistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listview = findViewById(R.id.list_2);
        ArrayAdapter<String> tableau = new ArrayAdapter<>(listview.getContext(), R.layout.ligne , R.id.monTexte);

        for (int i = 1; i < 100; i++){
            tableau.add("Salut " + i);
        }
        listview.setAdapter(tableau);
    }
}
