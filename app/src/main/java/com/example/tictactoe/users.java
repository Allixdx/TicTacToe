package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class users extends AppCompatActivity {

    private EditText player1;
    private EditText player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

        player1 = findViewById(R.id.editText1);
        player2 = findViewById(R.id.editText2);
    }

    public void submit(View view){
        String player1Name = player1.getText().toString();
        String player2Name = player2.getText().toString();

        Intent i = new Intent(this, display.class);
        i.putExtra("PLAYER_NAMES", new String[] {player1Name, player2Name});
        startActivity(i);
    }
}