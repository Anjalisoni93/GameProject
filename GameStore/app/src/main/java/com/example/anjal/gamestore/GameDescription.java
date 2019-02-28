package com.example.anjal.gamestore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameDescription extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_description);

        imageView = findViewById(R.id.DescriptionImage);
        textView = findViewById(R.id.GenreName);
        findViewById(R.id.buyButton);

    }
}
