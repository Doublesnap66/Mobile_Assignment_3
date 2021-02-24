package edu.temple.lab_3;

import androidx.appcompat.app.AppCompatActivity;

import edu.temple.lab_3.ImageAdapter;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView dog1 = new TextView(getApplicationContext());
        TextView[] arraySpinner = new TextView[]{
            dog1
        };

        Spinner s = findViewById(R.id.spinner);
        ImageAdapter adapter = new ImageAdapter(this, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
    }
}