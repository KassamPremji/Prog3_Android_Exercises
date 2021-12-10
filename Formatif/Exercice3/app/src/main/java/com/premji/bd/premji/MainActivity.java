package com.premji.bd.premji;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.premji.bd.premji.dao.bd;
import com.premji.bd.premji.databinding.ActivityMainBinding;
import com.premji.bd.premji.modele.FinalPremji;

public class MainActivity extends AppCompatActivity {
    private bd maBD;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                creerFinal(binding.EditText.getText().toString());
            }
        });
    }

    private void creerFinal(String texte) {
            try {
                FinalPremji monFinal = new FinalPremji();
                monFinal.nom = texte;
                monFinal.id = maBD.dao().creerFinal(monFinal);
            } catch (Exception e) {

            }
    }
}