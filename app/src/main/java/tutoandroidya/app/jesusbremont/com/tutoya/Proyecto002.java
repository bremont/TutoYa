package tutoandroidya.app.jesusbremont.com.tutoya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Proyecto002 extends AppCompatActivity {
    EditText eTPrimero, eTSegundo;
    TextView tVResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proyecto002);

        //Enlazamos las Variabels
        eTPrimero = (EditText) findViewById(R.id.eTPrimero);
        eTSegundo = (EditText) findViewById(R.id.eTSegundo);
        tVResultado = (TextView) findViewById(R.id.tVResultado);
    }

    public void sumar(View view) {

        String valor1 = eTPrimero.getText().toString();
        String valor2 = eTSegundo.getText().toString();

        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);

        int suma = nro1 + nro2;
        String resu = String.valueOf(suma);
        tVResultado.setText(resu);

    }
}
