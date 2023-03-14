package com.example.patanapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ListView;

public class Courses extends AppCompatActivity {
    GridLayout gridlayout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        gridlayout=(GridLayout) findViewById(R.id.grid);
        setSingleEvent(gridlayout);
//        setToggleEvent(gridlayout);
    }

    private void setSingleEvent(GridLayout gridlayout) {
        for(int i=0;i<gridlayout.getChildCount();i++){
            CardView cardView=(CardView) gridlayout.getChildAt(i);
            final int finall=i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(finall==0){
                        Intent intent=new Intent(getApplicationContext(), CourseDetail.class);
                        startActivity(intent);
                    }
                    else{
                        Log.d("a", "onClick: jthe");
                    }
                }
            });
        }
    }

//    private void setToggleEvent(GridLayout gridlayout) {
//    }

    @Override
    public boolean onNavigateUp() {
        onBackPressed();
        return super.onNavigateUp();
    }
}