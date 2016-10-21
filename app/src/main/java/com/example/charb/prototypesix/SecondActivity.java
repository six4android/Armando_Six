package com.example.charb.prototypesix;

import android.view.View;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private static Button button_pause;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        OnClickButtonListener();
    }

    public void OnClickButtonListener(){
        button_pause = (Button)findViewById(R.id.button11);
        button_pause.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent ("com.example.charb.prototypesix.ThirdActivity");
                        startActivity(intent);
                    }
                }
        );






    }
}
