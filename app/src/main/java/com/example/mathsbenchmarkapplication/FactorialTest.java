package com.example.mathsbenchmarkapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

/*
    Student Name: Edward Duffy
    Student Number: 11701529
    Final Year Project: Benchmarks for mobile devices
    Project Co-ordinator: Dr. Dan Grigoras

    Application: Maths Application
    Feature: Factorial Test

    Goal/Purpose of this feature:
   - The goal/purpose of this feature is to see how the phone copes when it's tasked to deal with
    calculating the factorial of a given number through a loop/counter/recursion
   - How the mobile device responds to this task will be monitored using the profiler tool that
   is integrated within Android Studio
   - The profiler tool tracks the following data:
   - CPU
   - Memory
   - Network
   - Energy

   Expectancy of this feature/application:
   - Devices of higher spec and more cores should perform the calculations and produce the value
   more quickly than devices of lower specs
   - Devices that aren't possessed with the greatest specs will take longer to calculate
 */
public class FactorialTest extends AppCompatActivity {

    EditText editText;

    TextView textView;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial_test);

        /*
            Creating variables containing the ID's of the TextView's, EditText's & button
         */
        textView = (TextView) findViewById(R.id.FactorialResult);
        editText = (EditText) findViewById(R.id.UserInput);
        button = (Button) findViewById(R.id.calculate);

        /*
            Creating an onclickListener for the button
            Once the button is pressed by the user, the numeric input entered by the user is converted to
            a string using the .getText() & .toString methods
            The textview is set to the factorial of the numeric input entered by the user by
            using string formatting to set the textivew to the result by calling the factorial method
            and computing the answer, the answer is then what the textviews text is set to to 1 decimal place
         */
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(editText.getText().toString());
                textView.setText(""+ String.format(Locale.getDefault(), "%.0f",factorial(num)));
            }
        });
    }

    /*
        Method Calculates the factorial of a given numeric input from the user:
        if the number entered by the user is less than two return 1 as there is no factorial to one.

        else, the number is greater than 1 the factorial is calculated by multiplying the numeric value
        entered by the user by the factorial of the value minus 1
        Factorial value returned to the user.
     */
    private double factorial(double num){
        if(num < 2){
            return 1;
        } else {
            return num * factorial(num -1);
        }
    }




    /*
        Empty method
     */
    public void Factorial(android.view.View view){



    }
}