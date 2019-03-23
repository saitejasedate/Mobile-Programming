package com.example.splash;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Secondscreen extends Activity implements View.OnClickListener {
    private Button join;
    private Button supply_food;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondcreen);
        join = (Button) findViewById(R.id.join);
        supply_food = (Button) findViewById(R.id.supply_food);
        join.setOnClickListener(this);
        supply_food.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.join:

        }
    }
}
