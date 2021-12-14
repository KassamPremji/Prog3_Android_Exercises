package premji.org.exercice3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import premji.org.exercice3.dao.bd;
import premji.org.exercice3.databinding.ActivityMainBinding;
import premji.org.exercice3.modele.FinalPremji;

public class MainActivity extends AppCompatActivity
{

    private ActivityMainBinding binding;
    private bd bd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        setContentView(view);

        bd =  Room.databaseBuilder(getApplicationContext(), bd.class, "bd")
                .allowMainThreadQueries()
                .build();

        binding.bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insert();
            }
        });

        for(FinalPremji item : bd.dao().list()) {
            Log.i("INSERT", item.nom);
        }
    }

    private void insert()
    {
        try
        {
            FinalPremji item = new FinalPremji();
            item.nom = binding.EditText.getText().toString();
            item.id = bd.dao().insertFinal(item);

            Log.i("INSERT", item.nom);
        }
        catch (Exception e)
        {

        }

    }
}