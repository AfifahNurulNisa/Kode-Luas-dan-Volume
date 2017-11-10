package com.luasvolume.luasdanvolume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class VolumeBalok extends AppCompatActivity {
    EditText panjang, lebar, tinggi;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_balok);

        panjang = (EditText)findViewById(R.id.etPanjangBalok);
        lebar = (EditText)findViewById(R.id.etLebarBalok);
        tinggi = (EditText)findViewById(R.id.etTinggiBalok);
        hitung = (Button)findViewById(R.id.btnHitung);
        hasil = (TextView)findViewById(R.id.tvHasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (panjang.length()==0&&lebar.length()==0&&tinggi.length()==0){
                    Toast.makeText(getApplication(),"Tidak boleh kosong!!!",Toast.LENGTH_LONG).show();
                }
                else if (panjang.length()==0){
                    Toast.makeText(getApplication(),"Panjang tidak boleh kosong!!!",Toast.LENGTH_LONG).show();
                }
                else if (lebar.length()==0){
                    Toast.makeText(getApplication(),"Lebar tidak boleh kosong!!!",Toast.LENGTH_LONG).show();
                }
                else if (tinggi.length()==0){
                    Toast.makeText(getApplication(),"Tinggi tidak boleh kosong!!!",Toast.LENGTH_LONG).show();
                }
                else {
                    String panjangB = panjang.getText().toString();
                    String lebarB = lebar.getText().toString();
                    String tinggiB = tinggi.getText().toString();
                    double panjang = Double.parseDouble(panjangB);
                    double lebar = Double.parseDouble(lebarB);
                    double tinggi = Double.parseDouble(tinggiB);
                    double hs = hasil(panjang, lebar, tinggi);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double
    hasil(double panjang, double lebar, double tinggi ){return panjang*lebar*tinggi;}
}
