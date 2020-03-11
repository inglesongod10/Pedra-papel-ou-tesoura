package com.example.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
        public void selecionarPedra(View view){
            this.opcaoSelecionada("Pedra");
    }
        public void SelecionarPapel(View view){
            this.opcaoSelecionada("Papel");
    }
        public void SelecionarTesoura(View view) {
            this.opcaoSelecionada("Tesoura");

    }
        public void opcaoSelecionada(String escolhaUsuario){
                    System.out.println( escolhaUsuario);

            ImageView imagemResultado = (ImageView) findViewById(R.id.imageResultado);
            TextView textoResultado = (TextView) findViewById(R.id.textResultado);

             // gerar um número aleatório para a escolha do app

            String[] opcoes = {"Pedra", "Papel", "Tesoura"};
            int numero = new Random().nextInt(3);
            String escolhaApp = opcoes[numero];

            switch (escolhaApp){
                case "Pedra":
                    imagemResultado.setImageResource(R.drawable.pedra);
                    break;
                case "Papel":
                    imagemResultado.setImageResource(R.drawable.papel);
                    break;
                case "Tesoura":
                    imagemResultado.setImageResource(R.drawable.tesoura);
                    break;
            }
            if (
                    (escolhaApp =="Pedra" && escolhaUsuario =="Tesoura") ||
                    (escolhaApp =="Papel" && escolhaUsuario =="Pedra") ||
                    (escolhaApp =="Tesoura" && escolhaUsuario == "Papel")
            ){ // Se o app for ganhador
                textoResultado.setText(" Você Perdeu! ");

            }else if (

                    (escolhaUsuario =="Pedra" && escolhaApp =="Tesoura") ||
                            (escolhaUsuario =="Papel" && escolhaApp =="Pedra") ||
                            (escolhaUsuario =="Tesoura" && escolhaApp == "Papel")
            ){// Se o usuário for ganhador
                textoResultado.setText(" Você Ganhou !!! ");

                }else{//Empate
                textoResultado.setText(" Empatou !!! ");

                }
            }

            }

