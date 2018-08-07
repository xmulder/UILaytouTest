package com.example.rindou11.uilaytoutest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button_relative_layout;
    private Button button_relative_layout_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_relative_layout=(Button)findViewById(R.id.button_relative);
        button_relative_layout.setOnClickListener(this);

        button_relative_layout_2=(Button)findViewById(R.id.button_relative_2);
        button_relative_layout_2.setOnClickListener(this);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.button_relative:
                Intent intent_relative=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent_relative);
                break;
            case R.id.button_relative_2:
                Intent intent_relative_2=new Intent("android.intent.action.MAIN");
                intent_relative_2.addCategory("android.intent.category.MAIN3");
                startActivity(intent_relative_2);
            default:
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
