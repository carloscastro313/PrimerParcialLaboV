package com.example.primerparcial.Controllers;

import android.util.Log;
import android.view.View;

import com.example.primerparcial.MainActivity;
import com.example.primerparcial.Models.Usuario;
import com.example.primerparcial.Views.UsuarioView;

public class UsuarioController implements View.OnClickListener {
    Usuario usuario;
    UsuarioView usuarioView;

    public UsuarioController(Usuario usuario){ this.usuario = usuario; }

    public void setView(UsuarioView view){ this.usuarioView = view; }


    @Override
    public void onClick(View view) {
        usuarioView.setModel();
        try{
            if (!this.isValid())
                return;

            MainActivity.usuarioList.set(MainActivity.index, this.usuario);

            this.usuarioView.activity.finish();

        }catch (Exception ex) {
            Log.d("error",ex.getMessage());
        }
    }

    private boolean isValid(){
        return !this.usuario.getTipoUsuario().isEmpty() && !this.usuario.getContraseña().isEmpty() && !this.usuario.getNombre().isEmpty();
    }
}
