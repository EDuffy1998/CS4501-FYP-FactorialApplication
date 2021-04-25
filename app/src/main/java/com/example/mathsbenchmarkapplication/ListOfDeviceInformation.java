package com.example.mathsbenchmarkapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/*
   Student Name: Edward Duffy
   Student Number: 117501529
   Date: 06/12/20
   Project: Benchmarks for many core smart phones
   Project Mentor: Dr. Dan Grigoras
   Purpose of this activity: To be able to present to the user as a list the infromation/specs
   of their phone/mobile device

   Examples of information:
   Operating systems
   The Brand of mobile device
   Product info
   Amount of cores
   Gpu info
 */
public class ListOfDeviceInformation extends AppCompatActivity {
    /*
       Creating the variables which store the information about the device
       I used the following resource to be able to figure out which apsects of the Build library
       I needed to implement/use within my code:
       https://developer.android.com/reference/android/os/Build
     */
    String deviceModel = android.os.Build.MODEL;
    String osVersion = System.getProperty("os.version");
    String DeviceType = Build.DEVICE;
    String APILevel = Build.VERSION.SDK;
    String DeviceBrand = Build.BRAND;
    String cpu1 = Build.CPU_ABI;
    String cpu2 = Build.CPU_ABI2;
    String DeviceHardware = Build.HARDWARE;
    String deviceHost = Build.HOST;
    String manufacturer = Build.MANUFACTURER;
    String deviceUser = Build.USER;
    String deviceBoardType = Build.BOARD;
    /*
       Creating the list variables which contain the information that I want to add to each row
       Information displayed on each row will be:
       Telling the user the information
       Display the info that corresponds to that mobile device
     */
    ListView listView;
    String mTitle[] = {""};
    String mDescription[] = {""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_device_information);

        listView = findViewById(R.id.listView);

        /*
           Creating the adapter class which will be used to put the appropriate data on each row
         */

        MyAdapter adapter = new MyAdapter(this,mTitle,mDescription);
        listView.setAdapter(adapter);

    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter(Context c, String[] title, String[] description) {
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;


        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            // now set our resources on views
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);




            return row;
        }



    }
}