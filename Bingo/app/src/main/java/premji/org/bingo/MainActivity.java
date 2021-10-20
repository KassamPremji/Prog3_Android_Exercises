package premji.org.bingo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    BingoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecycler();
        remplirRecycler();
    }

    private void remplirRecycler()
    {
        for (int i = 100; i > 0; i--)
        {
            Bingo bingo = new Bingo();
            bingo.numeroTirage = "Tirage #" +i;
            int nombreTemp = (1 + (new Random().nextInt(76)));
            bingo.numeroTire = "Numéro tiré : " + nombreTemp;

            if(nombreTemp >= 1 && nombreTemp <= 15)
            {
                bingo.lettre = "B";
            }
            if(nombreTemp >= 16 && nombreTemp <= 30)
            {
                bingo.lettre = "I";
            }
            if(nombreTemp >= 31 && nombreTemp <= 45)
            {
                bingo.lettre = "N";
            }
            if(nombreTemp >= 46 && nombreTemp <= 60)
            {
                bingo.lettre = "G";
            }
            if(nombreTemp >= 61 && nombreTemp <= 75)
            {
                bingo.lettre = "O";
            }
            adapter.list.add(bingo);
        }
        adapter.notifyDataSetChanged();
    }

    private void initRecycler()
    {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        adapter = new BingoAdapter();
        recyclerView.setAdapter(adapter);
    }
}