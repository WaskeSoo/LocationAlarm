package com.example.budziklokalizacyjny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    TextView titleTxtView;
    Button mapBtn;
    Button loadBtn;
    Button settingsBtn;
    ImageView gitLogo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(getSupportActionBar()).hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        titleTxtView = findViewById(R.id.titleTxtView);
        mapBtn = findViewById(R.id.mapBtn);
        loadBtn = findViewById(R.id.loadBtn);
        settingsBtn = findViewById(R.id.settingsBtn);
        gitLogo = findViewById(R.id.gitLogo);

        mapBtn.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this,MapClass.class);
            MainActivity.this.startActivity(intent);
        });
        loadBtn.setOnClickListener(v -> {

        });
        settingsBtn.setOnClickListener(v -> {

        });
        gitLogo.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/WaskeSoo"))));

    }
}