package com.example.eag.bicycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_formulario extends AppCompatActivity {

    TextView form_titulo;
    Spinner spinner_marca;
    RadioGroup grupo_pulgadas;
    RadioButton rb1, rb2, rb3;
    CheckBox check;
    String resultado;
    EditText edit_marca, edit_pulgadas, edit_suspension;
    String marca, pulgadas, suspension, spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        form_titulo = (TextView) findViewById(R.id.form_titulo);
        spinner_marca = (Spinner) findViewById(R.id.spinner_marca);
        grupo_pulgadas = (RadioGroup) findViewById(R.id.grupo_pulgadas);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        check = (CheckBox) findViewById(R.id.check);
        edit_marca = (EditText) findViewById(R.id.edit_marca);
        edit_pulgadas = (EditText) findViewById(R.id.edit_pulgadas);
        edit_suspension = (EditText) findViewById(R.id.edit_suspension);

        String[] opciones = {"Merida", "Mondraker"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opciones);

        spinner_marca.setAdapter(adapter);

    }

    public void buscar(View view){
        spinner = spinner_marca.getSelectedItem().toString();
        int rb = grupo_pulgadas.getCheckedRadioButtonId();
        boolean dobl = check.isChecked();

        //Asignar la marca a una variable
        if(spinner.equals("Merida") || edit_marca.getText().toString().equals("Merida")){
            marca = "Merida";

        }else if(spinner.equals("Mondraker") || edit_marca.getText().toString().equals("Mondraker")){
            marca = "Mondraker";
        }else{
            marca = null;
            Toast.makeText(this, "Error al  coger la marca", Toast.LENGTH_SHORT).show();
        }

        //Asignar las pulgadas a una variable
        if(rb == rb1.getId() || edit_pulgadas.getText().toString().equals("26")){
            pulgadas = "26";
        }else if(rb == rb2.getId() || edit_pulgadas.getText().toString().equals("27,5")){
            pulgadas = "27'5";
        }else if(rb == rb3.getId() || edit_pulgadas.getText().toString().equals("29")){
            pulgadas = "29";
        }else{
            pulgadas = null;
            Toast.makeText(this, "Error al coger las pulgadas", Toast.LENGTH_SHORT).show();
        }

        //Asignar la suspension a una variable
        if(dobl || edit_suspension.getText().toString().equals("doble")){
            suspension = "doble";
        }else{
            suspension = "rigida";
        }

        if(marca.equals("Merida") && pulgadas.equals("26") && suspension.equals("doble")){
            resultado = "merida_doble_26";
        }
        else if(marca.equals("Merida") && pulgadas.equals("27'5") && suspension.equals("doble")){
            resultado = "merida_doble_27_5";
        }
        else if(marca.equals("Merida") && pulgadas.equals("29") && suspension.equals("doble")){
            resultado = "merida_doble_29";
        }
        else if(marca.equals("Merida") && pulgadas.equals("26") && suspension.equals("rigida")){
            resultado = "merida_rigida_26";
        }
        else if(marca.equals("Merida") && pulgadas.equals("27'5") && suspension.equals("rigida")){
            resultado = "merida_rigida_27_5";
        }
        else if(marca.equals("Merida") && pulgadas.equals("29") && suspension.equals("rigida")){
            resultado = "merida_rigida_29";
        }
        else if(marca.equals("Mondraker") && pulgadas.equals("27'5") && suspension.equals("doble")){
            resultado = "mon_doble_27_5";
        }
        else if(marca.equals("Mondraker") && pulgadas.equals("29") && suspension.equals("doble")){
            resultado = "mon_doble_29";
        }
        else if(marca.equals("Mondraker") && pulgadas.equals("27'5") && suspension.equals("rigida")){
            resultado = "mon_27_5";
        }
        else if(marca.equals("Mondraker") && pulgadas.equals("29") && suspension.equals("rigida")){
            resultado = "mon_rigida_29";
        }
        else {
            resultado = "No se ha encontrado la bicicleta";
        }


        Intent i = new Intent(this, Activity_BDBicis.class);

        if(resultado != null ) {
            i.putExtra("result", resultado);
        }
        if(marca != null) {
            i.putExtra("marca", marca);
        }
        if(pulgadas != null) {
            i.putExtra("pulgadas", pulgadas);
        }
        if(suspension != null){
            i.putExtra("suspension", suspension);
        }



        startActivity(i);
    }
}
