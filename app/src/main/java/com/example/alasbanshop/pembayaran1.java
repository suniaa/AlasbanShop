package com.example.alasbanshop;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class pembayaran1 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pembayaran);


    }

    public void ShowDialog(View view){
        String key = getIntent().getStringExtra("key");
        String diamond = getIntent().getStringExtra("diamond");
        String idgame = getIntent().getStringExtra("idinputgame");
        int total = getIntent().getExtras().getInt("harga");
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Pembayaran BANK BNI")
                .setMessage("Anda Membeli "+diamond+" UC"+" Dengan ID Game "+idgame+" Dari Game "+key+" Silahkan Transfer Melaui BNI VIRTUAL ACCOUNT 12345 Dengan nominal "+total)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setPositiveButton("Tutup", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
        //.setCancelable(false);
        alert.show();
    }

    public void ShowDialog1(View view){
        String key = getIntent().getStringExtra("key");
        String diamond = getIntent().getStringExtra("diamond");
        int total = getIntent().getExtras().getInt("harga");
        String idgame = getIntent().getStringExtra("idinputgame");

        AlertDialog.Builder alert = new AlertDialog.Builder(this);

        alert.setTitle("Pembayaran BANK BCA")
                .setMessage("Anda Membeli "+diamond+" UC"+" Dengan ID Game "+idgame+" Dari Game "+key+" Silahkan Transfer Melaui BNI VIRTUAL ACCOUNT BCA12345 Dengan nominal "+total)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setPositiveButton("Tutup", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
        //.setCancelable(false);
        alert.show();
    }

    public void ShowDialog2(View view){
        String key = getIntent().getStringExtra("key");
        String diamond = getIntent().getStringExtra("diamond");
        int total = getIntent().getExtras().getInt("harga");
        String idgame = getIntent().getStringExtra("idinputgame");

        AlertDialog.Builder alert = new AlertDialog.Builder(this);

        alert.setTitle("Pembayaran BANK BRI")
                .setMessage("Anda Membeli "+diamond+" UC"+" Dengan ID Game "+idgame+" Dari Game "+key+" Silahkan Transfer Melaui BRI VIRTUAL ACCOUNT BRI12345 Dengan nominal "+total)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setPositiveButton("Tutup", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
        //.setCancelable(false);
        alert.show();
    }

    public void ShowDialog3(View view){
        String key = getIntent().getStringExtra("key");
        String diamond = getIntent().getStringExtra("diamond");
        int total = getIntent().getExtras().getInt("harga");
        String idgame = getIntent().getStringExtra("idinputgame");

        AlertDialog.Builder alert = new AlertDialog.Builder(this);

        alert.setTitle("Pembayaran BANK MANDIRI")
                .setMessage("Anda Membeli "+diamond+" UC"+" Dengan ID Game "+idgame+" Dari Game "+key+" Silahkan Transfer Melaui MANDIRI VIRTUAL ACCOUNT MANDIRI12345 Dengan nominal "+total)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setPositiveButton("Tutup", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
        //.setCancelable(false);
        alert.show();
    }


    @Override
    public void onClick(View view) {

    }
}
