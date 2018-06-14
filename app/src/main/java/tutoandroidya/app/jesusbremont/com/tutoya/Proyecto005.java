package tutoandroidya.app.jesusbremont.com.tutoya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Proyecto005 extends AppCompatActivity {
    EditText eTPrimero, eTSegundo;
    TextView tVResultado;
    Spinner spOperaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proyecto005);

        //Sacamos los Controles
        eTPrimero = (EditText) findViewById(R.id.eTPrimero);
        eTSegundo = (EditText) findViewById(R.id.eTSegundo);
        tVResultado = (TextView) findViewById(R.id.tVResultado);
        //Cargamos el Spinner
        spOperaciones = (Spinner) findViewById(R.id.spOperaciones);

        String[] opciones = {"sumar", "restar", "multiplicar", "dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones);
        spOperaciones.setAdapter(adapter);


    }

    public void operar(View view) {

        String valor1 = eTPrimero.getText().toString();
        String valor2 = eTSegundo.getText().toString();
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        String selec = spOperaciones.getSelectedItem().toString();

        if (selec.equals("sumar")) {
            int suma = nro1 + nro2;
            String resu = String.valueOf(suma);
            tVResultado.setText(resu);
        } else if (selec.equals("restar")) {
            int resta = nro1 - nro2;
            String resu = String.valueOf(resta);
            tVResultado.setText(resu);
        } else if (selec.equals("multiplicar")) {
            int multi = nro1 * nro2;
            String resu = String.valueOf(multi);
            tVResultado.setText(resu);
        } else if (selec.equals("dividir")) {
            int divi = nro1 / nro2;
            String resu = String.valueOf(divi);
            tVResultado.setText(resu);
        }
    }

}
