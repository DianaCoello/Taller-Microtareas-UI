package com.example.diana.grupo3menu;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    CheckBox cBox;
    TextView textView;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) findViewById(R.id.btnmenu);
        registerForContextMenu(boton);
        textView = (TextView) findViewById(R.id.textView);
        cBox = (CheckBox) findViewById(R.id.chbExtMenu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        menu.add(0, 7, 0, "--------Group----------");
        menu.add(0, 1, 0, "Añadir");
        menu.add(0, 2, 0, "Editar");
        menu.add(0, 3, 3, "Borrar");
        menu.add(1, 4, 1, "Copiar");
        menu.add(1, 5, 2, "Pegar");
        menu.add(1, 6, 4, "Guardar");
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.setGroupVisible(1, cBox.isChecked());
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        StringBuilder sb = new StringBuilder();

        // print the info about pressed menu item
        sb.append("Item Menu");
        sb.append("\r\n GroupId: " + String.valueOf(item.getGroupId()));
        sb.append("\r\n ItemId: " + String.valueOf(item.getItemId()));
        sb.append("\r\n Order: " + String.valueOf(item.getOrder()));
        sb.append("\r\n Title: " + item.getTitle());
        textView.setText(sb.toString());

        switch (item.getItemId()) {
            case R.id.opcion1:
                Toast.makeText(
                        MainActivity.this
                        ,"Ha seleccionado la Opción 1"
                        ,Toast.LENGTH_LONG)
                        .show();
                return true;
            case R.id.opcion2:
                finish();
                return true;

            case R.id.opcion3:
                Toast.makeText(
                        MainActivity.this
                        ,"Ha seleccionado el Submenú"
                        ,Toast.LENGTH_LONG)
                        .show();
                return true;
            case R.id.opcion31:
                Toast.makeText(
                        MainActivity.this
                        ,"Ha seleccionado el Submenú 1"
                        ,Toast.LENGTH_LONG)
                        .show();
                return true;
            case R.id.opcion32:
                Toast.makeText(
                        MainActivity.this
                        ,"Ha seleccionado el Submenú 2"
                        ,Toast.LENGTH_LONG)
                        .show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.opcion1:
                Toast.makeText(
                        MainActivity.this
                        ,"Ha seleccionado la Opción 1"
                        ,Toast.LENGTH_LONG)
                        .show();
                return true;
            case R.id.opcion2:
                finish();
                return true;

            case R.id.opcion3:
                Toast.makeText(
                        MainActivity.this
                        ,"Ha seleccionado el Submenú"
                        ,Toast.LENGTH_LONG)
                        .show();
                return true;
            case R.id.opcion31:
                Toast.makeText(
                        MainActivity.this
                        ,"Ha seleccionado el Submenú 1"
                        ,Toast.LENGTH_LONG)
                        .show();
                return true;
            case R.id.opcion32:
                Toast.makeText(
                        MainActivity.this
                        ,"Ha seleccionado el Submenú 2"
                        ,Toast.LENGTH_LONG)
                        .show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }





}
