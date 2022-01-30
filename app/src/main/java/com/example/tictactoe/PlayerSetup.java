package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.icu.text.TimeZoneNames;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.codec.language.bm.NameType;

import java.text.BreakIterator;
import java.util.jar.Attributes;

public class PlayerSetup<GroceryList, textPersonName> extends AppCompatActivity {

    private EditText player1;
    private EditText player2;
    private BreakIterator quantityET;
    private BreakIterator editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_setup);
        player1= findViewById(R.id.player1);
        player2= findViewById(R.id.player2);
    }

    public void submitButtonClick(View view)
    {
        String player1Name = player1.getText().toString();
        String player2Name = player2.getText().toString();
        //comeback
        Intent intent= new Intent(this,GameDisplay.class);
        intent.putExtra("PLAYER_NAMES", new String[]{player1Name, player2Name});
        startActivity(intent);
    }
    public void onClick(View v) {
        if (!player1.getText().toString().isEmpty()) {
            if (player1.getText().toString().length() >= 0) {
                String index = player1.getText().toString();
            }
        } else {
            player1.setError("Plz enter name");
        }
        if (!player2.getText().toString().isEmpty()) {
            if (player2.getText().toString().length() >= 0) {
                String index = player2.getText().toString();
            }
        } else {
            player2.setError("Plz enter name");
        }
    }
}