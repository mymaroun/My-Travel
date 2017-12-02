package com.example.mmaroun.mytravel;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.view.Menu;
import android.support.design.widget.FloatingActionButton;
/**
 * Created by mmaroun on 24/11/2017.
 */

public class MainActivity extends BaseActivity {


    public void Go(View view) {
        //on creer une nouvelle intent on definit la class de depart ici this et la class d'arrivé ici SecondActivite
        Intent intent=new Intent(this, ProfileActivity.class);
        //on lance l'intent, cela a pour effet de stoper l'activité courante et lancer une autre activite ici SecondActivite
        startActivity(intent);
    }

    @Override
    int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    int getNavigationMenuItemId() {
        return R.id.navigation_main;
    }

}
