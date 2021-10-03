package premji.org.tapelelapin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import premji.org.tapelelapin.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    List<Button> boutons = new ArrayList<Button>();
    int positionDuLapin;
    int flops = 0;
    int pafs = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        boutons.add(binding.b1);
        boutons.add(binding.b2);
        boutons.add(binding.b3);
        boutons.add(binding.b4);
        boutons.add(binding.b5);
        boutons.add(binding.b6);
        boutons.add(binding.b7);
        boutons.add(binding.b8);
        boutons.add(binding.b9);

        bougeLeLapin();

        for(Button b : boutons) {
            b.setOnClickListener(view -> {
                reagirClick(view);
            });
    }


    }

        private void bougeLeLapin()
        {
            for (Button b : boutons)
            {
                b.setText("Taupe");
            }
            Random random = new Random();
            positionDuLapin = random.nextInt(10);
            Button b = boutons.get(positionDuLapin);
            b.setText("Lapin");
        }

    private void reagirClick(View view)
    {
        Button bouttonDuLapin = boutons.get(positionDuLapin);
        if (view == bouttonDuLapin)
        {
            Toast.makeText(getApplicationContext(), "POOF", Toast.LENGTH_SHORT).show();
            pafs++;
            binding.pafs.setText(pafs + " pafs");
            bougeLeLapin();
        }
        else
        {
            Log.i("TAPELAPIN", "Ouch tape une taupe");
            flops++;
            binding.flops.setText(flops + " flops");
        }
    }
}