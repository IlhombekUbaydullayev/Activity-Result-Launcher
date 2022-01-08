package com.example.intentinjava;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    protected final String Tag = DetailActivity.class.toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initViews();

    }

    void backToFinish() {
        Intent returnIntent = new Intent();
        returnIntent.putExtra("result", "PDP");
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }

    void initViews() {
        TextView tv_detail = findViewById(R.id.tv_detail);
        User user = (User) getIntent().getSerializableExtra("user");
        Log.d(Tag, user.toString());
        tv_detail.setText(user.toString());
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backToFinish();
            }
        });
    }
}