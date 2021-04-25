package com.example.mathsbenchmarkapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Student Name: Edward Duffy
 * Student Number: 117501529
 * Project: Benchmarks For Many Core Smart Phones
 * Lecturer: Dr. Dan Grigoras
 * Activity:
 * Activity that presents the user with some mathematical benchmarks they can use
 * Feature where the user can go to a list activity which shows the user the specs of their device
 */
public class MainActivity extends AppCompatActivity {

    /*
        Main activity is the first activity the user is presented with as soon as they access the application
        Content view is set to the "activity_main" user interface where they are presented with a button
        where they can press to be brought to another activity where they can calculate the factorial of a given input
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
        This function is mapped to the button which will bring the user to the activity where they
        can calculate the factorial of a given input.
        As soon as the button is pressed by the user a text bubble is created letting the user know
        that "Opening Factorial Feature"
        An intent is created which creates an action regarding the factorialTest class
        the intent is passed as a parameter to the startActivity method and the end-user is brought
        to the FactorialTest activity
     */
    public void FactorialActivity(android.view.View view){
        Toast.makeText(MainActivity.this, "Opening Factorial Feature", Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(getBaseContext(), FactorialTest.class);
        startActivity(myIntent);
    }

}