package com.example.eag.bicycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_BDBicis extends AppCompatActivity {

    ImageView mer_r_26, mer_r_27, mer_r_29, mer_d_26, mer_d_27, mer_d_29, mon_r_27, mon_r_29, mon_d_27, mon_d_29;

    TextView marca_2, pulgadas_2, suspension_2, cambio_2, mandos_2, peso_2;
    String resultado, marc, susp, pulg;
    String cambio, mandos, peso;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__bdbicis);

        marca_2 = (TextView) findViewById(R.id.marca_2);
        pulgadas_2 = (TextView) findViewById(R.id.pulgadas_2);
        suspension_2 = (TextView) findViewById(R.id.suspension_2);
        cambio_2 = (TextView) findViewById(R.id.cambio_2);
        mandos_2 = (TextView) findViewById(R.id.mandos_2);
        peso_2 = (TextView) findViewById(R.id.peso_2);
        mer_r_26 = (ImageView) findViewById(R.id.mer_r_26);
        mer_r_27 = (ImageView) findViewById(R.id.mer_r_27);
        mer_r_29 = (ImageView) findViewById(R.id.mer_r_29);
        mer_d_26 = (ImageView) findViewById(R.id.mer_d_26);
        mer_d_27 = (ImageView) findViewById(R.id.mer_d_27);
        mer_d_29 = (ImageView) findViewById(R.id.mer_d_29);
        mon_r_27 = (ImageView) findViewById(R.id.mon_r_27);
        mer_r_29 = (ImageView) findViewById(R.id.mon_r_29);
        mon_d_27 = (ImageView) findViewById(R.id.mon_d_27);
        mon_d_29 = (ImageView) findViewById(R.id.mon_d_29);

        resultado = getIntent().getStringExtra("result");
        marc = getIntent().getStringExtra("marca");
        susp = getIntent().getStringExtra("suspension");
        pulg = getIntent().getStringExtra("pulgadas");

        switch (resultado){
            case "merida_doble_26":
                mer_d_26.setVisibility(View.VISIBLE);
                marca_2.setText("Merida");
                pulgadas_2.setText("26");
                suspension_2.setText("doble");
                cambio_2.setText("Shimano Deore");
                mandos_2.setText("Shimano Deore");
                peso_2.setText("12,500kg");
                break;
            case "merida_doble_27_5":
                mer_d_27.setVisibility(View.VISIBLE);
                marca_2.setText("Merida");
                pulgadas_2.setText("27'5");
                suspension_2.setText("doble");
                cambio_2.setText("Sram NX Eagle");
                mandos_2.setText("Sram NX Eagle");
                peso_2.setText("11,400kg");
                break;
            case "merida_doble_29":
                mer_d_29.setVisibility(View.VISIBLE);
                marca_2.setText("Merida");
                pulgadas_2.setText("29");
                suspension_2.setText("doble");
                cambio_2.setText("Sram XX1 Eagle");
                mandos_2.setText("Sram XX1 Eagle");
                peso_2.setText("10,200kg");
                break;
            case "merida_rigida_26":
                mer_r_26.setVisibility(View.VISIBLE);
                marca_2.setText("Merida");
                pulgadas_2.setText("26");
                suspension_2.setText("rigida");
                cambio_2.setText("Shimano Altus");
                mandos_2.setText("Shimano Altus");
                peso_2.setText("12,200kg");
                break;
            case "merida_rigida_27_5":
                mer_r_27.setVisibility(View.VISIBLE);
                marca_2.setText("Merida");
                pulgadas_2.setText("27'5");
                suspension_2.setText("rigida");
                cambio_2.setText("Shimano XT Shadow");
                mandos_2.setText("Shimano Deore");
                peso_2.setText("12,200kg");
                break;
            case "merdia_rigida_29":
                mer_r_29.setVisibility(View.VISIBLE);
                marca_2.setText("Merida");
                pulgadas_2.setText("29");
                suspension_2.setText("rigida");
                cambio_2.setText("SRAM XX1 Eagle");
                mandos_2.setText("SRAM XX1 Eagle");
                peso_2.setText("8,700kg");
                break;
            case "mon_doble_27_5":
                mon_d_27.setVisibility(View.VISIBLE);
                marca_2.setText("Mondraker");
                pulgadas_2.setText("27'5");
                suspension_2.setText("doble");
                cambio_2.setText("SRAM X01 Eagle");
                mandos_2.setText("SRAM Trigger Eagle");
                peso_2.setText("12,200kg");
                break;
            case "mon_doble_29":
                mon_d_29.setVisibility(View.VISIBLE);
                marca_2.setText("Mondraker");
                pulgadas_2.setText("29");
                suspension_2.setText("doble");
                cambio_2.setText("SRAM XX1 Eagle");
                mandos_2.setText("SRAM XX1 Eagle");
                peso_2.setText("11,500kg");
                break;
            case "mon_rigida_27_5":
                mon_r_27.setVisibility(View.VISIBLE);
                marca_2.setText("Mondraker");
                pulgadas_2.setText("27'5");
                suspension_2.setText("rigida");
                cambio_2.setText("Shimano Acera");
                mandos_2.setText("Shimano Altus");
                peso_2.setText("10,200kg");
                break;
            case "mon_rigida_29":
                mon_r_29.setVisibility(View.VISIBLE);
                marca_2.setText("Mondraker");
                pulgadas_2.setText("29");
                suspension_2.setText("rigida");
                cambio_2.setText("SRAM XX1 Eagle");
                mandos_2.setText("SRAM Trigger Eagle");
                peso_2.setText("8,500kg");
                break;
            default:
                Toast.makeText(this, resultado, Toast.LENGTH_SHORT).show();
        }
    }
}
