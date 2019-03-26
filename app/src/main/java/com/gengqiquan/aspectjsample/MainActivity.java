package com.gengqiquan.aspectjsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gengqiquan.aspect.DebugTrace;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testAnnotatedMethod();
    }
    @DebugTrace
    private void testAnnotatedMethod() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
