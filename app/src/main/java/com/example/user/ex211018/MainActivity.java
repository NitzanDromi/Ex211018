package com.example.user.ex211018;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder adb;
    LinearLayout bg;
    Random rnd=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bg=(LinearLayout)findViewById(R.id.llbg);
    }

    public void message(View view) {
        adb=new AlertDialog.Builder(this);
        adb.setTitle("#1");
        adb.setMessage("This is a simple alert");
        AlertDialog ad=adb.create();
        ad.show();
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if (id==R.id.menucreds){
            Intent t=new Intent(this, CredsActivity.class);
            startActivity(t);
        }
        return super.onOptionsItemSelected(item);
    }
    public void icon(View view) {
        adb=new AlertDialog.Builder(this);
        adb.setTitle("#2");
        adb.setMessage("This is a simple alert with an icon");
        adb.setIcon(R.drawable.view01);
        AlertDialog ad=adb.create();
        ad.show();
    }

    public void iconbuttonmessage(View view) {
        adb=new AlertDialog.Builder(this);
        adb.setTitle("#3");
        adb.setMessage("This is a one button's alert");
        adb.setIcon(R.drawable.view01);
        adb.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        AlertDialog ad=adb.create();
        ad.show();
    }

    public void bgchange1(View view) {
        adb=new AlertDialog.Builder(this);
        adb.setTitle("#4");
        adb.setMessage("if you want to change the background of this app, press the OK button, else, press the closing button");
        adb.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                bg.setBackgroundColor(Color.argb(255,rnd.nextInt(256),rnd.nextInt(256),(rnd.nextInt(256))));
            }
        });
        adb.setNegativeButton("close", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog ad=adb.create();
        ad.show();
    }

    public void bgchange2(View view) {
        adb=new AlertDialog.Builder(this);
        adb.setTitle("#5");
        adb.setMessage("if you want to change the background of this app, press the OK button. if you want to return it to white return the WHITE button");
        adb.setNegativeButton("close", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        adb.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                bg.setBackgroundColor(Color.argb(255,rnd.nextInt(256),rnd.nextInt(256),(rnd.nextInt(256))));
            }
        });

        adb.setNeutralButton("return to white", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                bg.setBackgroundColor(Color.WHITE);
            }
        });
        AlertDialog ad=adb.create();
        ad.show();
    }
}
