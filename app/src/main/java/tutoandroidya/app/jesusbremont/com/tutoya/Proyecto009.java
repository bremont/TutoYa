package tutoandroidya.app.jesusbremont.com.tutoya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Proyecto009 extends AppCompatActivity {
    private EditText eTNombre, eTPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proyecto009);

        //Cargamos el Control
        eTNombre = (EditText) findViewById(R.id.eTNombre);
        eTPassword = (EditText) findViewById(R.id.eTPassword);
    }

    public void verificar(View v) {
        String clave=eTPassword.getText().toString();
        if (clave.length()==0) {
            Toast notificacion= Toast.makeText(this,"La clave no puede quedar vacía",Toast.LENGTH_LONG);
            notificacion.show();
        }
    }
}
