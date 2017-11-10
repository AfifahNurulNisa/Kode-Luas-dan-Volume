package com.luasvolume.luasdanvolume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class VolumeKerucut extends AppCompatActivity {
    EditText jari,  tinggiK;
    Button hitung;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_kerucut);

        jari = (EditText)findViewById(R.id.etJariK);
        tinggiK = (EditText)findViewById(R.id.etTKerucut);
        hitung = (Button)findViewById(R.id.btnHitung);
        hasil = (TextView)findViewById(R.id.tvHasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (jari.length()==0&&tinggiK.length()==0){
                    Toast.makeText(getApplication(),"Jari-jari dan tinggi tidak boleh kosong!!!",Toast.LENGTH_LONG).show();
                }
                else if (jari.length()==0){
                    Toast.makeText(getApplication(),"Masukkan jari-jari!!!",Toast.LENGTH_LONG).show();
                }
                else if (tinggiK.length()==0){
                    Toast.makeText(getApplication(),"Masukkan tinggi kerucut!!!",Toast.LENGTH_LONG).show();
                }
                else {
                    String jarijari = jari.getText().toString();
                    String tinggikerucut = tinggiK.getText().toString();
                    double jari = Double.parseDouble(jarijari);
                    double tinggiK = Double.parseDouble(tinggikerucut);
                    double hs = hasil(jari, tinggiK);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double
    hasil(double jari, double tinggiK) {
        return 3.14*jari*jari*tinggiK*1/3;}
}
