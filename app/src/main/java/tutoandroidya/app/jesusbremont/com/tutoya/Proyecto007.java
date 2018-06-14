package tutoandroidya.app.jesusbremont.com.tutoya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Proyecto007 extends AppCompatActivity {
    TextView tVMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proyecto007);

        tVMensaje=(TextView)findViewById(R.id.tVMensaje);
    }

    public void llamar(View view) {
        tVMensaje.setText("Llamando");
    }
}
