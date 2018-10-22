package com.example.user.ex211018;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder adb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void message(View view) {
        adb=new AlertDialog.Builder(this);

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

        AlertDialog ad=adb.create();
        ad.show();
    }

    public void iconbuttonmessage(View view) {
        adb=new AlertDialog.Builder(this);

        AlertDialog ad=adb.create();
        ad.show();
    }

    public void bgchange1(View view) {
        adb=new AlertDialog.Builder(this);

        AlertDialog ad=adb.create();
        ad.show();
    }

    public void bgchange2(View view) {
        adb=new AlertDialog.Builder(this);

        AlertDialog ad=adb.create();
        ad.show();
    }
}
