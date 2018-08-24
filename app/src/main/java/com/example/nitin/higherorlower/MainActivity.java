package com.example.nitin.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    public void genRandNo(){
        Random rand = new Random();
        randomNumber = rand.nextInt(20)+1;
    }

    public void guess(View view){
        EditText editText = (EditText)findViewById(R.id.editText);
        int guessed = Integer.parseInt(editText.getText().toString());
        String message;
        if(randomNumber<guessed){
            message = "Lower";
        }
        else if(randomNumber>guessed){
            message = "Higher";
        }
        else{
            message = "You've got it! Guess Again";
            genRandNo();
        }
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        genRandNo();
    }
}
