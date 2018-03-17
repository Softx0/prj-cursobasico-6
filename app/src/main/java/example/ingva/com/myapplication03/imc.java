package example.ingva.com.myapplication03;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class imc extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    private Spinner alturaSpinner;
    private Float[] dataAltura = new Float[101];
    private Spinner pesoSpinner;
    private Integer[] dataPeso = new Integer[101];
    private Button calcular;
    private View layout_table_imc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        for (int i = 0; i <= 100; i++){
            dataAltura[i] = (float)(i + 150.00)/100 ;
        }

        for (int i = 0; i <= 100; i++){
            dataPeso[i] = i + 40;
        }


        alturaSpinner = (Spinner) findViewById(R.id.spinner_altura);
        ArrayAdapter<Float> adapterAltura = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, dataAltura);
        adapterAltura.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        alturaSpinner.setAdapter(adapterAltura);


        pesoSpinner = (Spinner) findViewById(R.id.spinner_peso);
        ArrayAdapter<Integer> adapterPeso = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, dataPeso);
        adapterPeso.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        pesoSpinner.setAdapter(adapterPeso);

        calcular = (Button) findViewById(R.id.btn_imc) ;
        calcular.setOnClickListener(this);

        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
        //Getting the View object as defined in the customtoast.xml file
        layout_table_imc = li.inflate(R.layout.imc_layout, (ViewGroup) findViewById(R.id.imc_table));


/*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
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

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        Intent main = new Intent(getApplicationContext(),MainActivity.class);

        if (id == R.id.nav_accesibility) {
            FragmentsIds.setId("nav_accesibility");

            // Handle the camera action
        } else if (id == R.id.nav_donation) {
            FragmentsIds.setId("nav_donation");

        } else if (id == R.id.nav_help) {
            FragmentsIds.setId("nav_help");

        } else if (id == R.id.nav_share) {
            FragmentsIds.setId("nav_share");

        } else if (id == R.id.nav_send) {
            FragmentsIds.setId("nav_send");

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

    @SuppressLint({"WrongConstant", "DefaultLocale"})
    @Override
    public void onClick(View view) {
        StringBuilder text = new StringBuilder();

        float altura = Float.valueOf(alturaSpinner.getSelectedItem().toString());
        int peso = Integer.valueOf(pesoSpinner.getSelectedItem().toString());
        float imc = peso/(altura*altura);
        text.append("Su IMC es: ");
        text.append(String.format("%.2f", imc));

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //Uncomment the below code to Set the message and title from the strings.xml file
        //builder.setMessage(R.string.dialog_message) .setTitle(R.string.dialog_title);

        //Setting message manually and performing action on button click
        builder.setMessage(text)
                .setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                }).setView(layout_table_imc)
                .setNeutralButton("Atras", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setTitle("Indice de masa corporal");
        builder.show();



    }
}