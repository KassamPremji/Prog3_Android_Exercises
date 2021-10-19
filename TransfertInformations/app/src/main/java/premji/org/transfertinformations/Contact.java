package premji.org.transfertinformations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import premji.org.transfertinformations.databinding.ActivityContactBinding;
import premji.org.transfertinformations.databinding.ActivityMainBinding;

public class Contact extends AppCompatActivity {

    private ActivityContactBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        binding = ActivityContactBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        setTitle("Contact");

        binding.contactBtnAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Contact.this, MainActivity.class);
                i.putExtra("Name", binding.Name.getText());

                startActivity(i);
            }
        });
    }
}