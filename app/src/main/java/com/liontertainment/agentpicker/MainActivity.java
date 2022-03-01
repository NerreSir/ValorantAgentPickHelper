package com.liontertainment.agentpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button Buttoncontroller;
    Button Buttoninitiator;
    Button Buttonduelist;
    Button Buttonsentinel;
    Random r;
    Integer[] imagescontroller = {
            R.drawable.astrav3,
            R.drawable.bbrimstone,
            R.drawable.viper,
            R.drawable.omen,
    };

    Integer[] imagessentinel = {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.valogoimageView);
        Buttoncontroller = (Button) findViewById(R.id.controllerbutton);
        r = new Random();

        Buttoncontroller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {imageView.setImageResource(imagescontroller[r.nextInt(imagescontroller.length)]);}
        });
    }





}