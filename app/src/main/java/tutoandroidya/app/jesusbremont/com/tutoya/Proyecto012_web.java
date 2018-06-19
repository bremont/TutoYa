package tutoandroidya.app.jesusbremont.com.tutoya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Proyecto012_web extends AppCompatActivity {
    WebView web1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proyecto012_web);

        web1 = (WebView) findViewById(R.id.wVDemo);

        Bundle bundle = getIntent().getExtras();
        String dato = bundle.getString("direccion");
        web1.loadUrl("http://"+dato);
    }
}
