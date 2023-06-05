package com.amandeep.customlist;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView lv;
    ArrayList<Item> data=new ArrayList<>();
    Item item;
    String[] title = {"Pasta", "Maggi", "Cake", "Pancake", "Pizza","Burgers", "Fries"};
    String[] timeList = {"30 mins", "2 mins", "45 mins","10 mins", "60 mins", "45 mins", "30 mins"};

    int[] imageList = {R.drawable.pasta,R.drawable.maggi, R.drawable.cake, R.drawable.pancake, R.drawable.pizza, R.drawable.burger, R.drawable.fries};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);
        for(int i=0;i<imageList.length;i++)
        {
            item=new Item(imageList[i],title[i],timeList[i]);
            data.add(item);
        }
        MyAdapter adapter=new MyAdapter(this,data);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent=new Intent(MainActivity.this,DetailActivity.class);
        System.out.println(imageList[0]);

        System.out.println(imageList[i]);
        intent.putExtra("image",imageList[i]);
        intent.putExtra("title",title[i]);
        intent.putExtra("time",timeList[i]);

        startActivity(intent);

    }
}
