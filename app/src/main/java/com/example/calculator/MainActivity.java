package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    TextView result;

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);

        findViewById(R.id.btnAdd).setOnClickListener(v -> calc('+'));
        findViewById(R.id.btnSub).setOnClickListener(v -> calc('-'));
        findViewById(R.id.btnMul).setOnClickListener(v -> calc('*'));
        findViewById(R.id.btnDiv).setOnClickListener(v -> calc('/'));
    }

    void calc(char op) {
        try {
            double a = Double.parseDouble(num1.getText().toString());
            double b = Double.parseDouble(num2.getText().toString());
            double r = 0;
            switch (op) {
                case '+': r = a + b; break;
                case '-': r = a - b; break;
                case '*': r = a * b; break;
                case '/': r = b != 0 ? a / b : 0; break;
            }
            result.setText("نتیجه: " + r);
        } catch (Exception e) {
            result.setText("خطا در ورودی");
        }
    }
}
