package edu.temple.lab_3;

import androidx.appcompat.app.AppCompatActivity;

import edu.temple.lab_3.ImageAdapter;
import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image = findViewById(R.id.imageView);
        TextView def = new TextView(this);
        def.setText((CharSequence)"Select a breed:");
        TextView dog1 = new TextView(this);
        dog1.setText((CharSequence)"Labrador");
        TextView dog2 = new TextView(this);
        dog2.setText((CharSequence)"German Shepard");
        TextView dog3 = new TextView(this);
        dog3.setText((CharSequence)"Bulldog");
        TextView dog4 = new TextView(this);
        dog4.setText((CharSequence)"Rottweiler");

        ArrayList<TextView> arraySpinner = new ArrayList<TextView>();
        arraySpinner.add(dog1);
        arraySpinner.add(dog2);
        arraySpinner.add(dog3);
        arraySpinner.add(dog4);

        Spinner s = findViewById(R.id.spinner);
        ImageAdapter adapter = new ImageAdapter(this, arraySpinner);
        s.setAdapter(adapter);
    }
}