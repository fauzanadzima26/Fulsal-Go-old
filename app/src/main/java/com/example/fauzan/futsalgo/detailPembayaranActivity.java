package com.example.fauzan.futsalgo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class detailPembayaranActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pembayaran);
        Button lanjutkan =(Button)findViewById(R.id.lanjutkan);
        lanjutkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(detailPembayaranActivity.this, AkhirActivity.class);
                startActivity(i);
            }
        });
        Button batalkan =(Button)findViewById(R.id.batalkan);
        batalkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(detailPembayaranActivity.this, LoginActivity.class);
                startActivity(l);
            }
        });
    }
}
