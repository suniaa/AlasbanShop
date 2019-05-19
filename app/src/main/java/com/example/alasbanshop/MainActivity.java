package com.example.alasbanshop;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList game = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // list.addAll(Game.getListData());
        game.add("Mobile Legends");
        game.add("Free Fire");
        game.add("PUBG");
        game.add("Ragnarok Online");
        game.add("Arena Ov Valor");
        game.add("Speed Drifters");
        game.add("MU Origin");
        game.add("Hago");
        game.add("Legacy Of Discord");
    }


    public void showDiamond(View view) {

        Toast.makeText(this, "Kamu memilih "+ game.get(0), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, diamond.class);
        intent.putExtra("key", String.valueOf(game.get(0)));
        startActivity(intent);
    }

    public void showDiamond1(View view) {

        Toast.makeText(this, "Kamu memilih "+ game.get(1), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, diamond.class);
        intent.putExtra("key", String.valueOf(game.get(1)));
        startActivity(intent);
    }

    public void showDiamond2(View view) {

        Toast.makeText(this, "Kamu memilih "+ game.get(2), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, pubgm.class);
        intent.putExtra("key", String.valueOf(game.get(2)));
        startActivity(intent);
    }

    public void showDiamond3(View view) {

        Toast.makeText(this, "Kamu memilih "+ game.get(3), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, diamond.class);
        intent.putExtra("key", String.valueOf(game.get(3)));
        startActivity(intent);
    }

    public void showDiamond4(View view) {

        Toast.makeText(this, "Kamu memilih "+ game.get(4), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, diamond.class);
        intent.putExtra("key", String.valueOf(game.get(4)));
        startActivity(intent);
    }

    public void showDiamond5(View view) {

        Toast.makeText(this, "Kamu memilih "+ game.get(5), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, diamond.class);
        intent.putExtra("key", String.valueOf(game.get(5)));
        startActivity(intent);
    }

    public void showDiamond6(View view) {

        Toast.makeText(this, "Kamu memilih "+ game.get(6), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, diamond.class);
        intent.putExtra("key", String.valueOf(game.get(6)));
        startActivity(intent);
    }

    public void showDiamond7(View view) {

        Toast.makeText(this, "Kamu memilih "+ game.get(7), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, diamond.class);
        intent.putExtra("key", String.valueOf(game.get(7)));
        startActivity(intent);
    }

    public void showDiamond8(View view) {

        Toast.makeText(this, "Kamu memilih "+ game.get(8), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, diamond.class);
        intent.putExtra("key", String.valueOf(game.get(8)));
        startActivity(intent);
    }


}
