package com.example.primerparcial.Holders;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.primerparcial.EditarActivity;
import com.example.primerparcial.MainActivity;
import com.example.primerparcial.Models.Usuario;

public class UsuarioViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    Usuario usuario;
    int index;
    Activity activity;

    public UsuarioViewHolder(@NonNull View itemView,Activity activity) {
        super(itemView);
        this.activity = activity;
    }

    public void setUsuario(Usuario usuario, int index){
        this.usuario = usuario;
        this.index = index;
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(this.activity, EditarActivity.class);

        MainActivity.index = index;

        i.putExtra("editar",this.usuario);

        this.activity.startActivity(i);
    }
}
