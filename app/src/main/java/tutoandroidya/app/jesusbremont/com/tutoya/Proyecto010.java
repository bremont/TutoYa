package tutoandroidya.app.jesusbremont.com.tutoya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Proyecto010 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proyecto010);
    }

    public void acercaDe(View v) {

        Intent i = new Intent(this, activity_acerca_de.class );
        startActivity(i);

    }
}
