package com.example.alasbanshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;


public class diamond extends AppCompatActivity implements View.OnClickListener {

    String idgame;
    EditText idgameinput;
    ArrayList diamond = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diamond);
        diamond.add(6);
        diamond.add(11);
        diamond.add(14);
        diamond.add(36);
        diamond.add(220);
        diamond.add(366);
        diamond.add(966);
        diamond.add(19);
        diamond.add(74);
        diamond.add(275);
        diamond.add(568);
        diamond.add(2010);

        Button one = (Button) findViewById(R.id.button6);
        one.setOnClickListener(this); // calling onClick() method
        Button two = (Button) findViewById(R.id.button7);
        two.setOnClickListener(this);
        Button three = (Button) findViewById(R.id.button8);
        three.setOnClickListener(this);
        Button four = (Button) findViewById(R.id.button9);
        four.setOnClickListener(this);
        Button five = (Button) findViewById(R.id.button10);
        five.setOnClickListener(this);
        Button six = (Button) findViewById(R.id.button11);
        six.setOnClickListener(this);
        Button seven = (Button) findViewById(R.id.button12);
        seven.setOnClickListener(this);
        Button eight = (Button) findViewById(R.id.button13);
        eight.setOnClickListener(this);
        Button nine = (Button) findViewById(R.id.button14);
        nine.setOnClickListener(this);
        Button ten = (Button) findViewById(R.id.button15);
        ten.setOnClickListener(this);
        Button eleven = (Button) findViewById(R.id.button16);
        eleven.setOnClickListener(this);

        idgameinput = (EditText) findViewById(R.id.idgameinput);
    }


    public void showPembayaran(View view) {
        idgame = idgameinput.getText().toString();
        String inputidgame = idgame;
        String key = getIntent().getStringExtra("key");
        Toast.makeText(this, "Kamu memilih "+key+" ID game kamu adalah "+inputidgame+" Demgam Jumlah "+diamond.get(1)+" Diamond Seharga "+110000, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(diamond.this, pembayaran.class);
        intent.putExtra("idinputgame", String.valueOf(idgame));
        intent.putExtra("diamond", String.valueOf(diamond.get(0)));
        intent.putExtra("harga", 60000);
        intent.putExtra("key",key);
        startActivity(intent);
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.button6:
                // do your code
                String key = getIntent().getStringExtra("key");
                idgame = idgameinput.getText().toString();
                String inputidgame = idgame;
                Toast.makeText(this, "Kamu memilih "+key+" ID game kamu adalah "+inputidgame+" Demgam Jumlah "+diamond.get(1)+" Diamond Seharga "+110000, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(diamond.this, pembayaran.class);
                intent.putExtra("idinputgame", String.valueOf(idgame));
                intent.putExtra("diamond", String.valueOf(diamond.get(1)));
                intent.putExtra("harga", 110000);
                intent.putExtra("key",key);
                startActivity(intent);
                break;

            case R.id.button7:
                // do your code
                key = getIntent().getStringExtra("key");
                idgame = idgameinput.getText().toString();
                String inputidgame1 = idgame;
                Toast.makeText(this, "Kamu memilih "+key+" ID game kamu adalah "+inputidgame1+" Demgam Jumlah "+diamond.get(1)+" Diamond Seharga "+110000, Toast.LENGTH_SHORT).show();
                intent = new  Intent(diamond.this, pembayaran.class);
                intent.putExtra("idinputgame", String.valueOf(idgame));
                intent.putExtra("diamond", String.valueOf(diamond.get(2)));
                intent.putExtra("int",140000 );
                intent.putExtra("harga", 140000);
                intent.putExtra("key",key);
                startActivity(intent);
                break;

            case R.id.button8:
                // do your code
                key = getIntent().getStringExtra("key");
                idgame = idgameinput.getText().toString();
                String inputidgame2 = idgame;
                Toast.makeText(this, "Kamu memilih "+key+"ID game kamu adalah "+inputidgame2+" Demgam Jumlah "+diamond.get(1)+" Diamond Seharga "+110000, Toast.LENGTH_SHORT).show();
                intent = new  Intent(diamond.this, pembayaran.class);
                intent.putExtra("idinputgame", String.valueOf(idgame));
                intent.putExtra("diamond", String.valueOf(diamond.get(3)));
                intent.putExtra("int",360000 );
                intent.putExtra("harga", 360000);
                intent.putExtra("key",key);
                startActivity(intent);
                break;

            case R.id.button9:
                // do your code
                key = getIntent().getStringExtra("key");
                idgame = idgameinput.getText().toString();
                String inputidgame3 = idgame;
                Toast.makeText(this, "Kamu memilih "+key+" ID game kamu adalah "+inputidgame3+" Demgam Jumlah "+diamond.get(1)+" Diamond Seharga "+110000, Toast.LENGTH_SHORT).show();
                intent = new  Intent(diamond.this, pembayaran.class);
                intent.putExtra("idinputgame", String.valueOf(idgame));
                intent.putExtra("diamond", String.valueOf(diamond.get(4)));
                intent.putExtra("int",360000 );
                intent.putExtra("harga", 2200000);
                intent.putExtra("key",key);
                startActivity(intent);
                break;

            case R.id.button10:
                // do your code
                key = getIntent().getStringExtra("key");
                idgame = idgameinput.getText().toString();
                String inputidgame4 = idgame;
                Toast.makeText(this, "Kamu memilih "+key+" ID game kamu adalah "+inputidgame4+" Demgam Jumlah "+diamond.get(1)+" Diamond Seharga "+110000, Toast.LENGTH_SHORT).show();
                intent = new  Intent(diamond.this, pembayaran.class);
                intent.putExtra("idinputgame", String.valueOf(idgame));
                intent.putExtra("diamond", String.valueOf(diamond.get(5)));
                intent.putExtra("int",360000 );
                intent.putExtra("harga", 3600000);
                intent.putExtra("key",key);
                startActivity(intent);
                break;

            case R.id.button11:
                // do your code
                key = getIntent().getStringExtra("key");
                idgame = idgameinput.getText().toString();
                String inputidgame5 = idgame;
                Toast.makeText(this, "Kamu memilih "+key+" ID game kamu adalah "+inputidgame5+" Demgam Jumlah "+diamond.get(1)+" Diamond Seharga "+110000, Toast.LENGTH_SHORT).show();
                intent = new  Intent(diamond.this, pembayaran.class);
                intent.putExtra("idinputgame", String.valueOf(idgame));
                intent.putExtra("diamond", String.valueOf(diamond.get(6)));
                intent.putExtra("int",360000 );
                intent.putExtra("harga", 9660000);
                intent.putExtra("key",key);
                startActivity(intent);
                break;

            case R.id.button12:
                // do your code
                key = getIntent().getStringExtra("key");
                idgame = idgameinput.getText().toString();
                String inputidgame6 = idgame;
                Toast.makeText(this, "Kamu memilih "+key+" ID game kamu adalah "+inputidgame6+" Demgam Jumlah "+diamond.get(1)+" Diamond Seharga "+110000, Toast.LENGTH_SHORT).show();
                intent = new  Intent(diamond.this, pembayaran.class);
                intent.putExtra("idinputgame", String.valueOf(idgame));
                intent.putExtra("diamond", String.valueOf(diamond.get(7)));
                intent.putExtra("int",360000 );
                intent.putExtra("harga", 190000);
                intent.putExtra("key",key);
                startActivity(intent);
                break;

            case R.id.button13:
                // do your code
                key = getIntent().getStringExtra("key");
                idgame = idgameinput.getText().toString();
                String inputidgame7 = idgame;
                Toast.makeText(this, "Kamu memilih "+key+" ID game kamu adalah "+inputidgame7+" Demgam Jumlah "+diamond.get(1)+" Diamond Seharga "+110000, Toast.LENGTH_SHORT).show();
                intent = new Intent(diamond.this, pembayaran.class);
                intent.putExtra("idinputgame", String.valueOf(idgame));
                intent.putExtra("diamond", String.valueOf(diamond.get(8)));
                intent.putExtra("int",360000 );
                intent.putExtra("harga", 740000);
                intent.putExtra("key",key);
                startActivity(intent);
                break;

            case R.id.button14:
                // do your code
                key = getIntent().getStringExtra("key");
                idgame = idgameinput.getText().toString();
                String inputidgame8 = idgame;
                Toast.makeText(this, "Kamu memilih "+key+" ID game kamu adalah "+inputidgame8+" Demgam Jumlah "+diamond.get(1)+" Diamond Seharga "+110000, Toast.LENGTH_SHORT).show();
                intent = new  Intent(diamond.this, pembayaran.class);
                intent.putExtra("idinputgame", String.valueOf(idgame));
                intent.putExtra("diamond", String.valueOf(diamond.get(9)));
                intent.putExtra("int",360000 );
                intent.putExtra("harga", 275000);
                intent.putExtra("key",key);
                startActivity(intent);
                break;

            case R.id.button15:
                // do your code
                key = getIntent().getStringExtra("key");
                idgame = idgameinput.getText().toString();
                String inputidgame9 = idgame;
                Toast.makeText(this, "Kamu memilih "+key+" ID game kamu adalah "+inputidgame9+" Demgam Jumlah "+diamond.get(1)+" Diamond Seharga "+110000, Toast.LENGTH_SHORT).show();
                intent = new  Intent(diamond.this, pembayaran.class);
                intent.putExtra("idinputgame", String.valueOf(idgame));
                intent.putExtra("diamond", String.valueOf(diamond.get(10)));
                intent.putExtra("int",360000 );
                intent.putExtra("harga", 568000);
                intent.putExtra("key",key);
                startActivity(intent);
                break;

            case R.id.button16:
                // do your code
                key = getIntent().getStringExtra("key");
                idgame = idgameinput.getText().toString();
                String inputidgame10 = idgame;
                Toast.makeText(this, "Kamu memilih "+key+" ID game kamu adalah "+inputidgame10+" Demgam Jumlah "+diamond.get(1)+" Diamond Seharga "+110000, Toast.LENGTH_SHORT).show();
                intent = new  Intent(diamond.this, pembayaran.class);
                intent.putExtra("idinputgame", String.valueOf(idgame));
                intent.putExtra("diamond", String.valueOf(diamond.get(11)));
                intent.putExtra("int",360000 );
                intent.putExtra("harga", 20100000);
                intent.putExtra("key",key);
                startActivity(intent);
                break;

            default:
                break;
        }

    }




    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
