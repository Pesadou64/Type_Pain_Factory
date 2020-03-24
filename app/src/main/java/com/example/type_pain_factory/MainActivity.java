package com.example.type_pain_factory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Instanciation
    Button btnCampagne;
    Button btnBaguette;
    Button btnVienoise;
    TextView textPainChoisis;
    ImageView imageView4;
    TextView textCalorie;
    TextView textView11;
    PainFactory PainFactory;
    Pain pain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Initialisation des différentes entités graphique
        btnVienoise = (Button)findViewById(R.id.btn_Viennoise);
        btnCampagne = (Button)findViewById(R.id.btn_Campagne);
        btnBaguette = (Button)findViewById(R.id.btn_Baguette);
        textPainChoisis = (TextView) findViewById(R.id.text_painChoisis);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
        textCalorie = (TextView) findViewById(R.id.text_cal);
        textView11 = (TextView) findViewById(R.id.textView11);

        //Objet Factory intialisé qui va permettre de récupérer le type de pain et de créer un objet
        //de ce type
         PainFactory = new PainFactory();


        //Mise en place des trois evenements différents pour les 3 types de pains
        //Evenement pour le pain de type baguette
        btnBaguette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pain = PainFactory.getPain("BAG"); //Création d'un objet pain de type baguette
                textPainChoisis.setText(new StringBuilder()
                        .append(pain.nom()) //récupération du nom du pain choisis
                        .toString());
                imageView4.setBackgroundResource(R.mipmap.baguette);
                textCalorie.setText("Nombre de calories : ");
                textView11.setText(new StringBuilder().append(pain.calories())); //récupération des calories du pain choisis

            }
        });
        //Evenement pour le pain de type campagne
        btnCampagne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pain = PainFactory.getPain("CAM");//Création d'un objet pain de type campagne
                textPainChoisis.setText(new StringBuilder()
                        .append(pain.nom()) //récupération du nom du pain choisis
                        .toString());
                imageView4.setBackgroundResource(R.mipmap.campagne);
                textCalorie.setText("Nombre de calories : ");
                textView11.setText(new StringBuilder().append(pain.calories()));//récupération des calories du pain choisis
            }
        });
        //Evenement pour le pain de type viennoise
        btnVienoise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pain = PainFactory.getPain("VIE"); //Création d'un objet pain de type viennoise
                textPainChoisis.setText(new StringBuilder()
                        .append(pain.nom())//récupération du nom du pain choisis
                        .toString());
                imageView4.setBackgroundResource(R.mipmap.viennoise);
                textCalorie.setText("Nombre de calories : ");
                textView11.setText(new StringBuilder().append(pain.calories()));//récupération des calories du pain choisis


            }
        });


    }
}