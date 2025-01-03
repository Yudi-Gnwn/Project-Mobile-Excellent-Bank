package com.example.excelentbank;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class TransferLoadActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transfer_loading);

        // delay untuk load
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(TransferLoadActivity.this, TransferSuccessActivity.class);
            startActivity(intent);
            finish();
        }, 1000); // Delay
    }
}
