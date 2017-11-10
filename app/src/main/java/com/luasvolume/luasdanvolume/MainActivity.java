package com.luasvolume.luasdanvolume;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import static com.luasvolume.luasdanvolume.R.menu.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnLuas = (Button)findViewById(R.id.btnLuas);
        Button btnVolume = (Button)findViewById(R.id.btnVolume);


        btnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),daftarBangunDatar.class);
                startActivity(i);
            }
        });
        btnVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(getApplicationContext(),daftarBangunRuang.class);
                startActivity(j);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id==R.id.action_about){
            Intent e = new Intent(this,aboutmyapp.class);
            startActivity(e);
            return true;

        }
        if (id==R.id.action_exit){
            new AlertDialog.Builder(this).setMessage("Keluar dari aplikasi ini?").setCancelable(false).setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    MainActivity.this.finish();
                }

            })
                    .setNegativeButton("Tidak",null).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
