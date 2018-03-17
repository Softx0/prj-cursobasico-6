package example.ingva.com.myapplication03;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
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

    //    setContentView(R.layout.content_calcula_tu_peso_ideal);
        setContentView(R.layout.activity_calcula_tu_peso_ideal);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        boton_calcula = (Button) findViewById(R.id.boton_calcula);
        boton_calcula.setOnClickListener((View.OnClickListener) this);

        boton_idioma = (Button) findViewById(R.id.boton_idioma);
        boton_idioma.setOnClickListener((View.OnClickListener) this);

        boton_configuracion = (Button) findViewById(R.id.boton_configuracion);
        boton_configuracion.setOnClickListener((View.OnClickListener) this);

        boton_accesibilidad = (Button) findViewById(R.id.boton_accesibilidad);
        boton_accesibilidad.setOnClickListener((View.OnClickListener) this);


     /*   FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        drawer.computeScroll();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
       // for (int i = 0; i < navigationView.getChildCount(); i++) {
         //   navigationView.getChildAt(i).setOverScrollMode(View.OVER_SCROLL_NEVER);
       // }
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
        public boolean onNavigationItemSelected (MenuItem item){
            // Handle navigation view item clicks here.
            int id = item.getItemId();

            Intent main = new Intent(getApplicationContext(),MainActivity.class);

            if (id == R.id.nav_donation) {
                FragmentsIds.setId("nav_donation");

            } else if (id == R.id.nav_help) {
                FragmentsIds.setId("nav_help");

            } else if (id == R.id.nav_share) {
                FragmentsIds.setId("nav_share");

            } else if (id == R.id.nav_about_us) {
                FragmentsIds.setId("nav_about_us");

            } else if (id == R.id.nav_comment) {
                FragmentsIds.setId("nav_comment");

            }
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);


            startActivity(main);

            return true;
        }

        @Override
        public void onClick (View view){
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
