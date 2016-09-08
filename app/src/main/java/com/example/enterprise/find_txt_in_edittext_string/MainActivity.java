package com.example.enterprise.find_txt_in_edittext_string;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void buttonOnClick(View v) {
        ((Button) v).setText("oke");

        TextView quantityTextView = (TextView) findViewById(R.id.editText);
        if(quantityTextView.getText().toString().contains("ok")) Toast.makeText(getApplicationContext(), "Word find in string.", Toast.LENGTH_SHORT).show();
        else Toast.makeText(getApplicationContext(), "Nothing to find.", Toast.LENGTH_SHORT).show();
    }
}


