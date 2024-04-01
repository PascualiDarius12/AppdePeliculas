package ui;

import android.os.Bundle;
import android.widget.GridLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.moviles.myapplication.R;
import com.moviles.myapplication.databinding.ActivityMainBinding;

import java.util.List;

import modelo.Pelicula;

public class MainActivity extends AppCompatActivity {

    private MainActivityViewModel mv;
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mv = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);
        mv.getmutable().observe(this, new Observer<List<Pelicula>>() {
            @Override
            public void onChanged(List<Pelicula> peliculas) {
               Adapter adapter = new Adapter(peliculas,MainActivity.this,getLayoutInflater());
                GridLayoutManager gl = new GridLayoutManager(MainActivity.this, 2, GridLayoutManager.VERTICAL,false);
                RecyclerView rv = binding.rvPeliculas;
                rv.setLayoutManager(gl);
                rv.setAdapter(adapter);
            }
        });

        mv.crearLista();
    }
}