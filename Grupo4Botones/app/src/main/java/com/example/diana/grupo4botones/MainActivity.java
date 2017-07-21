package com.example.diana.grupo4botones;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //Implementar dos botones que presenten un DatePickerDialog y un TimePickerDialog respectivamente,
    // y mostrar los datos seleccionados.
    Button btnDate, btnTime;
    private int mes, año, dia, hora, minuto;
    EditText txtDate, txtTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDate =(Button)findViewById(R.id.btnDate);
        btnTime =(Button)findViewById(R.id.btnTime);
        txtDate =(EditText)findViewById(R.id.date);
        txtTime =(EditText)findViewById(R.id.time);

        btnDate.setOnClickListener(this);
        btnTime.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btnDate) {
            final Calendar c = Calendar.getInstance();
            año = c.get(Calendar.YEAR);
            mes = c.get(Calendar.MONTH);
            dia = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                            txtDate.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);
                        }
                    }, año, mes, dia);
            datePickerDialog.show();
        }

        if (v == btnTime) {
            final Calendar c = Calendar.getInstance();
            hora = c.get(Calendar.HOUR_OF_DAY);
            minuto = c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                    new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay, int minuto) {
                            txtTime.setText(hourOfDay + ":" + minuto);
                        }
                    }, hora, minuto, false);
            timePickerDialog.show();
        }
    }
}
