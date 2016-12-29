package me.personal.memorylane;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstYearActivity extends AppCompatActivity {
    Button previous;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_year);

        previous = (Button) findViewById(R.id.btn_previous);
        previous.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(FirstYearActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
        next = (Button) findViewById(R.id.btn_next);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(FirstYearActivity.this,SecondYearActivity.class);
                startActivity(i);
            }
        });
    }
}
