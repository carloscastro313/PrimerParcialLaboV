package com.example.primerparcial.Views;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.primerparcial.Controllers.UsuarioController;
import com.example.primerparcial.Models.Usuario;
import com.example.primerparcial.R;

public class UsuarioView {
    public Activity activity;
    Usuario usuario;
    UsuarioController usuarioController;

    EditText edNombre;
    EditText edContraseña;
    EditText edRepetir;
    RadioGroup rgTipoUsuario;
    Button btnGuardar;

    public UsuarioView(Activity activity, Usuario usuario, UsuarioController usuarioController) {
        this.activity = activity;
        this.usuario = usuario;
        this.usuarioController = usuarioController;
        this.edNombre = activity.findViewById(R.id.etNombre);
        this.edContraseña = activity.findViewById(R.id.etContraseña);
        this.edRepetir = activity.findViewById(R.id.etRepetir);
        this.rgTipoUsuario = activity.findViewById(R.id.rgTipoUsuario);
        this.btnGuardar = activity.findViewById(R.id.btnGuardar);

        this.btnGuardar.setOnClickListener(usuarioController);
    }

    public void setModel(){
        this.usuario.setNombre(edNombre.getText().toString());

        if ((!edRepetir.getText().toString().isEmpty() && !edContraseña.getText().toString().isEmpty()) && edRepetir.getText().toString().equals(edContraseña.getText().toString()) && edContraseña.getText().toString().length() >= 3){
            this.usuario.setContraseña(edContraseña.getText().toString());
        }

        int i = rgTipoUsuario.getCheckedRadioButtonId();
        RadioButton rb = this.activity.findViewById(i);
        if (rb != null){
            this.usuario.setTipoUsuario(rb.getText().toString());
        }
    }

    public void bindModel(){
        this.edNombre.setText(this.usuario.getNombre());
        if (this.usuario.getTipoUsuario().equals("Administrador"))
            this.rgTipoUsuario.check(R.id.rbAdministrador);
        else
            this.rgTipoUsuario.check(R.id.rbUsuario);
    }
}
