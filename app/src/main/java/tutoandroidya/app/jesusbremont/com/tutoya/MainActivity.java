package tutoandroidya.app.jesusbremont.com.tutoya;

import android.content.Intent;
import android.opengl.EGLExt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lVProyectos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Enlazamos las Variabels
        String[] lstProyectos = new String[]{
                "Proyecto 001", "Proyecto 002","Proyecto 003","Proyecto 004",
                "Proyecto 005", "Proyecto 006", "Proyecto 007", "Proyecto 008",
                "Proyecto 009","Proyecto 010","Proyecto 011", "Proyecto 012"
        };
        lVProyectos = (ListView) findViewById(R.id.lVProyectos);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lstProyectos);
        lVProyectos.setAdapter(adaptador);

        //Llmamamos el Iteme Listener
        lVProyectos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Toast.makeText(getApplicationContext(), "Posicion:" + position, Toast.LENGTH_SHORT).show();
                Intent i;
                switch (position) {
                    case 1:
                        i = new Intent(MainActivity.this, Proyecto002.class);
                        startActivity(i);
                        break;
                    case 2:
                        i = new Intent(MainActivity.this, Proyecto003.class);
                        startActivity(i);
                        break;
                    case 3:
                        i = new Intent(MainActivity.this, Proyecto004.class);
                        startActivity(i);
                        break;
                    case 4:
                        i = new Intent(MainActivity.this, Proyecto005.class);
                        startActivity(i);
                        break;
                    case 5:
                        i = new Intent(MainActivity.this, Proyecto006.class);
                        startActivity(i);
                        break;
                    case 6:
                        i = new Intent(MainActivity.this, Proyecto007.class);
                        startActivity(i);
                        break;
                    case 7:
                        i = new Intent(MainActivity.this, Proyecto008.class);
                        startActivity(i);
                        break;
                    case 8:
                        i = new Intent(MainActivity.this, Proyecto009.class);
                        startActivity(i);
                        break;
                    case 9:
                        i = new Intent(MainActivity.this, Proyecto010.class);
                        startActivity(i);
                        break;
                    case 10:
                        i = new Intent(MainActivity.this, Proyecto011.class);
                        startActivity(i);
                        break;
                    case 11:
                        i = new Intent(MainActivity.this, Proyecto012.class);
                        startActivity(i);
                        break;



                }
            }
        });
    }
}
