package com.example.patanapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;

public class Newsblog extends AppCompatActivity {
    GridLayout gridlayoutt;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsblog);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        gridlayoutt=(GridLayout) findViewById(R.id.gridd);
        setSingleEvent(gridlayoutt);
    }
    private void setSingleEvent(GridLayout gridlayoutt) {
        for(int i=0;i<gridlayoutt.getChildCount();i++){
            CardView cardView=(CardView) gridlayoutt.getChildAt(i);
            final int finali=i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(finali==0){
                        Intent intent=new Intent(getApplicationContext(), NewsblogDetail.class);
                        startActivity(intent);
                    }
                    else{
                        Log.d("a", "onClick: jthe");
                    }
                }
            });
        }
    }
}