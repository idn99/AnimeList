package com.idn99.project.nekuku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Typeface;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Data> data = new ArrayList<>();
    private RecyclerAdapter recyclerAdapter;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateData();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle("Nekuku");

        collapsingToolbarLayout.setCollapsedTitleTextColor(ContextCompat.getColor(this, R.color.white));
        collapsingToolbarLayout.setExpandedTitleColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));

        int jmlKolom = 1;
        recyclerAdapter = new RecyclerAdapter(data, getApplicationContext());
        rv = findViewById(R.id.recycler_view_home);
        rv.setLayoutManager(new GridLayoutManager(getApplicationContext(), jmlKolom));
        rv.setAdapter(recyclerAdapter);


    }

    public void generateData(){

        ArrayList<Karakter> kny = new ArrayList<>();
        kny.add(new Karakter(R.drawable.tanjiro, "Kamado Tanjirou"));
        kny.add(new Karakter(R.drawable.nezuko, "Kamado Nezuko"));
        kny.add(new Karakter(R.drawable.zenitsu, "Agatsuma Zenitsu"));
        kny.add(new Karakter(R.drawable.inosuke, "Hashibira Inosuke"));
        kny.add(new Karakter(R.drawable.giyuu, "Tomioka Giyuu"));
        kny.add(new Karakter(R.drawable.shinobu, "Khocou Shinobu"));
        kny.add(new Karakter(R.drawable.kanao, "Tsuyuri Kanao"));
        kny.add(new Karakter(R.drawable.rengoku, "Rengoku Kyoujurou"));
        kny.add(new Karakter(R.drawable.mitsuri, "Kanjori Mitsuri"));
        kny.add(new Karakter(R.drawable.tokitou, "Tokitou Muichirou"));


        ArrayList<Karakter> tate = new ArrayList<>();
        tate.add(new Karakter(R.drawable.noufumi, "Naufumi Iwatani"));
        tate.add(new Karakter(R.drawable.raphtalia, "Raphtalia-chan"));
        tate.add(new Karakter(R.drawable.fillo, "Fillo-chan"));
        tate.add(new Karakter(R.drawable.tate_glass, "Glass"));
        tate.add(new Karakter(R.drawable.tate_melty, "Melty Malromarc"));
        tate.add(new Karakter(R.drawable.tate_mirelia, "Mirelia Malromarc"));
        tate.add(new Karakter(R.drawable.tate_ren, "Amaki Ren"));
        tate.add(new Karakter(R.drawable.tate_itsuki, "Itsuki Kawasumi"));
        tate.add(new Karakter(R.drawable.tate_malty, "Malty Malromarc"));


        ArrayList<Karakter> bnha = new ArrayList<>();
        bnha.add(new Karakter(R.drawable.midoriya, "Midoriya Izuku"));
        bnha.add(new Karakter(R.drawable.uraraka, "Uraraka Ochacho"));
        bnha.add(new Karakter(R.drawable.shouto, "Shoto Todoroki"));
        bnha.add(new Karakter(R.drawable.bnh_mirio, "Mirio Toogata"));
        bnha.add(new Karakter(R.drawable.bnh_bakugo, "Bakugou Katsuki"));
        bnha.add(new Karakter(R.drawable.bnh_allmight, "All Might"));
        bnha.add(new Karakter(R.drawable.bnh_asui, "Asui Tsuyu"));
        bnha.add(new Karakter(R.drawable.bnh_aizawa, "Aizawa Shouta"));
        bnha.add(new Karakter(R.drawable.bnh_himiko, "Toga Himiko"));

        ArrayList<Karakter> drstone = new ArrayList<>();
        drstone.add(new Karakter(R.drawable.drs_senkuu, "Senkuu"));
        drstone.add(new Karakter(R.drawable.drs_kuhaku, "Kohaku"));
        drstone.add(new Karakter(R.drawable.drs_chrome, "Chrome"));
        drstone.add(new Karakter(R.drawable.drs_tsukasa, "Tsukasa Shishiou"));
        drstone.add(new Karakter(R.drawable.drs_taiju, "Ooki Taiju"));
        drstone.add(new Karakter(R.drawable.drs_asagiri, "Asagiri Gen"));
        drstone.add(new Karakter(R.drawable.drs_suika, "Suika"));
        drstone.add(new Karakter(R.drawable.drs_yuzuriha, "Yuzuriha Ogawa"));
        drstone.add(new Karakter(R.drawable.drs_ruri, "Ruri"));

        ArrayList<Karakter> yakusoku = new ArrayList<>();
        yakusoku.add(new Karakter(R.drawable.yakusoku_emma, "Emma"));
        yakusoku.add(new Karakter(R.drawable.yakusoku_ray, "Ray"));
        yakusoku.add(new Karakter(R.drawable.yakusoku_norman, "Norman"));
        yakusoku.add(new Karakter(R.drawable.yakusoku_phil, "Phil"));
        yakusoku.add(new Karakter(R.drawable.yakusoku_isabella, "Isabella"));
        yakusoku.add(new Karakter(R.drawable.yakusoku_krone, "Sister Krone"));
        yakusoku.add(new Karakter(R.drawable.yakusoku_gilda, "Gilda"));
        yakusoku.add(new Karakter(R.drawable.yakusoku_don, "Don"));
        yakusoku.add(new Karakter(R.drawable.yakusoku_conny, "Conny"));

        ArrayList<Karakter> oresuki = new ArrayList<>();
        oresuki.add(new Karakter(R.drawable.ore_sumireko, "Sumireko Sanshokuin"));
        oresuki.add(new Karakter(R.drawable.ore_kisaragi, "Kisaragi Amatsuyu"));
        oresuki.add(new Karakter(R.drawable.ore_sakura, "Akino Sakura"));
        oresuki.add(new Karakter(R.drawable.ore_hinata, "Hinata Aoi"));
        oresuki.add(new Karakter(R.drawable.ore_mayama, "Mayama Asaka"));
        oresuki.add(new Karakter(R.drawable.ore_hina, "Hanetachi Hina"));
        oresuki.add(new Karakter(R.drawable.ore_youki, "Youki Chiharu"));
        oresuki.add(new Karakter(R.drawable.ore_ooga, "Ooga Taiyou"));
        oresuki.add(new Karakter(R.drawable.ore_kamata, "Kamata Kimie"));

        ArrayList<Karakter> enen = new ArrayList<>();
        enen.add(new Karakter(R.drawable.enen_sinra, "Kusakabe Shinra"));
        enen.add(new Karakter(R.drawable.enen_irish, "Irish"));
        enen.add(new Karakter(R.drawable.enen_tamaki, "Tamaki Kotatsu"));
        enen.add(new Karakter(R.drawable.enen_maki, "Oze Maki"));
        enen.add(new Karakter(R.drawable.enen_artur, "Boyle Arthur"));
        enen.add(new Karakter(R.drawable.enen_obi, "Oubi Akitaru"));
        enen.add(new Karakter(R.drawable.enen_benimaru, "Shinmon Benimaru"));
        enen.add(new Karakter(R.drawable.enen_hibana, "Hibana Princess"));
        enen.add(new Karakter(R.drawable.enen_joker, "Joker"));

        ArrayList<Karakter> opm = new ArrayList<>();
        opm.add(new Karakter(R.drawable.opm_saitama, "Saitama"));
        opm.add(new Karakter(R.drawable.opm_genos, "Genos"));
        opm.add(new Karakter(R.drawable.opm_garo, "Garou"));
        opm.add(new Karakter(R.drawable.opm_tatsumaki, "Tatsumaki"));
        opm.add(new Karakter(R.drawable.opm_silverfang, "Silver Fang"));
        opm.add(new Karakter(R.drawable.opm_sonik, "Sonic"));
        opm.add(new Karakter(R.drawable.opm_fubuki, "Fubuki"));
        opm.add(new Karakter(R.drawable.opm_king, "King"));
        opm.add(new Karakter(R.drawable.opm_puri, "Puripuri Prisoner"));

        ArrayList<Karakter> snk = new ArrayList<>();
        snk.add(new Karakter(R.drawable.snk_eren, "Eren Jeager"));
        snk.add(new Karakter(R.drawable.snk_mikasa, "Mikasa Ackerman"));
        snk.add(new Karakter(R.drawable.snk_levi, "Levi Ackerman"));
        snk.add(new Karakter(R.drawable.snk_armin, "Armin Arlert"));
        snk.add(new Karakter(R.drawable.snk_erwin, "Erwin Smith"));
        snk.add(new Karakter(R.drawable.snk_hanji, "Zoe Hange"));
        snk.add(new Karakter(R.drawable.snk_sasa, "Sasha Blouse"));
        snk.add(new Karakter(R.drawable.snk_jean, "Jean Kirstein"));
        snk.add(new Karakter(R.drawable.snk_historia, "Historia Reis"));


        data.add(new Data(R.drawable.kny, "Kimetsu no Yaiba", "Summer 2019","Deskripsi Kimetsu", getString(R.string.kny), kny));
        data.add(new Data(R.drawable.tate, "Tate no Yuusha", "Winter 2019","Deskripsi Kimetsu", getString(R.string.tate), tate));
        data.add(new Data(R.drawable.bnh, "My Hero Acadamia 4th", "Fall 2019","Deskripsi Kimetsu", getString(R.string.bnha), bnha));
        data.add(new Data(R.drawable.yakusoku, "Promise Neverland", "Fall 2019","Deskripsi Yakusoku",getString(R.string.yakusoku),yakusoku));
        data.add(new Data(R.drawable.opm, "One Punchman 2nd", "Fall 2019","Deskripsi Yakusoku",getString(R.string.opm),opm));
        data.add(new Data(R.drawable.drs, "Dr. Stone", "Fall 2019","Deskripsi Yakusoku",getString(R.string.drstone),drstone));
        data.add(new Data(R.drawable.enen, "Enen no Shoubutai", "Fall 2019","Deskripsi Yakusoku",getString(R.string.enen),enen));
        data.add(new Data(R.drawable.oresuki, "Oresuki", "Fall 2019","Deskripsi Yakusoku",getString(R.string.oresuki),oresuki));
        data.add(new Data(R.drawable.snk, "Attack on Titan 3P2", "Fall 2019","Deskripsi Yakusoku",getString(R.string.snk), snk));

    }
}
