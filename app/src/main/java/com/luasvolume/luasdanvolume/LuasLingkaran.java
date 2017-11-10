package com.luasvolume.luasdanvolume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LuasLingkaran extends AppCompatActivity {
    //global variable
    EditText jarijari;
    Button hitung;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_lingkaran);

        final EditText jarijari = (EditText)findViewById(R.id.etJarijari);
        Button hitung = (Button)findViewById(R.id.btnHitung);
        final TextView hasil = (TextView)findViewById(R.id.tvHasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (jarijari.length()==0){
                    Toast.makeText(getApplication(),"Jari-jari tidak boleh kosong!!!",Toast.LENGTH_LONG).show();
                }
                else {
                    String isijari = jarijari.getText().toString();
                    double jarijari = Double.parseDouble(isijari);
                    double hs = hasil(jarijari);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }

            }
        });
    }
    public double
    hasil(double jarijari){return 3.14*jarijari*jarijari;}
    }

