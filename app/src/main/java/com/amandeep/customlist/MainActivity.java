package com.amandeep.customlist;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Item> data=new ArrayList<>();
    Item item;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);
        int[] imageList = {R.drawable.pasta, R.drawable.maggi, R.drawable.cake, R.drawable.pancake, R.drawable.pizza, R.drawable.burger, R.drawable.fries};
        String[] title = {"Pasta", "Maggi", "Cake", "Pancake", "Pizza","Burgers", "Fries"};
        String[] timeList = {"30 mins", "2 mins", "45 mins","10 mins", "60 mins", "45 mins", "30 mins"};
        for(int i=0;i<imageList.length;i++)
        {
            item=new Item(imageList[i],title[i],timeList[i]);
            data.add(item);
        }
        MyAdapter adapter=new MyAdapter(this,data);
        lv.setAdapter(adapter);




    }
}
