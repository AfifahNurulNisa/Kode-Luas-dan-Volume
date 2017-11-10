package com.luasvolume.luasdanvolume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class VolumeKubus extends AppCompatActivity {
    EditText sisiK;
    Button hitung;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_kubus);

        sisiK = (EditText)findViewById(R.id.etSisiK);
        hitung = (Button)findViewById(R.id.btnHitung);
        hasil = (TextView)findViewById(R.id.tvHasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sisiK.length()==0){
                    Toast.makeText(getApplication(),"Sisi kubus tidak boleh kosong!!!",Toast.LENGTH_LONG).show();
                }
                else {
                    String isisisiK = sisiK.getText().toString();
                    double sisiK = Double.parseDouble(isisisiK);
                    double hs = hasil(sisiK, sisiK, sisiK);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double
    hasil(double k, double v, double sisiK){return sisiK*sisiK*sisiK;}
}
