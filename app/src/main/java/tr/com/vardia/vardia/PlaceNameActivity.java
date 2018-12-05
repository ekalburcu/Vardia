package tr.com.vardia.vardia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class PlaceNameActivity extends AppCompatActivity {

    EditText baslikkText,tarihhText,saattText,ilceeText,pozisyonnText,kiyafettText,ucrettText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_name);
    }


    Globals globalBaslik = Globals.getInstance();
    Globals globalTarih = Globals.getInstance();
    Globals globalSaat = Globals.getInstance();
    Globals globalIlce = Globals.getInstance();
    Globals globalPozisyon = Globals.getInstance();
    Globals globalKiyafet = Globals.getInstance();
    Globals globalUcret = Globals.getInstance();

    public void sonraki (View view){

       baslikkText = findViewById(R.id.baslikText);
       tarihhText = findViewById(R.id.tarihText);
       saattText = findViewById(R.id.saatText);
       ilceeText = findViewById(R.id.ilceText);
       pozisyonnText = findViewById(R.id.pozisyonText);
       kiyafettText = findViewById(R.id.kiyafetText);
       ucrettText = findViewById(R.id.ucretText);

       globalBaslik.setBaslik(baslikkText.toString());
       globalTarih.setTarih(tarihhText.toString());
       globalSaat.setSaat(saattText.toString());
       globalIlce.setIlce(ilceeText.toString());
       globalPozisyon.setPozisyon(pozisyonnText.toString());
       globalKiyafet.setKiyafet(kiyafettText.toString());
       globalUcret.setUcret(ucrettText.toString());

        Intent intent = new Intent(getApplicationContext(),HaritaActivity.class);
        startActivity(intent);

    }

}
