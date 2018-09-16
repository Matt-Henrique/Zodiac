package com.mateus.zodiac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner_days = null;
    private Spinner spinner_months = null;

    private void validateDate() {
        int dia = spinner_days.getSelectedItemPosition() + 1;
        int mes = spinner_months.getSelectedItemPosition() + 1;
        if (dia > 29 && mes == 2) {
            spinner_days.setSelection(28);
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 30)) {
            spinner_days.setSelection(29);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner_days = findViewById(R.id.spinner_days);
        spinner_months = findViewById(R.id.spinner_months);

        ArrayAdapter<CharSequence> adapter_dia = ArrayAdapter.createFromResource(
                this, R.array.days, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_mes = ArrayAdapter.createFromResource(
                this, R.array.months, android.R.layout.simple_spinner_item);

        adapter_dia.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_mes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner_days.setAdapter(adapter_dia);
        spinner_months.setAdapter(adapter_mes);

        spinner_days.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                validateDate();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner_months.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                validateDate();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Button send = findViewById(R.id.btn_submit);

        send.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                int dayPosition = spinner_days.getSelectedItemPosition() + 1;
                int monthPosition = spinner_months.getSelectedItemPosition() + 1;
                Interpreter Interpreter = new Interpreter();
                Sign signResult = Interpreter.interpret(dayPosition, monthPosition);
                Bundle args = new Bundle();
                args.putSerializable("result", signResult);
                Intent intent = new Intent(MainActivity.this, Result.class);
                intent.putExtra("sign", args);
                startActivity(intent);
            }
        });
    }
}
