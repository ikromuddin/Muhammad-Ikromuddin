package simple.example.buah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    ImageButton btnKunig,btnMerah,btnHijau;
    public static final String JENIS_GALERI_KEY = "GALERY_BUAH";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnHijau = findViewById(R.id.btn_buah_hijau);
        btnKunig = findViewById(R.id.btn_buah_kuning);
        btnMerah = findViewById(R.id.btn_buka_merah);
        btnMerah.setOnClickListener(view -> bukaGaleri("Merah"));
        btnKunig.setOnClickListener(view -> bukaGaleri("Kuning"));
        btnHijau.setOnClickListener(view -> bukaGaleri("Hijau"));
    }

    private void bukaGaleri(String warnaBuah) {
        Log.d("MAIN","Buka activity buah kuning");
        Intent intent = new Intent(this, GaleryActiviry.class);
        intent.putExtra(JENIS_GALERI_KEY, warnaBuah);
        startActivity(intent);
    }

}