package com.example.primerparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.primerparcial.Controllers.UsuarioController;
import com.example.primerparcial.Models.Usuario;
import com.example.primerparcial.Views.UsuarioView;

public class EditarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle(R.string.editarActivity);

        Intent i = getIntent();

        Bundle extras = i.getExtras();

        Usuario usuario = (Usuario) extras.getSerializable("editar");
        usuario.setContraseña(null);
        UsuarioController usuarioController = new UsuarioController(usuario);
        UsuarioView usuarioView = new UsuarioView(this,usuario,usuarioController);

        usuarioController.setView(usuarioView);

        usuarioView.bindModel();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}