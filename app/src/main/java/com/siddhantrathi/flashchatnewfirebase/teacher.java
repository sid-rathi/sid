package com.siddhantrathi.flashchatnewfirebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class teacher extends AppCompatActivity {
    Button mButton,mButton2,mButton3,mButton4,mButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);
        mButton=(Button)findViewById(R.id.button);
        mButton2=(Button)findViewById(R.id.button2);
        mButton3=(Button)findViewById(R.id.button3);
        mButton4=(Button)findViewById(R.id.button4);
        mButton5=(Button)findViewById(R.id.button5);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(teacher.this, MainChatActivity.class);
                finish();
                startActivity(intent);
            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(teacher.this, MainChatActivity.class);
                finish();
                startActivity(intent);
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(teacher.this, MainChatActivity.class);
                finish();
                startActivity(intent);
            }
        });
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(teacher.this, MainChatActivity.class);
                finish();
                startActivity(intent);
            }
        });
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(teacher.this, MainChatActivity.class);
                finish();
                startActivity(intent);
            }
        });

    }
}
