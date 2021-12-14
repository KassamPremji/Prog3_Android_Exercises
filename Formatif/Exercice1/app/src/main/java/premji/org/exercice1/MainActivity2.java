package premji.org.exercice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import premji.org.exercice1.databinding.ActivityMain2Binding;
import premji.org.exercice1.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity
{

    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        setContentView(view);
    }
}