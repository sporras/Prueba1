package mx.ipn.cecyt9.edu.prueba1;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

//bundle sirve para recibir valores de la actividad
//la clase R no se cambia pues es la que viene por default

//mipmap son las imagenes de como va a cargar el inicio
//values ---> xml con nombres de variables y valores (se puede declarar colores, dimensiones)
