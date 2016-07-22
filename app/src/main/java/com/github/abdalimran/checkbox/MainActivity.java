package com.github.abdalimran.checkbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox android, java, opencv;
    private Button showStatus;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android   = (CheckBox) findViewById(R.id.android);
        java      = (CheckBox) findViewById(R.id.java);
        opencv    = (CheckBox) findViewById(R.id.opencv);
        showStatus = (Button) findViewById(R.id.showStatus);

        showStatus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                StringBuffer OUTPUT = new StringBuffer();
                OUTPUT.append("Android : ").append(android.isChecked());
                OUTPUT.append("\nJava : ").append(java.isChecked());
                OUTPUT.append("\nOpenCV : ").append(opencv.isChecked());
                Toast.makeText(getApplicationContext(), OUTPUT.toString(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
