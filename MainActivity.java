package com.soumya.unitconverter.learn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View; // This is imported
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;   // We have to import this
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button); // This will target the particular button. We'll find **id** in XML.
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Converted", Toast.LENGTH_SHORT).show(); // This is how toast is coded
                String s = editText.getText().toString();
                float kg = Float.parseFloat(s);
                double gm = 1000 * kg;
                textView.setText("The corresponding value in Gram is " + gm);
            }
        });
    }
}