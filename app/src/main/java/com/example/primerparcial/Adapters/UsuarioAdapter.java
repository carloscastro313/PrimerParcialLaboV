package com.example.primerparcial.Adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.primerparcial.Holders.UsuarioViewHolder;
import com.example.primerparcial.Models.Usuario;
import com.example.primerparcial.R;

import java.util.List;

public class UsuarioAdapter extends RecyclerView.Adapter<UsuarioViewHolder> {

    List<Usuario> usuarioList;
    Activity activity;

    public UsuarioAdapter(List<Usuario> usuarioList, Activity activity) {
        this.usuarioList = usuarioList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public UsuarioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_usuario,parent,false);

        return new UsuarioViewHolder(v,this.activity);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioViewHolder holder, int position) {
        Usuario u = this.usuarioList.get(position);

        holder.setUsuario(u,position);

        TextView tvNombre = holder.itemView.findViewById(R.id.tvNombre);
        TextView tvTipoUsuario = holder.itemView.findViewById(R.id.tvTipoUsuario);
        Button button = holder.itemView.findViewById(R.id.btnVer);

        tvNombre.setText(u.getNombre());
        tvTipoUsuario.setText(u.getTipoUsuario());
        button.setOnClickListener(holder);
    }

    @Override
    public int getItemCount() {
        return this.usuarioList.size();
    }
}
