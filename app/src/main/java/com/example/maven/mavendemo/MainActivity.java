package com.example.maven.mavendemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.maven.toastmodule.ToastUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToastUtil.toast(this,"it can use");
    }
}
