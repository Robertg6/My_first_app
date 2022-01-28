package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Note_Edit extends AppCompatActivity {

    EditText note_title, note_body;
    Button save_button, cancel_button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_edit);

        note_title = (EditText) findViewById(R.id.note_title);
        note_body = (EditText) findViewById(R.id.note_edit);

        cancel_button = (Button)findViewById(R.id.can_button);
        save_button = (Button)findViewById(R.id.save_button);

        save_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(Note_Edit.this, Notes.class);
                startActivity(intent);
            }
        });

        cancel_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(Note_Edit.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}