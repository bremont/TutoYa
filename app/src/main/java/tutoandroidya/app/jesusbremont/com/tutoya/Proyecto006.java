package tutoandroidya.app.jesusbremont.com.tutoya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Proyecto006 extends AppCompatActivity {

    private String[] paises = {"Argentina", "Chile", "Paraguay", "Bolivia", "Peru", "Ecuador", "Brasil", "Colombia", "Venezuela", "Uruguay"};
    private String[] habitantes = {"40000000", "17000000", "6500000", "10000000", "30000000", "14000000", "183000000", "44000000", "29000000", "3500000"};

    TextView tVResultado;
    ListView lVPaises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proyecto006);

        //Cargamos los controloes
        tVResultado = (TextView) findViewById(R.id.tVResultado);
        lVPaises = (ListView) findViewById(R.id.lVPaises);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paises);
        lVPaises.setAdapter(adapter);
        lVPaises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                tVResultado.setText("Población de " + lVPaises.getItemAtPosition(i) + " es " + habitantes[i]);
            }
        });
    }
}
