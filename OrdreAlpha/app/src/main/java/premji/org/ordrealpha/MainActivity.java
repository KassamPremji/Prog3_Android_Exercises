package premji.org.ordrealpha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    PersonneAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.initRecycler();
        this.remplirRecycler();
    }

    private void remplirRecycler() {
        Personne personne1 = new Personne();
        personne1.nom = "Jean";
        adapter.list.add(personne1);

        Personne personne2 = new Personne();
        personne2.nom = "Alain";
        adapter.list.add(personne2);

        Personne personne3 = new Personne();
        personne3.nom = "Paul";
        adapter.list.add(personne3);

        adapter.notifyDataSetChanged();

        Personne personne4 = new Personne();
        personne4.nom = "John";
        adapter.list.add(personne4);
    }

    private void initRecycler()
    {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        adapter = new PersonneAdapter();
        recyclerView.setAdapter(adapter);
    }
}