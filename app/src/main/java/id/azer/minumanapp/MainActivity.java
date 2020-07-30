package id.azer.minumanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout,linearLayout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.rush);
        linearLayout1 = findViewById(R.id.relax);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),DetailActivity.class);
                in.putExtra("nama1","Ginger Rush");
                in.putExtra("harga1", "Rp. 27.000");
                in.putExtra("imageData",R.drawable.minum2d);
                in.putExtra("singkat","Perpaduan teh hijau dengan teh");
                in.putExtra("deskripsi","Minuman jahe, seperti teh jahe atau susu jahe, memang sangat dikenal bermanfaat untuk menghangatkan perut serta mengatasi berbagai keluhan pada perut dan pencernaan, terutama mual. Tanaman ini juga dikenal memiliki kandungan antibiotik alami.");
                startActivity(in);
                finish();
            }
        });

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),DetailActivity.class);
                in.putExtra("nama1","Relax Green");
                in.putExtra("harga1", "Rp. 25.000");
                in.putExtra("imageData",R.drawable.minum1d);
                in.putExtra("singkat","Perpaduan teh hijau dengan gula madu");
                in.putExtra("deskripsi","Minuman jahe, seperti teh jahe atau susu jahe, memang sangat dikenal bermanfaat untuk menghangatkan perut serta mengatasi berbagai keluhan pada perut dan pencernaan, terutama mual. Tanaman ini juga dikenal memiliki kandungan antibiotik alami.");
                startActivity(in);
                finish();
            }
        });
    }
}