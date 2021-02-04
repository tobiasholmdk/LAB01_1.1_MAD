package com.example.lab01_mad;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public class MyActivity extends Activity {
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            };


    }
    public void onClick(View view) {
        TextView textView = (TextView) findViewById(R.id.textview);
        textView.setText("Hello Android!");
    }
    public void ExitApp(View v)
    {
        System.exit(0);
    }

}
