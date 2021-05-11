package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lst;
    String[] animalname={"Cat","Dog","Lion","Tiger","Elephant","Cobra"};
    String[] animaldesc={"This is cat","This is dog","This is lion","This is tiger","This is elephant","This is cobra"};
    Integer[] imgid={R.drawable.cat,R.drawable.dog,R.drawable.lion,R.drawable.tiger,R.drawable.elephant,R.drawable.cobra};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lst=(ListView)findViewById(R.id.listview);
        CustomListView customListView=new CustomListView(this,animalname,animaldesc,imgid);
        lst.setAdapter(customListView);

    }
}
