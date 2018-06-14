package tutoandroidya.app.jesusbremont.com.tutoya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Proyecto004 extends AppCompatActivity {
    EditText eTPrimero, eTSegundo;
    TextView tVResultado;

    CheckBox chBSumar, chBRestar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proyecto004);

        //Sacamos los Controles
        eTPrimero = (EditText) findViewById(R.id.eTPrimero);
        eTSegundo = (EditText) findViewById(R.id.eTSegundo);
        tVResultado = (TextView) findViewById(R.id.tVResultado);
        chBSumar = (CheckBox) findViewById(R.id.chBSumar);
        chBRestar = (CheckBox) findViewById(R.id.chBRestar);
    }

    public void operar(View view) {

        String valor1 = eTPrimero.getText().toString();
        String valor2 = eTSegundo.getText().toString();

        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        String resu = "";
        if (chBSumar.isChecked()) {
            int suma = nro1 + nro2;
            resu = "La suma es: " + suma;
        }
        if (chBRestar.isChecked()) {
            int resta = nro1 - nro2;
            resu = resu + " La resta es: " + resta;
        }
        tVResultado.setText(resu);
    }
}
