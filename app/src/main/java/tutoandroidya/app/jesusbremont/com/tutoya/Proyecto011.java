package tutoandroidya.app.jesusbremont.com.tutoya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Proyecto011 extends AppCompatActivity {
    private EditText eTNombre, eTPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proyecto011);

        //Cargamos el Control
        eTNombre = (EditText) findViewById(R.id.eTNombre);
        eTPassword = (EditText) findViewById(R.id.eTPassword);

        eTNombre.setText("");
        eTPassword.setText("");
    }

    public void verificar(View v) {
        String nombre = eTNombre.getText().toString();
        String clave = eTPassword.getText().toString();

        if (clave.length() == 0 || nombre.length() == 0) {
            Toast notificacion = Toast.makeText(this, "La clave/nombre no puede quedar vacía", Toast.LENGTH_LONG);
            notificacion.show();
        }

        if (nombre.equals("bremont") && clave.equals("12345")) {

            Intent i = new Intent(this, Proyecto011_ppl.class );
            startActivity(i);

        }


    }
}
