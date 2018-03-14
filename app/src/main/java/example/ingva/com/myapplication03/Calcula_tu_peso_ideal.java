package example.ingva.com.myapplication03;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class Calcula_tu_peso_ideal extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    Button boton_calcula;
    Button boton_idioma;
    Button boton_configuracion;
    Button boton_accesibilidad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_calcula_tu_peso_ideal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

         boton_calcula = (Button) findViewById(R.id.boton_calcula);
        boton_calcula.setOnClickListener(this);

         boton_idioma = (Button) findViewById(R.id.boton_idioma);
        boton_idioma.setOnClickListener(this);

         boton_configuracion = (Button) findViewById(R.id.boton_configuracion);
        boton_configuracion.setOnClickListener(this);

         boton_accesibilidad = (Button) findViewById(R.id.boton_accesibilidad);
        boton_accesibilidad.setOnClickListener(this);


     /*   FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
/*
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);*/
    }
/*
    @Override
    public void onBackPressed() {

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_accesibility) {
            // Handle the camera action
        } else if (id == R.id.nav_donation) {

        } else if (id == R.id.nav_help) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        } else if (id == R.id.nav_about_us) {

        } else if (id == R.id.nav_comment){

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.boton_calcula:
            Intent btn_calcula = new Intent(Calcula_tu_peso_ideal.this, Elegir_metodo.class);
            startActivity(btn_calcula);
            break;

            case R.id.boton_idioma:
            Intent btn_idioma = new Intent(Calcula_tu_peso_ideal.this, Idioma.class);
            startActivity(btn_idioma);
            break;

            case R.id.boton_configuracion:
            Intent btn_configuracion = new Intent(Calcula_tu_peso_ideal.this, Configuracion.class);
            startActivity(btn_configuracion);
            break;

            case R.id.boton_accesibilidad:
            Intent btn_accesibilidad = new Intent(Calcula_tu_peso_ideal.this, Aceesibilidad.class);
            startActivity(btn_accesibilidad);
            break;
        }
    }
}
