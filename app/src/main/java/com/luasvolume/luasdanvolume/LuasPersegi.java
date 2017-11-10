package com.luasvolume.luasdanvolume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LuasPersegi extends AppCompatActivity {

    EditText sisi;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi);

        sisi = (EditText)findViewById(R.id.etSisi);
        hitung = (Button)findViewById(R.id.btnHitung);
        hasil = (TextView)findViewById(R.id.tvHasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sisi.length()==0){
                    Toast.makeText(getApplication(),"Sisi tidak boleh kosong!!!",Toast.LENGTH_LONG).show();
                }
                else {
                    String isisisi = sisi.getText().toString();
                    double sisi = Double.parseDouble(isisisi);
                    double hs = hasil(sisi, sisi);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double
    hasil(double v, double sisi){return sisi*sisi;}
}
