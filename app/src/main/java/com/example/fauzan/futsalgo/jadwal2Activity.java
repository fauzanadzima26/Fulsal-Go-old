package com.example.fauzan.futsalgo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class jadwal2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal2);
        Button lanjutPembayaran = (Button)findViewById(R.id.lanjutPembayaran);
        lanjutPembayaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(jadwal2Activity.this, detailPembayaranActivity.class);
                startActivity(i);
            }
        });


    }
}
