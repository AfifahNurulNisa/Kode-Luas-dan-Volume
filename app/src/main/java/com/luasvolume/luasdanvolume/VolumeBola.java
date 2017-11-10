package com.luasvolume.luasdanvolume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class VolumeBola extends AppCompatActivity {
    EditText jari;
    Button hitung;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_bola);

        jari = (EditText)findViewById(R.id.etJariB);
        hitung = (Button)findViewById(R.id.btnHitung);
        hasil = (TextView)findViewById(R.id.tvHasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (jari.length()==0){
                    Toast.makeText(getApplication(),"Jari-jari tidak boleh kosong!!!",Toast.LENGTH_LONG).show();
                }
                else{
                    String isijari = jari.getText().toString();
                    double jari = Double.parseDouble(isijari);
                    double hs = hasil(jari);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double
    hasil(double jari){return 4/3*3.14*jari*jari*jari;}
}
