package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;



public class ListPersonActivity extends AppCompatActivity {

    ListView mListView;
    PersonAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_person);

        IPersonDAO personDAOData = new PersonDAOData();


        mListView = (ListView) findViewById(R.id.personsList);
        adapter = new PersonAdapter(ListPersonActivity.this, personDAOData.getPersons());
        mListView.setAdapter(adapter);
    }
}
