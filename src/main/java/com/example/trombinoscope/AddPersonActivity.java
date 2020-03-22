package com.example.trombinoscope;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import com.example.trombinoscope.DAO.IPersonDAO;
import com.example.trombinoscope.DAO.PersonDAOData;
import com.example.trombinoscope.DTO.Person;
import com.google.android.material.textfield.TextInputEditText;


public class AddPersonActivity extends AppCompatActivity {
    Button btn_ajouter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_add_person);

        btn_ajouter = (Button) findViewById(R.id.ajout);
        btn_ajouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PersonDAOData p = new PersonDAOData();
                String firstname = ((TextInputEditText) findViewById(R.id.firstName)).getText().toString();
                String lastname = ((TextInputEditText) findViewById(R.id.lastName)).getText().toString();

                p.getPersons().add(new Person(firstname,lastname,0));
                Toast.makeText(getApplicationContext(), "LA PERSONNE A ETE AJOUTEE", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        if (id == android.R.id.home)
        {
            onBackPressed();
            return true;
        }
        else
        {
            return super.onOptionsItemSelected(item);
        }
    }
}

