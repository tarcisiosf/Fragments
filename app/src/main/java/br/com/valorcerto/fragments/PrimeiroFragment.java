package br.com.valorcerto.fragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PrimeiroFragment extends FragmentStatePagerAdapter{
    private final List<Fragment> lista = new ArrayList<>();
    private final List<String> nomes = new ArrayList<>();
    public PrimeiroFragment(@NonNull FragmentManager fm) {
        super(fm);
    }

    public void AddFragment(Fragment fragment, String txt){
        lista.add(fragment);
        nomes.add(txt);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return lista.get(position);
    }

    @Override
    public int getCount() {
        return lista.size();
    }
}
