package com.example.newspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    Integer[] imageId = {R.drawable.img,R.drawable.img_1,R.drawable.img_2,R.drawable.img_3};
    String[] heading = {"a", "b", "c", "d"};
    String[] subheading = {"asf", "asdf", "qwer", "tre"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView) findViewById(R.id.list);

       /* heading = getResources().getStringArray(R.array.heading);
        subheading = getResources().getStringArray(R.array.subHeading);
       */ Log.i("heading", heading[0]);
/*


        CustomAdapter adapter = new CustomAdapter(MainActivity.this,heading,subheading,imageId);
        lv.setAdapter(adapter);
*/

    }
}