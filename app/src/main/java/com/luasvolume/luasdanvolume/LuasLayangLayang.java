package com.luasvolume.luasdanvolume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LuasLayangLayang extends AppCompatActivity {

    EditText DA,DB;
    Button hitung;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_layang_layang);

        final EditText DA = (EditText)findViewById(R.id.etDA);
        final EditText DB = (EditText)findViewById(R.id.etDB);
        Button hitung = (Button)findViewById(R.id.btnHitung);
        final TextView hasil = (TextView)findViewById(R.id.tvHasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (DA.length()==0&&DB.length()==0){
                    Toast.makeText(getApplicationContext(),"Masukkan Panjang Diagonal!!",Toast.LENGTH_LONG).show();
                }
                else if (DA.length()==0){
                    Toast.makeText(getApplicationContext(),"Masukkan Diagonal A!!",Toast.LENGTH_LONG).show();
                }
                else if (DB.length()==0){
                    Toast.makeText(getApplicationContext(),"Masukkan Diagonal B!!",Toast.LENGTH_LONG).show();
                }
                else {
                    String isiDA = DA.getText().toString();
                    String isiDB = DB.getText().toString();
                    double DA = Double.parseDouble(isiDA);
                    double DB = Double.parseDouble(isiDB);
                    double hs = hasil(DA, DB);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double
    hasil(double DA, double DB){return DA*DB/2;}
}
