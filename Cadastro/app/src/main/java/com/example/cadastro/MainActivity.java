package com.example.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference minhaReferencia = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseReference produtos = minhaReferencia.child("cadastro");

        cadastro registro1 = new cadastro();
        registro1.setId("1");
        registro1.setNome("Ana Souza");
        registro1.setTelefone("(51) 2222-3333");
        registro1.setCpf("111.222.333-44");
        registro1.setRg("123987654");
        registro1.setEndereco("Rua das Palmeiras");
        registro1.setNumero("567");
        registro1.setBairro("Jardim Botânico");
        registro1.setComplemento("Bloco C");
        registro1.setEstado("RS");
        registro1.setCidade("Porto Alegre");


        produtos.child("001").setValue(registro1);

        cadastro registro2 = new cadastro();
        registro2.setId("2");
        registro2.setNome("Lúcia Mendes");
        registro2.setTelefone("(62) 9999-0000");
        registro2.setCpf("888.999.000-11");
        registro2.setRg("456789012");
        registro2.setEndereco("Travessa das Oliveiras");
        registro2.setNumero("222");
        registro2.setBairro("Centro");
        registro2.setComplemento("Casa 2");
        registro2.setEstado("GO");
        registro2.setCidade("Goiânia");

        produtos.child("002").setValue(registro2);

        cadastro registro3 = new cadastro();
        registro3.setId("3");
        registro3.setNome("Carlos Oliveira");
        registro3.setTelefone("(41) 7777-8888");
        registro3.setCpf("444.555.666-77");
        registro3.setRg("987123456");
        registro3.setEndereco("Avenida das Estrelas");
        registro3.setNumero("101");
        registro3.setBairro("Estrela do Sul");
        registro3.setComplemento("Apto 10");
        registro3.setEstado("PR");
        registro3.setCidade("Curitiba");

        produtos.child("003").setValue(registro3);

    }
}