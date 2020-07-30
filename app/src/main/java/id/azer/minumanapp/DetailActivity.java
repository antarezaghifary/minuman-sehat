package id.azer.minumanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    Button button;
    TextView nama,harga,singkat,deskripsi;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        button = findViewById(R.id.back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("tezt","tezt");
                Intent in = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(in);
                finish();
            }
        });

        nama = findViewById(R.id.nama);
        harga = findViewById(R.id.harga);
        imageView = findViewById(R.id.image);
        singkat = findViewById(R.id.singkat);
        deskripsi = findViewById(R.id.deskripsi);

        if(getIntent().getExtras()!=null){
            /**
             * Jika Bundle ada, ambil data dari Bundle
             */
            Bundle bundle = getIntent().getExtras();
            nama.setText(bundle.getString("nama1"));
            harga.setText(bundle.getString("harga1"));
            imageView.setImageResource(getIntent().getIntExtra("imageData",0));
            singkat.setText(bundle.getString("singkat"));
            deskripsi.setText(bundle.getString("deskripsi"));
        }else{
            /**
             * Apabila Bundle tidak ada, ambil dari Intent
             */
            nama.setText(getIntent().getStringExtra("nama1"));
            harga.setText(getIntent().getStringExtra("harga1"));
            imageView.setImageResource(getIntent().getIntExtra("imageData",0));
            singkat.setText(getIntent().getStringExtra("singkat"));
            deskripsi.setText(getIntent().getStringExtra("deskripsi"));
        }
    }
}