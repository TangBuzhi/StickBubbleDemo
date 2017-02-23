package com.tj.catchcrashdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by admin on 2017/2/23.
 */
public class BActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        View crash = findViewById(R.id.crash);
        crash.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int i = 1 / 0;
    }
}
