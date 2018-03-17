package example.ingva.com.myapplication03;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mostrarLaOtra = new Intent(splashscreen.this, Calcula_tu_peso_ideal.class);
                startActivity(mostrarLaOtra);
            }
        },4000);
    }
}
