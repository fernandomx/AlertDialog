package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirDialog(View view){


        // instanciar AlertDialog
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        // configurar titulo da mensagem

        dialog.setTitle("Titulo da Dialog");
        dialog.setMessage("mensagem da dialog");

        //configurar cancelamento
        dialog.setCancelable(false);

        //configurar icone da dialog
        dialog.setIcon(android.R.drawable.ic_btn_speak_now);


        // configurar acoes para sim e nao
        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(
                        getApplicationContext(),
                        "Executar acao ao clicar no botão sim",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(
                        getApplicationContext(),
                        "Executar acao ao clicar no botão não",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });


        // criar e exibir AlertDialog
        dialog.create();
        dialog.show();

    }
}
