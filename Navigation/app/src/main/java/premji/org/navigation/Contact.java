package premji.org.navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import premji.org.navigation.databinding.ActivityMainBinding;
import premji.org.navigation.databinding.ContactBinding;

public class Contact extends AppCompatActivity
{
    private ContactBinding binding;

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState)
    {
        super.onPostCreate(savedInstanceState);
        setTitle("Contact");

        binding = ContactBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.contactBtnAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Contact.this, MainActivity.class);
                startActivity(i);
            }
        });



    }
}
