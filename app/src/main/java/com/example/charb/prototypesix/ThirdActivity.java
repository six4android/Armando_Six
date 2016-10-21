package com.example.charb.prototypesix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {
    private static Button button_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        OnClickButtonListener();
    }
    public void OnClickButtonListener(){
        button_home = (Button)findViewById(R.id.button32);
        button_home.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent (getApplicationContext(),MainActivity.class);
                        startActivity(intent);
                    }
                }
        );






    }
}
