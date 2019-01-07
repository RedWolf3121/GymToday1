package com.example.gymtoday1;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class EjerciciosEspaldaActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private RecyclerView rvEspalda;
    private GridLayoutManager glm;
    private EspaldaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicios_espalda);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        rvEspalda = (RecyclerView) findViewById(R.id.rv_espalda);

        glm = new GridLayoutManager(this, 1);
        rvEspalda.setLayoutManager(glm);
        adapter = new EspaldaAdapter(dataSet());
        rvEspalda.setAdapter(adapter);

    }
    private ArrayList<Espalda> dataSet() {
        ArrayList<Espalda> data = new ArrayList<>();
        data.add(new Espalda("Dominadas con Máquina Sostenida,Agarre Amplio", R.drawable.lat_machine_supported_pullups_underhand_wide_grip, R.drawable.estrella_silueta));
        data.add(new Espalda("Dominadas Agarre Amplio", R.drawable.lat_bar_pullups_underhand_wide_grip, R.drawable.estrella_silueta));
        data.add(new Espalda("Espalda a Tórax con Cable-Polea, Agarre Cerrado", R.drawable.lat_machine_chest_pulldown_overhand_close_grip, R.drawable.estrella_silueta));
        data.add(new Espalda("Espalda con Cable-Polea Detras del Cuello, Agarre Amplio", R.drawable.lat_machine_chest_pulldown_overhand_wide_grip, R.drawable.estrella_silueta));
        data.add(new Espalda("Espalda con Cable-Polea a Cuello, Agarre Amplio", R.drawable.lat_machine_chest_pulldown_overhand_wide_grip, R.drawable.estrella_silueta));
        data.add(new Espalda("Remo con Barra de pesas Inclinado", R.drawable.lat_barbell_row_bent_over_underhand_grip, R.drawable.estrella_silueta));
        data.add(new Espalda("Remo con Cable-Polea (Sentado)", R.drawable.lat_low_cable_row_seated, R.drawable.estrella_silueta));
        data.add(new Espalda("Remo con Cable-Polea (De Pie)", R.drawable.lat_low_cable_row_standing_bent_over, R.drawable.estrella_silueta));
        data.add(new Espalda("Remo con Maquina de Palanca (Sentado)", R.drawable.lat_leverage_machine_row_seated, R.drawable.estrella_silueta));
        data.add(new Espalda("Remo con Maquina de Smith (Inclinado de Pie)", R.drawable.lat_smith_machine_row_bent_over, R.drawable.estrella_silueta));
        data.add(new Espalda("Remo en Banco Plano con Barra de Pesas", R.drawable.lat_high_bench_barbell_row_lying, R.drawable.estrella_silueta));
        data.add(new Espalda("Step up con Barra de Pesas, (Inclinado de Pie)", R.drawable.lat_barbell_tipup_bent_over_close_grip, R.drawable.estrella_silueta));
        data.add(new Espalda("Remo con Banco plano Alto con Mancuernas", R.drawable.lat_high_bench_dumbbell_row_lying, R.drawable.estrella_silueta));
        return data;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.ejercicios_espalda, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(EjerciciosEspaldaActivity.this, LoginActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(intent,0);

            // Sólo se lanzará el activity si hay apps disponibles en el sistema para ejecutarla.
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }

        } else if (id == R.id.nav_crono) {
            Intent intent = new Intent(EjerciciosEspaldaActivity.this, CronometroActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_Calendario) {
            Intent intent = new Intent(EjerciciosEspaldaActivity.this, CalendarioActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_Notas) {
            Intent intent = new Intent(EjerciciosEspaldaActivity.this, NotasActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_home) {
            Intent intent = new Intent(EjerciciosEspaldaActivity.this, MainActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, "GymToday");
            startActivity(Intent.createChooser(intent, "Share with"));
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

