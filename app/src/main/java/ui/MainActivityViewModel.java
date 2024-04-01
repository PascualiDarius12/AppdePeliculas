package ui;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.moviles.myapplication.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import modelo.Pelicula;

public class MainActivityViewModel extends AndroidViewModel {
    private MutableLiveData<List<Pelicula>> mutable;


    public MainActivityViewModel(@NonNull Application application) {
        super(application);
    }
    public LiveData<List<Pelicula>> getmutable(){
        if(mutable == null){
            mutable = new MutableLiveData<>();
        }
        return mutable;
    }

    public void crearLista(){
        ArrayList<Pelicula> lista = new ArrayList<>();
        lista.add(new Pelicula("Dune","Paul Atreides se une a Chani y a los Fremen mientras busca venganza contra los conspiradores que destruyeron a su familia. Paul se enfrenta a una elección entre el amor de su vida y el destino del universo, y debe evitar un futuro terrible.","Denis Villeneuve", "Timothée Chalamet,Zandalla,etc.", R.drawable.peli1));
        lista.add((new Pelicula("La Monja","Una monja se suicida en una abadía rumana y el Vaticano envía a un sacerdote y una novicia a investigar lo sucedido. Lo que ambos encuentran allá es un secreto perverso que los enfrentará cara a cara con el mal en su esencia más pura.", "Corin Hardy", "Taissa Farmiga, Bonnie Aarons, etc.", R.drawable.peli4)));
        lista.add((new Pelicula("Oppenheimer", "Durante la Segunda Guerra Mundial, el teniente general Leslie Groves designa al físico J. Robert Oppenheimer para un grupo de trabajo que está desarrollando el Proyecto Manhattan, cuyo objetivo consiste en fabricar la primera bomba atómica.", "Christopher Nolan", "Cillian Murphy, Emily Blunt, etc.",R.drawable.peli3)));
        lista.add((new Pelicula("Godzilla vs kong","Godzilla y Kong, dos de las fuerzas más poderosas de un planeta habitado por aterradoras criaturas, se enfrentan en un espectacular combate que sacude los cimientos de la humanidad.", "Adam Wingard","Alexander Skarsgård, Millie Bobby Brown, etc.", R.drawable.peli2)));
        mutable.setValue(lista);
    }

}
