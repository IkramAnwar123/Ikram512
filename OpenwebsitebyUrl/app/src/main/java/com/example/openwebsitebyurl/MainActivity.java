package com.example.openwebsitebyurl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void open(View view){
        view = view;
        Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://classroom.google.com/u/0/c/NDYwMTExMDc2NTQ0"));
        startActivity(browserIntent);

    }
}