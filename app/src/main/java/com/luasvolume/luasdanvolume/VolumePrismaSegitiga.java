package com.luasvolume.luasdanvolume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class VolumePrismaSegitiga extends AppCompatActivity {
    EditText alas, tinggi, tinggiP;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_prisma_segitiga);

        alas = (EditText) findViewById(R.id.etAPrisma);
        tinggi = (EditText) findViewById(R.id.etTSPrisma);
        tinggiP = (EditText) findViewById(R.id.etTPrisma);
        hitung = (Button) findViewById(R.id.btnHitung);
        hasil = (TextView) findViewById(R.id.tvHasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (alas.length() == 0 && tinggi.length() == 0 && tinggiP.length() == 0) {
                    Toast.makeText(getApplication(), "Tidak boleh kosong!!!", Toast.LENGTH_LONG).show();
                } else if (alas.length() == 0) {
                    Toast.makeText(getApplication(), "Alas segitiga tidak boleh kosong!!!", Toast.LENGTH_LONG).show();
                } else if (tinggi.length() == 0) {
                    Toast.makeText(getApplication(), "Tinggi segitiga tidak boleh kosong!!!", Toast.LENGTH_LONG).show();
                } else if (tinggiP.length() == 0) {
                    Toast.makeText(getApplication(), "Tinggi prisma tidak boleh kosong!!!", Toast.LENGTH_LONG).show();
                } else {
                    String alasS = alas.getText().toString();
                    String tinggiSP = tinggi.getText().toString();
                    String tinggiPr = tinggiP.getText().toString();
                    double alas = Double.parseDouble(alasS);
                    double tinggi = Double.parseDouble(tinggiSP);
                    double tinggiP = Double.parseDouble(tinggiPr);
                    double hs = hasil(alas, tinggi, tinggiP);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }

    public double
    hasil(double alas, double tinggi, double tinggiP) {
        return alas * tinggi / 2 * tinggiP;}
}