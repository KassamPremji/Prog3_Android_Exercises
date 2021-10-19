package premji.org.transfertinformations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import premji.org.transfertinformations.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity
{
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.numberPicker.setMinValue(0);
        binding.numberPicker.setMaxValue(10);



        binding.mainBtnArticle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Article.class);
                i.putExtra("nombre", binding.numberPicker.getValue());
                startActivity(i);
            }
        });

        binding.mainBtnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Contact.class);
                startActivity(i);
            }
        });


        String name = getIntent().getStringExtra("Name");
        if(name != null)
        {
            binding.textMain.setText("Bonjour" + name);
        }


    }
}