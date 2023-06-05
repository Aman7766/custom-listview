package com.amandeep.customlist;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
public class MyAdapter extends ArrayAdapter<Item> {
    ArrayList<Item> data;
    LayoutInflater inflater;
  public MyAdapter(Context context,ArrayList<Item> data)
  {
      super(context,R.layout.item_view,data);
      this.data=data;
      inflater=LayoutInflater.from(getContext());
  }
 public View getView(int position, View convertView, ViewGroup parent)
 {
     View v=inflater.inflate(R.layout.item_view,null);
     TextView textView=v.findViewById(R.id.title);
     TextView textView1=v.findViewById(R.id.righttxt);
     ImageView imageView=v.findViewById(R.id.img);
     Item item=data.get(position);
     textView.setText(item.getTitle());
     imageView.setImageResource(item.getImage());
     textView1.setText(item.getRighttxt());
     return v;
 }
}
