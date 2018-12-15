package com.example.piyathatcharoensak.exitpoll;

import android.graphics.drawable.Drawable;
import android.support.v4.widget.ImageViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.app.ListActivity;
import java.util.ArrayList;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import static com.example.piyathatcharoensak.exitpoll.R.drawable.exit_poll;
import static com.example.piyathatcharoensak.exitpoll.R.drawable.vote_no;


public class two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        int no = 0;
        int one = 0;
        int two = 0;
        int tree = 0;
        Button p = findViewById(R.id.m);
        ListView lv = findViewById(R.id.list);
        String[] clubList = {String.valueOf(no) + "\n" + "คะแนน", String.valueOf(one) + "\n" + "คะแนน", String.valueOf(two) + "\n" + "คะแนน",
                String.valueOf(tree) + "\n" + "คะแนน"};
        Integer[] arrImg = {
                vote_no,
                R.drawable.one,
                R.drawable.two,
                R.drawable.three,
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, clubList);

        lv.setAdapter(adapter);


    }


    }

