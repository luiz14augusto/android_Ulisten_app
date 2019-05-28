package com.e.proj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class VideosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

        ListView lista = findViewById(R.id.listVideo);

        ArrayList<String> video = preencherDados();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,video);
        lista.setAdapter(arrayAdapter);
    }

    private ArrayList<String> preencherDados(){
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Olá");
        dados.add("Oi");
        dados.add("Tudo bem?");
        dados.add("Como está?");
        dados.add("Bom dia");
        dados.add("Bom tarde");
        dados.add("Bom noite");
        dados.add("Tem aula");
        dados.add("Vou para casa");
        dados.add("Olha, que legal");
        dados.add("Como chego na Paulista?");
        dados.add("Quanto custa?");
        dados.add("Até");
        dados.add("Tchau");


        return dados;
    }
}
