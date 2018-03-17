package example.ingva.com.myapplication03;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawer;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        FragmentManager fragmentManager = getSupportFragmentManager();

        switch (FragmentsIds.getId()){
            case "nav_about_us":
                fragmentManager.beginTransaction().replace(R.id.app_bar_main, new SobreNosotrosFragment()).commit();
                break;
            case "nav_comment":
                fragmentManager.beginTransaction().replace(R.id.app_bar_main, new EnviarComentarioFragment()).commit();
                break;

            case "nav_help":
                fragmentManager.beginTransaction().replace(R.id.app_bar_main, new AyudaFragment()).commit();

                break;
            case "nav_donation":
                fragmentManager.beginTransaction().replace(R.id.app_bar_main, new DonacionFragment()).commit();

                break;
            default:
                fragmentManager.beginTransaction().replace(R.id.app_bar_main, new ConstruccionFragment()).commit();
                break;
        }



    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

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

        FragmentManager fragmentManager = getSupportFragmentManager();
        if (id == R.id.nav_donation) {
            fragmentManager.beginTransaction().replace(R.id.app_bar_main, new DonacionFragment()).commit();

        } else if (id == R.id.nav_help) {
            fragmentManager.beginTransaction().replace(R.id.app_bar_main, new AyudaFragment()).commit();

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_about_us) {
            fragmentManager.beginTransaction().replace(R.id.app_bar_main, new SobreNosotrosFragment()).commit();

        } else if (id == R.id.nav_comment){
            fragmentManager.beginTransaction().replace(R.id.app_bar_main, new EnviarComentarioFragment()).commit();

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
/*
    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.boton_calcula:
                Intent btn_calcula = new Intent(MainActivity.this, Elegir_metodo.class);
                startActivity(btn_calcula);
                break;
            case R.id.boton_idioma:
                Intent btn_idioma = new Intent(MainActivity.this, Idioma.class);
                startActivity(btn_idioma);
                break;
            case R.id.boton_configuracion:
                Intent btn_configuracion = new Intent(MainActivity.this, Configuracion.class);
                startActivity(btn_configuracion);
                break;
            case R.id.boton_accesibilidad:
                Intent btn_accesibilidad = new Intent(MainActivity.this, Aceesibilidad.class);
                startActivity(btn_accesibilidad);
                break;
        }
     /*   android.app.FragmentManager mfragmentManager = getFragmentManager();
        FragmentTransaction transaction = mfragmentManager.beginTransaction();
        chooseMethod chooseMethod = new chooseMethod();
        transaction.add(R.layout.content_main, chooseMethod);
        transaction.commit();*/
}

