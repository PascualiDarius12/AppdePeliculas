package ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.moviles.myapplication.R;
import com.moviles.myapplication.databinding.ActivityMainBinding;
import com.moviles.myapplication.databinding.ActivitySegundaBinding;

import modelo.Pelicula;

public class SegundaActivity extends AppCompatActivity {

    private SegundaActivityViewModel vm;
    private ActivitySegundaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySegundaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        vm = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(SegundaActivityViewModel.class);

        vm.getmutable().observe(this, new Observer<Pelicula>() {
            @Override
            public void onChanged(Pelicula pelicula) {
                TextView titulo = binding.tvTitulo;
                TextView director = binding.tvDirector;
                TextView actor = binding.tvActor;
                TextView resumen = binding.tvResumen;
                ImageView foto = binding.ivImagen;

                titulo.setText(pelicula.getTitulo());
                director.setText(pelicula.getDirector());
                actor.setText(pelicula.getActor());
                resumen.setText(pelicula.getResumen());
                foto.setImageResource(pelicula.getImagen());


            }
        });


        vm.recuperarPeli(getIntent());
        Button volver = binding.btnVolver;

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
       
    }
}