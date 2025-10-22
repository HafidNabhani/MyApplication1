package com.example.myapplication1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity2 extends AppCompatActivity {

    RadioGroup radioGroupGender;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        radioGroupGender = findViewById(R.id.radioGroupGender);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(v -> {
            int selectedId = radioGroupGender.getCheckedRadioButtonId();

            if (selectedId == -1) {
                Toast.makeText(this, "Pilih salah satu opsi dulu!", Toast.LENGTH_SHORT).show();
            } else {
                RadioButton selectedRadio = findViewById(selectedId);
                String pilihan = selectedRadio.getText().toString();
                Toast.makeText(this, "Kamu memilih: " + pilihan, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

