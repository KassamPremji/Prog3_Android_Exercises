package com.example.transfertinformationse;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.transfertinformationse.databinding.ActivityMainBinding;
import com.example.transfertinformationse.databinding.ArticleBinding;
import com.example.transfertinformationse.databinding.ContactBinding;

public class Contact extends AppCompatActivity
{
    private ContactBinding binding;

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState)
    {
        super.onPostCreate(savedInstanceState);

        binding = ContactBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }
}
