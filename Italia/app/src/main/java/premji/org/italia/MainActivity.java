package premji.org.italia;

import androidx.appcompat.app.AppCompatActivity;

import android.accessibilityservice.AccessibilityService;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

import premji.org.italia.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        binding.vert.setHeight(((int)145.7 / 3));
        binding.blanc.setHeight((int)145.7 / 3);
        binding.rouge.setHeight((int)145.7 / 3);
        binding.vert.setWidth((int)69.7 / 3);
        binding.blanc.setWidth((int)69.7 / 3);
        binding.rouge.setWidth((int)69.7 / 3);
        setContentView(binding.getRoot());
    }
}