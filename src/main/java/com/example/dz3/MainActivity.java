package com.example.dz3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static void main(String[] args) {
        human human1 = new human();
        human1.count = 9;
        human1.skidka = Skidka. DEFAULT_TICKET;
        human1.tik = new Tik(70);

        human human2 = new human();
        human2.count = 11;
        human2.skidka = Skidka.CHILD_TICKET;
        human2.tik = new Tik(70);


        human human3 = new human();
        human3.count = 5;
        human3.skidka = Skidka.OLDER_TICKET;
        human3.tik = new Tik(70);

        TextView findViewbild;
        TextView myView = findViewbild (R.id.vivod) ;
        myView.setText("Общая стоимоть билетов:" + (schet.getAllSumm(human1) + schet.getAllSumm(human2) + schet.getAllSumm(human3));

    }



