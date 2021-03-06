package com.example.mathsbenchmarkapplication;

/*
   Libraries imported:
   I imported the java.util.Random library to be able to create the random integers/numbers
 */
import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileWriter;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Random;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/*
    Student Name: Edward Duffy
    Student Number: 117501529
    Date: 4/12/20
    Project: Benchmarks for Many Core Smart Phones
    Lecturer: Dr. Dan Grigoras
    Activity/Feature:
    Benchmark/Test to see how the mobile device performs when it has to solve problems sequentially
 */

/*
   How the feature/activity works:
   The user will click/tap a button
   Once the user clicks/taps the button it calls the maths function
   Once Maths function is called it accumulates the counter and starts solving maths problems
   The maths problems are solved sequentially (one after another)
   The problems the phone/mobile device is trying is written to a file which is used to keep a record
   Once the problems are solved the method is called again (recursion)
   Process is repeated again until the counter reaches a certain target/limit
   User is informed and the test/benchmark is completed
   ** To be developed a timer which times the entire process which will demonstrate how different
   phones/mobile devices handle the task
 */


public class SeqeuntialMathsBenchmark extends AppCompatActivity {


    /*
      Creating the variables for the counter and the random numbers generated by the Random.Range()
      The reasoning behind using random numbers was just to add unpredictability
      Randomness also allows for no bias and any caching
    */

    public double counter = 0;
    public int max = 10;
    public int min = 500000000;
    public double randomNumber1 = Math.random() * (max - min + 1) + min;
    public double randomNumber2 = Math.random() * (max - min + 1) + min;
    public double randomNumber3 = Math.random() * (max - min + 1) + min;
    public double randomNumber4 = Math.random() * (max - min + 1) + min;
    public double randomNumber5 = Math.random() * (max - min + 1) + min;
    public double randomNumber6 = Math.random() * (max - min + 1) + min;
    public double randomNumber7 = Math.random() * (max - min + 1) + min;
    public double randomNumber8 = Math.random() * (max - min + 1) + min;
    public double randomNumber9 = Math.random() * (max - min + 1) + min;
    public double randomNumber10 = Math.random() * (max - min + 1) + min;

    /*
       Creating variables for the textviews/imageviews etc.
     */

    private TextView equation;
    private TextView result;
    private TextView countervalueinfromer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seqeuntial_maths_benchmark);



    }

    /*
      This is the method that will test to see how the phone/mobile device performs when it's tasked
      with solving problems sequentially
     */

    public void mathsBenchmark(View view) {
        /*
           - Find the textview which will hold the equation and assign it to a variable
           - Find the textivew which will hold the answer to the problem the phone/mobile device is
             Trying to solve
         */
        equation = findViewById(R.id.equation);
        result = findViewById(R.id.result);
        countervalueinfromer = findViewById(R.id.countervalueinfromer);
        File myObj = new File("MathsBenchmark.txt");
        
        MathContext m1,m2;
        m1 = new MathContext(2);
        m2 = new MathContext(2, RoundingMode.FLOOR);
        /*
           - Increment the counter
           - While the counter has not reached the limit which is pre-set then
         */
        while (counter > 10){

            counter++;
            /*
            - The mobile device is tasked with having to solve the problems sequentially/one after another
            - Using the .equals() method to solve the problem
            - The equation itself and the answer are converted to Strings and
              displayed to the screen each time using the .setText
            - The answer to the problem and the problem itself are written to a file this is so that
              A record is kept,
              ** In the future this can be used to measure performance **
            - Process is repeated until the counter reaches it's limit
        */
            // Informing the user
            // Creating the problems for the phone/mobile device to solve
            double problem1 = randomNumber1 * randomNumber5 * randomNumber6 + (randomNumber10 + randomNumber8);
            // Creating a string representation of the problems answer
            String solution = String.valueOf(problem1);
            // Setting the textview as the answer for each problem solved by the phone/mobile device
            equation.setText(solution);
        }


    }





}