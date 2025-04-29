package br.com.valorcerto.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {
    private PrimeiroFragment adaptador;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        adaptador = new PrimeiroFragment(getSupportFragmentManager());
        viewPager = findViewById(R.id.atividade);
        setupViewPager(viewPager);

    }
    protected void setupViewPager(ViewPager viewPager){
        PrimeiroFragment adaptador = new PrimeiroFragment(getSupportFragmentManager());
        adaptador.AddFragment(new Fragment1(), "Fragment 1");
        adaptador.AddFragment(new Fragment2(), "Fragment 2");
        viewPager.setAdapter(adaptador);
    }
    public void setViewPager(int num){
        viewPager.setCurrentItem(num);
    }
}