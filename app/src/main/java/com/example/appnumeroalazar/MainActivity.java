package com.example.appnumeroalazar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.appnumeroalazar.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inflate the layout for this fragment
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        num = (int)(Math.random()*100001);
        String cadena = String.valueOf(num);
        Toast notificacion = Toast.makeText(this, cadena, Toast.LENGTH_LONG);
        notificacion.show();

        binding.controlar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valorIngresado = binding.edtN.getText().toString();
                int valor=Integer.parseInt(valorIngresado);
                if (valor==num) {
                    Toast.makeText(MainActivity.this, "Muy bien recordaste el número mostrado", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Lo siento pero no es el número que se mostro", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }


}