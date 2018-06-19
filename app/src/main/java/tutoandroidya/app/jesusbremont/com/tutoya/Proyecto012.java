package tutoandroidya.app.jesusbremont.com.tutoya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Proyecto012 extends AppCompatActivity {
    EditText eTSitio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proyecto012);

        //Jalamos COntroles
        eTSitio = (EditText) findViewById(R.id.eTSitio);

    }


    public void ver (View v){
        Intent i = new Intent(this,Proyecto012_web.class);
        i.putExtra("direccion",eTSitio.getText().toString());
        startActivity(i);

    }
}
