package com.example.primerparcial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.primerparcial.Adapters.UsuarioAdapter;
import com.example.primerparcial.Models.Usuario;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static List<Usuario> usuarioList;
    public static int index = -1;
    static UsuarioAdapter usuarioAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        usuarioList = new ArrayList<Usuario>();

        usuarioList.add(new  Usuario("JPerez1","123","Administrador"));
        usuarioList.add(new  Usuario("JPerez2","123","Usuario"));
        usuarioList.add(new  Usuario("JPerez3","123","Administrador"));
        usuarioList.add(new  Usuario("JPerez4","123","Administrador"));
        usuarioList.add(new  Usuario("JPerez5","123","Usuario"));
        usuarioList.add(new  Usuario("JPerez6","123","Usuario"));
        usuarioList.add(new  Usuario("JPerez7","123","Usuario"));
        usuarioList.add(new  Usuario("JPerez8","123","Usuario"));
        usuarioList.add(new  Usuario("JPerez9","123","Usuario"));
        usuarioList.add(new  Usuario("JPerez10","123","Usuario"));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuarioAdapter = new UsuarioAdapter(usuarioList,this);

        RecyclerView rv = super.findViewById(R.id.rvUsuarios);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(usuarioAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (index == -1)
            return;

        usuarioAdapter.notifyItemChanged(index);

        index = -1;
    }
}