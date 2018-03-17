package example.ingva.com.myapplication03;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.Objects;

public class complexion extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Spinner spinner;
    Button calcular_complexion;
    EditText editText_complexion;
    RadioGroup radio_group_complex;
    View radioButtonView;
    int radioButton, indice;
    Float estatura[] = new Float[101];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complexion);

        calcular_complexion = (Button) findViewById(R.id.calcular_complexion);
        editText_complexion = (EditText) findViewById(R.id.editText_complexion);
        radio_group_complex = (RadioGroup) findViewById(R.id.radio_group_complex);
        spinner = (Spinner) findViewById(R.id.my_spinner);

        for (int i = 0; i <= 44; i++){
            estatura[i] = (float)(i + 150.00)/100 ;
        }
        ArrayAdapter<Float> adapterEstatura = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, estatura);
        adapterEstatura.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapterEstatura);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    /*    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        calcular_complexion.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                radioButton = radio_group_complex.getCheckedRadioButtonId();

                radioButtonView = radio_group_complex.findViewById(radioButton);

                indice = radio_group_complex.indexOfChild(radioButtonView);

                RadioButton mRadioButton = (RadioButton) radio_group_complex.getChildAt(indice);

                String text = mRadioButton.getText().toString();

                StringBuilder texto = new StringBuilder();
                float altura = Float.valueOf(spinner.getSelectedItem().toString());

                altura *= 100;

                String la_muneca = editText_complexion.getText().toString();
                Float muneca02 = Float.parseFloat(la_muneca);

                //Formula para la complexion de la muneca
                double complexion = altura/muneca02;

                 //Empieza la Magia
                if(Objects.equals(text, "Masculino")){
                    if (complexion < 9.6 && altura > 155 && altura <= 157) { //GRANDE 1

                        AlertDialog.Builder builder = new AlertDialog.Builder(complexion.this);
                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 57-64 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(complexion.this);

                    if (complexion < 9.6 && altura > 157 && altura <= 160) { //GRANDE 2

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 59-66 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion < 9.6 && altura > 160 && altura <= 162) { //GRANDE 3

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 60-67 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion < 9.6 && altura > 162 && altura <= 165) { //GRANDE 4

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 61-69 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion < 9.6 && altura > 165 && altura <= 168) { //GRANDE 5

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 63-71 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion < 9.6 && altura > 168 && altura <= 170) { //GRANDE 6

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 65-73 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }


                    if (complexion < 9.6 && altura > 170 && altura <= 173) { //GRANDE 7

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 67-75 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion < 9.6 && altura > 173 && altura <= 175) { //GRANDE 8

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 69-77 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion < 9.6 && altura > 175 && altura <= 178) { //GRANDE 9

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 71-79 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion < 9.6 && altura > 178 && altura <= 180) { //GRANDE 10

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 72-81 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion< 9.6 && altura > 180 && altura <= 183) { //GRANDE 11

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 75-84 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();


                    }

                    if (complexion < 9.6 && altura > 183 && altura <= 185) { //GRANDE 12

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 76-86 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();


                    }

                    if (complexion < 9.6 && altura > 185 && altura <= 188) { //GRANDE 13

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 79-88 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();


                    }

                    if (complexion < 9.6 && altura > 188 && altura <= 190) { //GRANDE 14

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 88-91 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();


                    }

                    if (complexion < 9.6 && altura > 190 && altura <= 193) { //GRANDE 15

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 83-94 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion >= 9.6 && complexion <= 10.4 && altura > 155 && altura <= 157) { //MEDIANO 1

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 54-59 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion >= 9.6 && complexion <= 10.4 && altura > 157 && altura <= 160) { //MEDIANO 2

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 55-60 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion >= 9.6 && complexion <= 10.4 && altura > 160 && altura <= 162) { //MEDIANO 3

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 56-62 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion >= 9.6 && complexion <= 10.4 && altura > 162 && altura <= 165) { //MEDIANO 4

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 58-63 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion >= 9.6 && complexion <= 10.4 && altura > 165 && altura <= 168) { //MEDIANO 5

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 59-65 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion >= 9.6 && complexion <= 10.4 && altura > 168 && altura <= 170) { //MEDIANO 6

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 61-67 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }


                    if (complexion >= 9.6 && complexion <= 10.4 && altura > 170 && altura <= 173) { //MEDIANO 7

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 63-69 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion >= 9.6 && complexion <= 10.4 && altura > 173 && altura <= 175) { //MEDIANO 8

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 65-71 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion >= 9.6 && complexion <= 10.4 && altura > 175 && altura <= 178) { //MEDIANO 9

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 66-73 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion >= 9.6 && complexion <= 10.4 && altura > 178 && altura <= 180) { //MEDIANO 10

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 68-75 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion >= 9.6 && complexion <= 10.4 && altura > 180 && altura <= 183) { //MEDIANO 11

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 70-77 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();


                    }

                    if (complexion >= 9.6 && complexion <= 10.4 && altura > 183 && altura <= 185) { //MEDIANO 12

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 72-80 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();


                    }

                    if (complexion >= 9.6 && complexion <= 10.4 && altura > 185 && altura <= 188) { //MEDIANO 13

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 74-82 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();


                    }

                    if (complexion >= 9.6 && complexion <= 10.4 && altura > 188 && altura <= 190) { //MEDIANO 14

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 76-84 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();


                    }

                    if (complexion >= 9.6 && complexion <= 10.4 && altura > 190 && altura <= 193) { //MEDIANO 15

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 78-86 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion > 10.4 && altura > 155 && altura <= 157) { // PEQUENO 1

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 51-55 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion > 10.4 && altura > 157 && altura <= 160) { //PEQUENO 2

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 52-56 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion > 10.4 && altura > 160 && altura <= 162) { //PEQUENO 3

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 54-57 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion > 10.4 && altura > 162 && altura <= 165) { //PEQUENO 4

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 55-59 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion > 10.4 && altura > 165 && altura <= 168) { //PEQUENO 5

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 56-60 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion > 10.4 && altura > 168 && altura <= 170) { //PEQUENO 6

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 58-62 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }


                    if (complexion > 10.4 && altura > 170 && altura <= 173) { //PEQUENO 7

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 60-64 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion > 10.4 && altura > 173 && altura <= 175) { //PEQUENO 8

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 62-66 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion > 10.4 && altura > 175 && altura <= 178) { //PEQUENO 9

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 64-68 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion > 10.4 && altura > 178 && altura <= 180) { //PEQUENO 10

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 66-70 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion > 10.4 && altura > 180 && altura <= 183) { //PEQUENO 11

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 67-72 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();


                    }

                    if (complexion > 10.4 && altura > 183 && altura <= 185) { //PEQUENO 12

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 69-74 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();


                    }

                    if (complexion > 10.4 && altura > 185 && altura <= 188) { //PEQUENO 13

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 71-76 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();


                    }

                    if (complexion > 10.4 && altura > 188 && altura <= 190) { //PEQUENO 14

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 73-78 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();


                    }

                    if (complexion > 10.4 && altura > 190 && altura <= 193) { //PEQUENO 15

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 75-80 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }
                }

                if (Objects.equals(text, "Femenino")) { //MUJER

                    AlertDialog.Builder builder = new AlertDialog.Builder(complexion.this);

                    if (complexion < 10 && altura > 145 && altura <= 147) { //GRANDE 1

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 45-54 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion < 10 && altura > 147 && altura <= 150) { //GRANDE 2

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 48-56 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion < 10 && altura > 150 && altura <= 152) { //GRANDE 3

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 50-58 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion < 10 && altura > 152 && altura <= 155) { //GRANDE 4

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 51-59 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion < 10 && altura > 155 && altura <= 157) { //GRANDE 5

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 52-60 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion < 10 && altura > 157 && altura <= 160) { //GRANDE 6

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 64-61 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }


                    if (complexion < 10 && altura > 160 && altura <= 162) { //GRANDE 7

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 55-63 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion < 10 && altura > 162 && altura <= 165) { //GRANDE 8

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 57-65 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion < 10 && altura > 165 && altura <= 168) { //GRANDE 9

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 58-66 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion < 10 && altura > 168 && altura <= 170) { //GRANDE 10

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 60-68 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion < 10 && altura > 170 && altura <= 173) { //GRANDE 11

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 62-70 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();


                    }

                    if (complexion < 10 && altura > 173 && altura <= 175) { //GRANDE 12

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 64-72 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();


                    }

                    if (complexion < 10 && altura > 175 && altura <= 178) { //GRANDE 13

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 66-74 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();


                    }

                    if (complexion < 10 && altura > 178 && altura <= 180) { //GRANDE 14

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 67-76 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();


                    }

                    if (complexion < 10 && altura > 180 && altura <= 183) { //GRANDE 15

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 70-79 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion >= 10 && complexion <= 11 && altura > 145 && altura <= 147) { //MEDIANA 1

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 44-49 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion >= 10 && complexion <= 11 && altura > 147 && altura <= 150) { //MEDIANA 2

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 45-50 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion >= 10 && complexion <= 11 && altura > 150 && altura <= 152) { //MEDIANA 3

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 46-51 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion >= 10 && complexion <= 11 && altura > 152 && altura <= 155) { // MEDIANA 4

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 47-53 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion >= 10 && complexion <= 11 && altura > 155 && altura <= 157) { //MEDIANA 5

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 49-54 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion >= 10 && complexion <= 11 && altura > 157 && altura <= 160) { //MEDIANA 6

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 50-56 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }


                    if (complexion >= 10 && complexion <= 11 && altura > 160 && altura <= 162) { //MEDIANA 7

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 51-57 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion >= 10 && complexion <= 11 && altura > 162 && altura <= 165) { //MEDIANA 8

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 53-59 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion >= 10 && complexion <= 11 && altura > 165 && altura <= 168) { //MEDIANA 9

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 55-61 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion >= 10 && complexion <= 11 && altura > 168 && altura <= 170) { //MEDIANA 10

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 56-63 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion >= 10 && complexion <= 11 && altura > 170 && altura <= 173) { //MEDIANA 11

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 58-65 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();


                    }

                    if (complexion >= 10 && complexion <= 11 && altura > 173 && altura <= 175) { //MEDIANA 12

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 60-67 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();


                    }

                    if (complexion >= 10 && complexion <= 11 && altura > 175 && altura <= 178) { //MEDIANA 13

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 62-69 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();


                    }

                    if (complexion >= 10 && complexion <= 11 && altura > 178 && altura <= 180) { //MEDIANA 14

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 64-71 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();


                    }

                    if (complexion >= 10 && complexion <= 11 && altura > 180 && altura <= 183) { //MEDIANA 15

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 66-73 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion > 11 && altura > 145 && altura <= 147) { //PEQUENA 1

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 42-45 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion > 11 && altura > 147 && altura <= 150) { //PEQUENA 2

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 43-46 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion > 11 && altura > 150 && altura <= 152) { //PEQUENA 3

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 44-47 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion > 11 && altura > 152 && altura <= 155) { // PEQUENA 4

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 45-49 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion > 11 && altura > 155 && altura <= 157) { //PEQUENA 5

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 46-50 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion > 11 && altura > 157 && altura <= 160) { //PEQUENA 6

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 48-51 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }


                    if (complexion > 11 && altura > 160 && altura <= 162) { //PEQUENA 7

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 49-53 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion > 11 && altura > 162 && altura <= 165) { //PEQUENA 8

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 51-54 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion > 11 && altura > 165 && altura <= 168) { //PEQUENA 9

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 52-56 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion > 11 && altura > 168 && altura <= 170) { //PEQUENA 10

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 54-58 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }

                    if (complexion > 11 && altura > 170 && altura <= 173) { //PEQUENA 11

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 56-60 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();


                    }

                    if (complexion > 11 && altura > 173 && altura <= 175) { //PEQUENA 12

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 57-61 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();


                    }

                    if (complexion > 11 && altura > 175 && altura <= 178) { //PEQUENA 13

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 59-64 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();


                    }

                    if (complexion > 11 && altura > 178 && altura <= 180) { //PEQUENA 14

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 61-66 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();


                    }

                    if (complexion > 11 && altura > 180 && altura <= 183) { //PEQUENA 15

                        builder.setIcon(R.drawable.ic_peso04)

                                .setTitle("Tu peso ideal según tu complexion")
                                .setMessage("Tu peso ideal se encuentra entre 63-67 Kgs.");

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }
                }

            }
        });

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
}
