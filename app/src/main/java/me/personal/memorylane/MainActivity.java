package me.personal.memorylane;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    Button go;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       go = (Button) findViewById(R.id.go);


        go.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,FirstYearActivity.class);
                startActivity(i);

            }
        });

    }
}
