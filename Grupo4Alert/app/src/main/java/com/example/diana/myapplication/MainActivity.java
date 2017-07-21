package com.example.diana.myapplication;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;


//Crear un AlertDialog que contenga una lista y muestre en pantalla un texto con el objeto seleccionado.
//Referencia = http://www.bipinrupadiya.com/2013/08/android-alertdialog-with.html

//Implementar dos botones que presenten un DatePickerDialog
// y un TimePickerDialog respectivamente, y mostrar los datos seleccionados.
public class MainActivity extends AppCompatActivity {

    Button btnDate, btnTime;
    EditText txtDate, txtTime;
    private int año, mes, dia, hora, minute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CharSequence listaElementos[] = {"Guayaquil", "Quito", "Cuenca"};
        final ArrayList<Integer> mSelectedItems = new ArrayList();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Lista de Ciudades");
        builder.setMultiChoiceItems(listaElementos, null,
                new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which,
                                        boolean isChecked) {
                        if (isChecked) {
                            // If the user checked the item, add it to the selected items
                            mSelectedItems.add(which);
                            Toast.makeText(getApplicationContext(),
                                    "Item Seleccionado  " + mSelectedItems.size(), Toast.LENGTH_LONG).show();
                        } else if (mSelectedItems.contains(which)) {
                            // Else, if the item is already in the array, remove it
                            mSelectedItems.remove(Integer.valueOf(which));
                        }
                    }
                });
        builder.create();
        builder.show();

    }
}

