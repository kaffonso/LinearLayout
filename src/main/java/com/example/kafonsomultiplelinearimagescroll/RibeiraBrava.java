package com.example.kafonsomultiplelinearimagescroll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RibeiraBrava extends AppCompatActivity {
    ImageView iv2;
    TextView tv2;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ribeira_brava);
        tv2 = (TextView) findViewById(R.id.tv2);
        iv2 = (ImageView) findViewById(R.id.iv2);
        b2 = (Button) findViewById(R.id.b2);
    }

    public void irMindelo(View view) {
        Intent irMindelo = new Intent(this, MainActivity.class);
        startActivity(irMindelo);
    }

    public void maisRB(View view) {
        Intent maisRB = new Intent(this, MaisSobreRB.class);
        startActivity(maisRB);

    }
}