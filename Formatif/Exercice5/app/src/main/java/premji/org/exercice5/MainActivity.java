package premji.org.exercice5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import premji.org.exercice5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity
{
    int nombre = 0;
    adapter adapter;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        setContentView(view);

        initRecycler();

        binding.ajouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                nombre++;
                Compteur compteur = new Compteur();
                compteur.nombre = nombre;
                adapter.list.add(compteur);
                adapter.notifyDataSetChanged();
            }
        });
    }

    private void initRecycler(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(false);

        // use a linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        adapter = new adapter();
        recyclerView.setAdapter(adapter);
    }
}