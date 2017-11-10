package com.luasvolume.luasdanvolume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class VolumeTabung extends AppCompatActivity {
    EditText jari, tinggi;
    Button hitung;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_tabung);

        jari = (EditText)findViewById(R.id.etJariT);
        tinggi = (EditText)findViewById(R.id.etTTabung);
        hitung = (Button)findViewById(R.id.btnHitung);
        hasil = (TextView)findViewById(R.id.tvHasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (jari.length()==0&&tinggi.length()==0){
                    Toast.makeText(getApplication(),"Tidak boleh kosong!!!",Toast.LENGTH_LONG).show();
                }
                else if (jari.length()==0){
                    Toast.makeText(getApplication(),"Jari-jari tidak boleh kosong!!!",Toast.LENGTH_LONG).show();
                }
                else if (tinggi.length() == 0) {
                    Toast.makeText(getApplication(),"Tinggi tabung tidak boleh kosong!!!",Toast.LENGTH_LONG).show();
                }
                else{
                    String jarijari = jari.getText().toString();
                    String tinggitabung = tinggi.getText().toString();
                    double jari = Double.parseDouble(jarijari);
                    double tinggi = Double.parseDouble(tinggitabung);
                    double hs = hasil(jari, tinggi);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double
    hasil(double jari, double tinggi) {
        return 3.14*jari*jari*tinggi;}
}
