package com.example.odev1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    Button btngeri,btnileri;
    ImageView resim;
    int sayac=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btngeri=(Button)findViewById(R.id.geributon);
        btnileri=(Button)findViewById(R.id.ileributon);
        resim=(ImageView)findViewById(R.id.imageView);

        int[] resimlerim={R.drawable.resim1,R.drawable.resim2,R.drawable.resim3,R.drawable.resim4,
                R.drawable.resim5,R.drawable.resim6,R.drawable.resim7,R.drawable.resim8,
                R.drawable.resim9,R.drawable.resim10};


        btnileri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sayac>=9){
                    sayac--;
                }
                resim.setImageResource(resimlerim[sayac]);
                sayac++;
            }
        });
        
        btngeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayac=sayac-2;
                if(sayac<=0){
                    resim.setImageResource(resimlerim[0]);
                    sayac=0;
                }
                resim.setImageResource(resimlerim[sayac]);
                sayac=sayac+1;

                }
        });

    }
}