package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_infomation);

        EditText sumOrderText = findViewById(R.id.sumOrderText);
        EditText percentText = findViewById(R.id.percentText);
        Button calculateButton = findViewById(R.id.buttonCalculate);
        TextView sumOrderTextView = findViewById(R.id.sumOrderTextView);
        TextView percentTextView = findViewById(R.id.percentTextView);
        TextView sum = findViewById(R.id.sumTextView);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double amountOrder = Integer.parseInt(sumOrderText.getText().toString());
                int percent = Integer.parseInt(percentText.getText().toString());
                double percentOfAmount = (percent/100.0) * amountOrder;
                double amount = amountOrder + percentOfAmount;
                sumOrderTextView.setText(Double.toString(amountOrder));
                percentTextView.setText(Double.toString(percentOfAmount));
                sum.setText(Double.toString(amount));
            }
        });


    }
}