package com.example.optionsmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.search:
                Toast.makeText(getApplicationContext(), "Search", Toast.LENGTH_SHORT).show();
                break;
            case R.id.upload:
                Toast.makeText(getApplicationContext(), "Upload", Toast.LENGTH_SHORT).show();
                break;
            case R.id.contactus:
                Toast.makeText(getApplicationContext(), "Contact Us", Toast.LENGTH_SHORT).show();
                break;
            case R.id.aboutus:
                Toast.makeText(getApplicationContext(), "About Us", Toast.LENGTH_SHORT).show();
                break;
        }





        return super.onOptionsItemSelected(item);
    }
}