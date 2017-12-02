package com.example.mmaroun.mytravel;


import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.AutoCompleteTextView;
import android.app.Activity;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

/**
 * Created by mmaroun on 24/11/2017.
 */

public class AddActivity extends BaseActivity {

   /* private EditText editDepart;
    private EditText editArrivee;
    private EditText place;
    private EditText prix;
    private Button btnValidate;
    private EditText metDate, metDate2;*/

    @Override
    int getContentViewId() {
        return R.layout.activity_add;
    }

    @Override
    int getNavigationMenuItemId() {
        return R.id.navigation_add;
    }

    public void map(View view) {
        //on creer une nouvelle intent on definit la class de depart ici this et la class d'arrivé ici SecondActivite
        Intent intent=new Intent(this, MapsActivity.class);
        //on lance l'intent, cela a pour effet de stoper l'activité courante et lancer une autre activite ici SecondActivite
        startActivity(intent);
    }

    public void val(View view) {
        //on creer une nouvelle intent on definit la class de depart ici this et la class d'arrivé ici SecondActivite
        Intent intent=new Intent(this, MainActivity.class);
        //on lance l'intent, cela a pour effet de stoper l'activité courante et lancer une autre activite ici SecondActivite
        startActivity(intent);
    }



}