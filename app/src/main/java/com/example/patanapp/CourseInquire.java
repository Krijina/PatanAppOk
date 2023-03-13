package com.example.patanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CourseInquire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_inquire);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}