package com.amandeep.customlist;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    ImageView imageView;
    TextView title,detailtime,deting,detDec;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        imageView=findViewById(R.id.dtimg);
        title=findViewById(R.id.dettitle);
        detailtime=findViewById(R.id.detailTime);
        deting=findViewById(R.id.detailIngredients);
        detDec=findViewById(R.id.detailDesc);


        Intent intent=getIntent();
        if(intent!=null)
        {
            title.setText(intent.getStringExtra("title"));
            imageView.setImageResource(intent.getIntExtra("image",2131165322));

        }






    }
}
