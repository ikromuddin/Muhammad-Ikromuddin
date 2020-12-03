package simple.example.buah;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import simple.example.buah.model.Buah;

public class GaleryActiviry extends AppCompatActivity {

    List<Buah> buahs;
    int indeksTampil = 0;
    String jenisBuah;
    Button btnPertama,btnTerakhir,btnSebelumnya,btnBerikutnya;
    TextView txJenis,txNama,txAsal,txDeskripsi,txJudul;
    ImageView ivFotoHewan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galery_activiry);
        Intent intent = getIntent();
        jenisBuah = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        buahs = DataProvider.getBuahByTipe (this,jenisBuah);
        inisialisasiView();
        tampilkanProfil();
    }

    private void inisialisasiView() {
        btnPertama = findViewById(R.id.btnPertama);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);
        btnBerikutnya = findViewById(R.id.btnBerikutnya);
        btnTerakhir = findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> buahPertama ());
        btnTerakhir.setOnClickListener(view -> buahTerakhir ());
        btnSebelumnya.setOnClickListener(view -> buahSebulumnya ());
        btnBerikutnya.setOnClickListener(view -> buahBerikutnya ());

        txJenis = findViewById(R.id.txJenis);
        txNama = findViewById(R.id.txNama);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoHewan = findViewById(R.id.gambarBuah);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Ras "+jenisBuah);
    }


    private void tampilkanProfil() {
        Buah k = buahs.get(indeksTampil);
        Log.d("Kuning","Menampilkan anjing "+k.getJenis());
        txJenis.setText(k.getJenis());
        txNama.setText(k.getNama ());
        txDeskripsi.setText(k.getDeskripsi());
        ivFotoHewan.setImageDrawable(this.getDrawable(k.getDrawableRes()));
    }

    private void buahPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfil();
        }
    }

    private void buahTerakhir() {
        int posAkhir = buahs.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfil();
        }
    }

    private void buahBerikutnya() {
        if (indeksTampil == buahs.size() - 1) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfil();
        }
    }

    private void buahSebulumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfil();
        }
    }
}