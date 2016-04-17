package up1.demoandroidn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickMeButton = (Button) findViewById(R.id.clickMeButton);
        clickMeButton.setOnClickListener(view -> {
            makeText(MainActivity.this, "Hello", Toast.LENGTH_LONG).show();
        }
        );

    }
}
