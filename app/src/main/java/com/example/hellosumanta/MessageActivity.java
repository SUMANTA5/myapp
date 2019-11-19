package com.example.hellosumanta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.time.Instant;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message2);
        Intent intent= getIntent();

        String message = ((Intent) intent).getStringExtra("EXTRA_MESSAGE");
        TextView textView = findViewById(R.id.display_message);
        textView.setText(message);


    }

    public void OpenFinalActivity(View view) {

        startActivity(new Intent(this,FinalActivity.class));


    }
}
