package com.idn99.project.nekuku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Deskripsi extends AppCompatActivity {
    private ImageView img;
    private TextView tv1,tv2,tv3;
    private RecyclerView rv;
    private ArrayList<Karakter> karakters = new ArrayList<>();
    private KarakterAdapter karakterAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);

        Data data = getIntent().getParcelableExtra("data" );
        karakters = data.getKarakters();
        img = findViewById(R.id.image_des);
        tv1 = findViewById(R.id.tv1_des);
        tv2 = findViewById(R.id.tv2_des);
        tv3 = findViewById(R.id.tv3_des);
        rv = findViewById(R.id.recycler_view_karakter);

        img.setImageResource(data.getGambarData());
        tv1.setText(data.getMusimData());
        tv2.setText(data.getJudulData());
        tv3.setText(data.getSinopsisData());

        karakterAdapter = new KarakterAdapter(karakters, getApplicationContext());
        rv.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
        rv.setAdapter(karakterAdapter);
        ViewCompat.setNestedScrollingEnabled(rv, false);

    }
}
