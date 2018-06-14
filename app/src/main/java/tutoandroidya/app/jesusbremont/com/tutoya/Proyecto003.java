package tutoandroidya.app.jesusbremont.com.tutoya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Proyecto003 extends AppCompatActivity {
    EditText eTPrimero, eTSegundo;
    RadioButton rBSumar, rbRestar;
    TextView tVResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proyecto003);

        //Sacamos los Controles
        eTPrimero = (EditText) findViewById(R.id.eTPrimero);
        eTSegundo = (EditText) findViewById(R.id.eTSegundo);
        tVResultado =(TextView) findViewById(R.id.tVResultado);
        rBSumar = (RadioButton) findViewById(R.id.rBSuma);
        rbRestar = (RadioButton) findViewById(R.id.rBResta);


    }

    public void operar(View view) {

        String valor1=eTPrimero.getText().toString();
        String valor2=eTSegundo.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);
        if (rBSumar.isChecked()==true) {
            int suma=nro1+nro2;
            String resu=String.valueOf(suma);
            tVResultado.setText(resu);
        } else
        if (rbRestar.isChecked()==true) {
            int resta=nro1-nro2;
            String resu=String.valueOf(resta);
            tVResultado.setText(resu);
        }

    }
}
