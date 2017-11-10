package com.luasvolume.luasdanvolume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LuasPersegiPanjang extends AppCompatActivity {
    //global variable
    EditText panjang, lebar;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi_panjang);
        panjang = (EditText) findViewById(R.id.etPanjang);
        lebar = (EditText) findViewById(R.id.etLebar);
        hitung = (Button) findViewById(R.id.btnHitung);
        hasil = (TextView) findViewById(R.id.tvHasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (panjang.length() == 0 && lebar.length() == 0) {
                    Toast.makeText(getApplication(), "Masukkan panjang dan lebar!!!", Toast.LENGTH_LONG).show();
                } else if (lebar.length() == 0) {
                    Toast.makeText(getApplication(), "Lebar tidak boleh kosong!!!", Toast.LENGTH_LONG).show();
                } else if (panjang.length() == 0) {
                    Toast.makeText(getApplication(), "Panjang tidak boleh!!!", Toast.LENGTH_LONG).show();
                } else {
                    String isipanjang = panjang.getText().toString();
                    String isilebar = lebar.getText().toString();
                    double panjang = Double.parseDouble(isipanjang);
                    double lebar = Double.parseDouble(isilebar);
                    double hs = hasil(panjang, lebar);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }

            }
        });
    }
    public double
    hasil(double panjang, double lebar){return panjang*lebar;}
}
