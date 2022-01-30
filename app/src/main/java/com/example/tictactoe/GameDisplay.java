package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameDisplay extends AppCompatActivity {

    private TicTacToeBoard gameBoard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_display);

        Button playAgainBTN = findViewById(R.id.playAgainButton);
        Button homeBTN = findViewById(R.id.HomeButton);
        TextView playerTurn = findViewById(R.id.playe_display);
        String[] playerNames= getIntent().getStringArrayExtra("PLAYER_NAMES");

        playAgainBTN.setVisibility(View.GONE);
        homeBTN.setVisibility(View.GONE);


        if(playerNames != null){
            playerTurn.setText((playerNames[0]+"'s Turn"));
        }
        gameBoard=findViewById(R.id.ticTacToeBoard);

        gameBoard.setUpGame(playAgainBTN,homeBTN,playerTurn,playerNames);
    }

    public  void playAgainButtonClick(View view){
        gameBoard.resetGame();
        gameBoard.invalidate();

    }
    public  void homeButtonClick(View view){
        Intent intent = new Intent(this, PlayerSetup.class);
        startActivity(intent);
    }
    public void clickexit(View view) {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
}