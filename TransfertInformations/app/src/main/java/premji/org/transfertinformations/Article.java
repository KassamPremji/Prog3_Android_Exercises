package premji.org.transfertinformations;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import premji.org.transfertinformations.databinding.ActivityMainBinding;
import premji.org.transfertinformations.databinding.ArticleBinding;

public class Article extends AppCompatActivity
{
    private ArticleBinding binding;

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState)
    {
        super.onPostCreate(savedInstanceState);
        String nb = String.valueOf(getIntent().getIntExtra("nombre", 0));

        setTitle("Article #" + nb);

        binding = ArticleBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.articleBtnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Article.this, Contact.class);
                startActivity(i);
            }
        });
    }
}
