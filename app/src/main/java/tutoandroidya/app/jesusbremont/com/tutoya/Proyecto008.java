package tutoandroidya.app.jesusbremont.com.tutoya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Proyecto008 extends AppCompatActivity {

    private EditText eTNumeroVisto;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proyecto008);

        //Cargamos el Control
        eTNumeroVisto = (EditText) findViewById(R.id.eTNumero);

        //Cargamos Numero
        num = (int) (Math.random() * 100001);
        String cadena = String.valueOf(num);
        Toast notificacion = Toast.makeText(this, cadena, Toast.LENGTH_LONG);
        notificacion.show();

    }

    public void controlar(View view) {
        String valorIngresado = eTNumeroVisto.getText().toString();
        int valor = Integer.parseInt(valorIngresado);
        if (valor == num) {
            Toast notificacion = Toast.makeText(this, "Muy bien recordaste el número mostrado", Toast.LENGTH_LONG);
            notificacion.show();
        } else {
            Toast notificacion = Toast.makeText(this, "Lo siento pero no recordaste el número mostrado", Toast.LENGTH_LONG);
            notificacion.show();
        }

    }
}
