package com.tj.catchcrashdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, OnBubbleStateListener {

    private static final String TAG = "MainActivity";

    private DragBubbleView mDragBubbleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView toNext = (TextView) findViewById(R.id.to_next);
        TextView btn = (TextView) findViewById(R.id.reCreateBtn);
        mDragBubbleView = (DragBubbleView) findViewById(R.id.dragBubbleView);
        toNext.setOnClickListener(this);
        btn.setOnClickListener(this);
        mDragBubbleView.setOnBubbleStateListener(this);
        mDragBubbleView.setText("39+");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.to_next:
                startActivity(new Intent(this, BActivity.class));
                break;
            case R.id.reCreateBtn:
                mDragBubbleView.reCreate();
                int i = (int) Math.hypot(3, 4);
                mDragBubbleView.setText(i + "+");
                break;
            default:
                break;
        }
    }

    @Override
    public void onDrag() {
        Log.e(TAG, "拖拽气泡");
    }

    @Override
    public void onMove() {
        Log.e(TAG, "移动气泡");
    }

    @Override
    public void onRestore() {
        Log.e(TAG, "气泡恢复原来位置");
    }

    @Override
    public void onDismiss() {
        Log.e(TAG, "气泡消失");
    }
}
