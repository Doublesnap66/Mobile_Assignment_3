package edu.temple.lab_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import edu.temple.lab_3.ImageAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        Resources resources = getResources();

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

        ImageView dog1_img = new ImageView(this);
        dog1_img.setImageDrawable(ResourcesCompat.getDrawable(resources, R.drawable.dog1, getApplicationContext().getTheme()));
        ImageView dog2_img = new ImageView(this);
        dog2_img.setImageDrawable(ResourcesCompat.getDrawable(resources, R.drawable.dog2, getApplicationContext().getTheme()));
        ImageView dog3_img = new ImageView(this);
        dog3_img.setImageDrawable(ResourcesCompat.getDrawable(resources, R.drawable.dog3, getTheme()));
        ImageView dog4_img = new ImageView(this);
        dog4_img.setImageDrawable(ResourcesCompat.getDrawable(resources, R.drawable.dog4, getTheme()));

        ArrayList<TextView> arraySpinner = new ArrayList<TextView>();
        arraySpinner.add(dog1);
        arraySpinner.add(dog2);
        arraySpinner.add(dog3);
        arraySpinner.add(dog4);

        ArrayList<ImageView> picArray = new ArrayList<ImageView>();
        picArray.add(dog1_img);
        picArray.add(dog2_img);
        picArray.add(dog3_img);
        picArray.add(dog4_img);

        Spinner s = findViewById(R.id.spinner);
        ImageAdapter adapter = new ImageAdapter(this, arraySpinner, picArray);
        s.setAdapter(adapter);
        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                image.setImageDrawable();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }
        });
    }
}