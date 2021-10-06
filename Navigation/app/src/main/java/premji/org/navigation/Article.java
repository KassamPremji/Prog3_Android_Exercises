package premji.org.navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import premji.org.navigation.databinding.ArticleBinding;
import premji.org.navigation.databinding.ContactBinding;

public class Article extends AppCompatActivity
{
    private ArticleBinding binding;


    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setTitle("Article");

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
