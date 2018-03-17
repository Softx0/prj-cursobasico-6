package example.ingva.com.myapplication03;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import java.util.Locale;

/**
 * Created by Emmmanuel Valenzuela on 17/03/2018.
 */

public class LocalizationUpdaterActivity extends Activity {

    Button aceptar_idioma;

    String[] languages = { "Español", "English", "Francais" };

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idioma);

        aceptar_idioma = (Button) findViewById(R.id.aceptar_idioma);
        final Spinner spinner = (Spinner) findViewById(R.id.spinner_idioma);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, languages);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        aceptar_idioma.setOnClickListener(new View.OnClickListener() {

                                              @Override
                                              public void onClick(View view) {
                                                  Integer opcion = Integer.valueOf(spinner.getSelectedItem().toString());
                                                  Configuration config = new Configuration();

                                                  switch (opcion) {
                                                      case 0:
                                                          Locale localizacion = new Locale("es", "ES");
                                                          Locale.setDefault(localizacion);
                                                          config.locale = localizacion;
                                                          getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
                                                          //PARA LA ACTIVITY IDIOMA
                                                          Intent refrescar01 = new Intent(getApplicationContext(), Idioma.class);
                                                          refrescar01.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar01);
                                                          // startActivity(new Intent(getBaseContext(), Idioma.class));
                                                          //startActivity(new Intent(getBaseContext(), Calcula_tu_peso_ideal.class));

                                                          //PARA LA ACTIVITY DEL MENU
                                                          Intent refrescar02 = new Intent(getApplicationContext(), Calcula_tu_peso_ideal.class);
                                                          refrescar02.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar02);

                                                          //PARA LA ACTIVITY COMPLEXION
                                                          Intent refrescar03 = new Intent(getApplicationContext(), complexion.class);
                                                          refrescar03.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar03);

                                                          //PARA LA ACTIVITY Elegir_metodo
                                                          Intent refrescar04 = new Intent(getApplicationContext(), Elegir_metodo.class);
                                                          refrescar04.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar04);

                                                          //PARA LA ACTIVITY imc
                                                          Intent refrescar05 = new Intent(getApplicationContext(), imc.class);
                                                          refrescar05.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar05);

                                                          //PARA LA ACTIVITY MainActivity
                                                          Intent refrescar06 = new Intent(getApplicationContext(), MainActivity.class);
                                                          refrescar06.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar06);

                                                          //PARA LA ACTIVITY Configuracion
                                                          Intent refrescar07 = new Intent(getApplicationContext(), Configuracion.class);
                                                          refrescar07.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar07);

                                                          //PARA LA ACTIVITY Aceesibilidad
                                                          Intent refrescar08 = new Intent(getApplicationContext(), Aceesibilidad.class);
                                                          refrescar08.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar08);
                                                          break;
                                                      case 1:
                                                          config.locale = Locale.ENGLISH;
                                                          //PARA LA ACTIVITY IDIOMA
                                                          refrescar01 = new Intent(getApplicationContext(), Idioma.class);
                                                          refrescar01.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar01);
                                                          // startActivity(new Intent(getBaseContext(), Idioma.class));
                                                          //startActivity(new Intent(getBaseContext(), Calcula_tu_peso_ideal.class));

                                                          //PARA LA ACTIVITY DEL MENU
                                                          refrescar02 = new Intent(getApplicationContext(), Calcula_tu_peso_ideal.class);
                                                          refrescar02.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar02);

                                                          //PARA LA ACTIVITY COMPLEXION
                                                          refrescar03 = new Intent(getApplicationContext(), complexion.class);
                                                          refrescar03.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar03);

                                                          //PARA LA ACTIVITY Elegir_metodo
                                                          refrescar04 = new Intent(getApplicationContext(), Elegir_metodo.class);
                                                          refrescar04.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar04);

                                                          //PARA LA ACTIVITY imc
                                                          refrescar05 = new Intent(getApplicationContext(), imc.class);
                                                          refrescar05.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar05);

                                                          //PARA LA ACTIVITY MainActivity
                                                          refrescar06 = new Intent(getApplicationContext(), MainActivity.class);
                                                          refrescar06.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar06);

                                                          //PARA LA ACTIVITY Configuracion
                                                          refrescar07 = new Intent(getApplicationContext(), Configuracion.class);
                                                          refrescar07.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar07);

                                                          //PARA LA ACTIVITY Aceesibilidad
                                                          refrescar08 = new Intent(getApplicationContext(), Aceesibilidad.class);
                                                          refrescar08.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar08);
                                                          break;
                                                      case 2:
                                                          config.locale = Locale.FRENCH;
                                                          //PARA LA ACTIVITY IDIOMA
                                                          refrescar01 = new Intent(getApplicationContext(), Idioma.class);
                                                          refrescar01.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar01);
                                                          // startActivity(new Intent(getBaseContext(), Idioma.class));
                                                          //startActivity(new Intent(getBaseContext(), Calcula_tu_peso_ideal.class));

                                                          //PARA LA ACTIVITY DEL MENU
                                                          refrescar02 = new Intent(getApplicationContext(), Calcula_tu_peso_ideal.class);
                                                          refrescar02.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar02);

                                                          //PARA LA ACTIVITY COMPLEXION
                                                          refrescar03 = new Intent(getApplicationContext(), complexion.class);
                                                          refrescar03.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar03);

                                                          //PARA LA ACTIVITY Elegir_metodo
                                                          refrescar04 = new Intent(getApplicationContext(), Elegir_metodo.class);
                                                          refrescar04.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar04);

                                                          //PARA LA ACTIVITY imc
                                                          refrescar05 = new Intent(getApplicationContext(), imc.class);
                                                          refrescar05.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar05);

                                                          //PARA LA ACTIVITY MainActivity
                                                          refrescar06 = new Intent(getApplicationContext(), MainActivity.class);
                                                          refrescar06.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar06);

                                                          //PARA LA ACTIVITY Configuracion
                                                          refrescar07 = new Intent(getApplicationContext(), Configuracion.class);
                                                          refrescar07.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar07);

                                                          //PARA LA ACTIVITY Aceesibilidad
                                                          refrescar08 = new Intent(getApplicationContext(), Aceesibilidad.class);
                                                          refrescar08.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar08);
                                                          break;

                                                      default:
                                                          localizacion = new Locale("es", "ES");
                                                          Locale.setDefault(localizacion);
                                                          config.locale = localizacion;
                                                          getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
                                                          //PARA LA ACTIVITY IDIOMA
                                                          refrescar01 = new Intent(getApplicationContext(), Idioma.class);
                                                          refrescar01.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar01);
                                                          // startActivity(new Intent(getBaseContext(), Idioma.class));
                                                          //startActivity(new Intent(getBaseContext(), Calcula_tu_peso_ideal.class));

                                                          //PARA LA ACTIVITY DEL MENU
                                                          refrescar02 = new Intent(getApplicationContext(), Calcula_tu_peso_ideal.class);
                                                          refrescar02.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar02);

                                                          //PARA LA ACTIVITY COMPLEXION
                                                          refrescar03 = new Intent(getApplicationContext(), complexion.class);
                                                          refrescar03.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar03);

                                                          //PARA LA ACTIVITY Elegir_metodo
                                                          refrescar04 = new Intent(getApplicationContext(), Elegir_metodo.class);
                                                          refrescar04.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar04);

                                                          //PARA LA ACTIVITY imc
                                                          refrescar05 = new Intent(getApplicationContext(), imc.class);
                                                          refrescar05.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar05);

                                                          //PARA LA ACTIVITY MainActivity
                                                          refrescar06 = new Intent(getApplicationContext(), MainActivity.class);
                                                          refrescar06.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar06);

                                                          //PARA LA ACTIVITY Configuracion
                                                          refrescar07 = new Intent(getApplicationContext(), Configuracion.class);
                                                          refrescar07.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar07);

                                                          //PARA LA ACTIVITY Aceesibilidad
                                                          refrescar08 = new Intent(getApplicationContext(), Aceesibilidad.class);
                                                          refrescar08.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                                          startActivity(refrescar08);
                                                          break;
                                                  }
                                                  getResources().updateConfiguration(config, null);


                                              }
                                          });
    }
}
/*
                //PARA LA ACTIVITY IDIOMA
                Intent refrescar01 = new Intent(getApplicationContext(), Idioma.class);
                refrescar01.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(refrescar01);
           // startActivity(new Intent(getBaseContext(), Idioma.class));
           //startActivity(new Intent(getBaseContext(), Calcula_tu_peso_ideal.class));

                //PARA LA ACTIVITY DEL MENU
                Intent refrescar02 = new Intent(getApplicationContext(), Calcula_tu_peso_ideal.class);
                refrescar02.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(refrescar02);

                //PARA LA ACTIVITY COMPLEXION
                Intent refrescar03 = new Intent(getApplicationContext(), complexion.class);
                refrescar03.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(refrescar03);

                //PARA LA ACTIVITY Elegir_metodo
                Intent refrescar04 = new Intent(getApplicationContext(), Elegir_metodo.class);
                refrescar04.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(refrescar04);

                //PARA LA ACTIVITY imc
                Intent refrescar05 = new Intent(getApplicationContext(), imc.class);
                refrescar05.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(refrescar05);

                //PARA LA ACTIVITY MainActivity
                Intent refrescar06 = new Intent(getApplicationContext(), MainActivity.class);
                refrescar06.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(refrescar06);

                //PARA LA ACTIVITY Configuracion
                Intent refrescar07 = new Intent(getApplicationContext(), Configuracion.class);
                refrescar07.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(refrescar07);

                //PARA LA ACTIVITY Aceesibilidad
                Intent refrescar08 = new Intent(getApplicationContext(), Aceesibilidad.class);
                refrescar08.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(refrescar08);

           /*
            startActivity(new Intent(getBaseContext(), complexion.class));
            startActivity(new Intent(getBaseContext(), Elegir_metodo.class));
            startActivity(new Intent(getBaseContext(), imc.class));
            startActivity(new Intent(getBaseContext(), MainActivity.class));
            startActivity(new Intent(getBaseContext(), Configuracion.class));
            startActivity(new Intent(getBaseContext(), Aceesibilidad.class));
            */
