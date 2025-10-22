package com.example.myapplication1;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView = findViewById(R.id.myTextView);
    }

    // 🔵 RESET angka ke 0
    public void resetCount(View view) {
        count = 0;
        myTextView.setText(String.valueOf(count));
        Toast.makeText(this, "Angka direset ke 0", Toast.LENGTH_SHORT).show();
    }

    // 🟣 TAMBAH angka
    public void countUp(View view) {
        count++;
        myTextView.setText(String.valueOf(count));
    }

    // 🔻 KURANGI angka (tidak bisa kurang dari 0)
    public void countDown(View view) {
        if (count > 0) {
            count--;
            myTextView.setText(String.valueOf(count));
        } else {
            Toast.makeText(this, "Angka sudah 0!", Toast.LENGTH_SHORT).show();
        }
    }
}
